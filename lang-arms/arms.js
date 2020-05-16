// import { parser } from "lezer-css"
import { parser } from "../../lezer-arms/dist/parser"
// import { Subtree } from "lezer-tree"
import { LezerSyntax, continuedIndent, indentNodeProp, foldNodeProp } from "@codemirror/next/syntax"
import { languageData } from "@codemirror/next/state"
import { styleTags } from "@codemirror/next/highlight"

/// A syntax provider based on the [Lezer ARMS
/// parser](https://github.com/arms/lezer-arms), extended with
/// highlighting and indentation information.
export const armsSyntax = new LezerSyntax(parser.withProps(
    // languageData.add({
    // StyleSheet: {
    //     commentTokens: { block: { open: "/*", close: "*/" } },
    // }
    // }),
    // indentNodeProp.add({
    // Declaration: continuedIndent()
    // }),
    // foldNodeProp.add({
    // Block(subtree) { return { from: subtree.start + 1, to: subtree.end - 1 } }
    // }),
    styleTags({
        // https://codemirror.net/6/docs/ref/#highlight
        "Model Cuboid Ellipsoid Cylinder Mesh Revolute": "keyword definition",
        "for if else break continue": "keyword control",
        "template": "keyword",
        Comment: "comment",
        Number: "number",
        "true false none": "atom constant",
        "mm cm m in ft kg g deg rad": "atom constant",
        "xaxis yaxis zaxis": "atom constant",
        "identity relative absolute": "atom constant",
        ModelName: "variableName definition",
        PropertyName: "propertyName definition",
        VariableDefinition: "variableName definition",
        // VariableName: "variableName",
        TemplateName: "className definition",
        // ParameterName: "labelName",
        // InvokeName: "className",
        InterpName: "string",
        "( )": "paren",
        "[ ]": "squareBracket",
        "{ }": "brace",
    })
));

/// Returns an extension that installs the arms syntax provider.
export function arms() { return armsSyntax.extension }
