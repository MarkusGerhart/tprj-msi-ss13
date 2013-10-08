JSON Spec for Shapes
====================

Example from Shape DSL:

shape PI_Location_DashedLine {
    ellipse {
        size (width=50, height=50)
        line {
            point (x=0, y=25)
            point (x=50, y=25)
            style (line-style=dash)
        }
        text style TextStyle {
            position (x=0, y=5)
            size (width=50, height=20)
            align (horizontal=center, vertical=middle)
            id = shapeName
        }
        text style TextStyle {
            position (x=0, y=30)
            size (width=50, height=20)
            align (horizontal=center, vertical=middle)
            id = valueName
        }
    }
}

Possible JSON Representation:

PI_Location_DashedLine = {
  name: "PI_Location_DashedLine",  // if name is not primitive-shape, then on top of the hierarchie
  params: {},
  shapes: [{
    name: "ellipse",
    params: {width: 50, height: 50]},
    shapes: [
      {
        name: "line",
        params: {points: [[0,25], [50,25]]},
        shapes: undefined
      },
      {
        name: "text",
        params: {position: [0,5], width: 50, height: 20, align: {horizontal: "center", vertical: "middle"}, id: "shapeName"}
        shapes: undefined
      },
      {
        name: "text",
        params: {position: [0,30], width: 50, height: 20, align: {horizontal: "center", vertical: "middle"}, id: "valueName"}
        shapes: undefined
      }
    ]
  }]
}


JSON Spec for Connections
=========================

?