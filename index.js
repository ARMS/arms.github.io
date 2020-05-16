import { EditorState } from "@codemirror/next/state"
import { EditorView } from "@codemirror/next/view"
import { keymap } from "@codemirror/next/keymap"
import { history, redo, redoSelection, undo, undoSelection } from "@codemirror/next/history"
// import { foldCode, unfoldCode, foldGutter } from "@codemirror/next/fold"
import { lineNumbers } from "@codemirror/next/gutter"
import { baseKeymap, indentSelection } from "@codemirror/next/commands"
import { bracketMatching } from "@codemirror/next/matchbrackets"
import { closeBrackets } from "@codemirror/next/closebrackets"
// import { specialChars } from "@codemirror/next/special-chars"
// import { multipleSelections } from "@codemirror/next/multiple-selections"
// import { search, defaultSearchKeymap } from "@codemirror/next/search"
import { autocomplete, startCompletion } from "@codemirror/next/autocomplete"
// import { toggleLineComment, lineComment, lineUncomment, toggleBlockComment } from "@codemirror/next/comment"

import { arms } from "./lang-arms/arms"
import { defaultHighlighter } from "@codemirror/next/highlight"


let isMac = /Mac/.test(navigator.platform)
let state = EditorState.create({
  doc: `# Example of a skid-steer ground vehicle

gv = Model {
    length = cm
    mass = kg
    angle = deg
    up_axis = yaxis
}

wheel_base = 10
track_width = 8
chassis_height = 4

wheel_radius = 3
wheel_width = 1

template WheelAndAxle(name, is_front, is_left, parent) {
    x = is_front ? wheel_base / 2 : -wheel_base / 2
    z = is_left ? -track_width / 2 : track_width / 2
    \`{ name }\` = Ellipsoid {
        size = [wheel_radius, wheel_radius, wheel_width]
        position = [x, 0, z]
        quaternion = identity
        positioning = relative
        parent = parent
    }

    joint_z = z + (is_left ? wheel_width : -wheel_width)
    \`{ name }_axle\` = Revolute {
        axis = [0, 0, 1]
        position = [x, 0, joint_z]
        parent = parent
        child = \`{ name }\`
    }
}

chassis = Cuboid {
    size = [wheel_base, chassis_height, track_width]
    position = [0, wheel_radius, 0]
    quaternion = identity
    positioning = absolute
    parent = none
}

WheelAndAxle(wheel_fl, true, true, chassis)
WheelAndAxle(wheel_fr, true, false, chassis)
WheelAndAxle(wheel_bl, false, true, chassis)
WheelAndAxle(wheel_br, false, false, chassis)
`, extensions: [
    lineNumbers(),
    // specialChars(),
    history(),
    // foldGutter(),
    // multipleSelections(),
    //  new StreamSyntax(legacyJS()).extension,
    arms(),
    // linter(esLint(new Linter)),
    // search({ keymap: defaultSearchKeymap }),
    defaultHighlighter,
    bracketMatching(),
    closeBrackets,
    autocomplete(),
    keymap({
      "Mod-z": undo,
      "Mod-Shift-z": redo,
      "Mod-u": view => undoSelection(view) || true,
      [isMac ? "Mod-Shift-u" : "Alt-u"]: redoSelection,
      "Ctrl-y": isMac ? undefined : redo,
      "Shift-Tab": indentSelection,
      // "Mod-Alt-[": foldCode,
      // "Mod-Alt-]": unfoldCode,
      "Mod-Space": startCompletion,
      // "Shift-Mod-m": openLintPanel,
      // "Mod-/": toggleLineComment,
      // "Mod-Alt-/": lineComment,
      // "Mod-Alt-Shift-/": lineUncomment,
      // "Mod-*": toggleBlockComment,
    }),
    keymap(baseKeymap),
  ]
})

let view = window.view = new EditorView({ state })
document.getElementById("editor").appendChild(view.dom)
