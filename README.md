# Robot markup, design, and simulation

Steps:

1. Write ARMS grammar
  1. Look at [the example here](examples/playground.arms)
2. Write a lexer
3. Write a parser (no expressions to start)
4. Generate visual from AST

Ideas:

- position box on center? make configurable?
- transformations (ODE or transformations.py)
- separate visual from collision?
- multiple visual or collision elements?
- conditional and branching
- loops
- https://p5js.org/reference/#/p5/loadModel
- includes
- transparency?
- names in templates?
- https://www.bottango.com/

([original project](https://github.com/DillonFlohr/ARMS) and [report](https://compusciencing.github.io/report-arms.html))

ARMS (automated robot markup to simulation)

Output formats:

- sdf (Gazebo)
- skeleton + DART scaffolding
- ProjectChrono
- ODE

Functionality:

- primitives
  - sphere
  - cylinder
  - box
  - other?
- meshes (URI?)
- transformations
  - ODE
  - transformations.py
- load from url query parameter
- save to local storage

Code style:

- [INI config files](https://en.wikipedia.org/wiki/INI_file)

Visualization options:

- p5js
  - simple, no need to maintain objects
- [plotly](https://github.com/plotly/plotly.js/)
  - also simple
- threejs
  - prettier, more complex for adding removing objects
- resouces
  - [openjscad](https://openjscad.org/)
  - [How To Render 3d In 2d Canvas](https://www.basedesign.com/blog/how-to-render-3d-in-2d-canvas)
- https://gist.github.com/dmnsgn/76878ba6903cf15789b712464875cfdc
- https://math.gl/
- https://www.babylonjs.com/

Visualization needs:

- 3d shapes
- simple
- isometric projection (not required, but nice)
- loading 3d models (obj is fine, gltf would be better)

Editing code options:

- [codemirror](https://codemirror.net/)
- [prismjs](https://prismjs.com/) or highlightjs
- [ace](https://github.com/ajaxorg/ace)
- [CodeFlask](https://github.com/kazzkiq/CodeFlask)
- [codejar](https://github.com/antonmedv/codejar)
- https://code.tutsplus.com/tutorials/create-a-wysiwyg-editor-with-the-contenteditable-attribute--cms-25657
- https://code.tutsplus.com/tutorials/create-an-inline-text-editor-with-the-contenteditable-attribute--cms-25655
- https://stackoverflow.com/questions/6756407/what-contenteditable-editors-are-there
- https://www.simonewebdesign.it/demo/html5editor/

Developing:

- [css grid resizing](https://stackoverflow.com/questions/46044589/dynamically-resize-columns-in-css-grid-layout-with-mouse)
- [modules](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Modules)

p5js notes:

- object
- resize
- model (obj or stl)

Math:

- degrees <--> radians
- rotation from axis and angle

```bash
# Develop
parcel index.html

# Deploy...
```
