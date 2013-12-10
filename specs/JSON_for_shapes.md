JSON Spec for Shapes
====================

There are primitive shapes[1]:

* Line
* PolyLine
* Rectangle
* RoundedRectangle
* Polygon
* Ellipse
* Text
* Anchor

And Conntections between shapes:

* CDLine
* CDPolyLine
* CDRectangle
* CDRoundedRectangle
* CDPolygon
* CDEllipse
* CDText

Rules for JSON
--------------

There exists a complex shape, conjuncted out of primitive shapes.
One JSON datastructure represents such ja complex shape.
Every conjuncted shape has the properties

* name: String
* params : {*}
* anchors: [*]  (only in the top level!)
* shapes: [*]

The name property describes the actual primitive shape, or when on top
of the shape hirarchie the name of the complex shape.

The params proptery holds information about the current shape, like

* position : [{x: Int, y: Int, radius: Int, angle: Int, offset: Float}*]
* size : {width: Int, height: Int}
* stretching : {horizontal, vertical}
* align : {horizontal, vertical}
  * horizontal : "left" | "center" | "right"
  * vertical :  "top" | "middle" | "center"
* curve : {width: Int, height: Int}
* size-min : {width: Int, height: Int}
* size-max : {width: Int, height: Int}
* proportional : Bool
* layout : {stretching | spacing : Int | margin : Int | invisible}
* points : [{x: Int, y: Int, curveBefore: Int, curveAfter: Int}*]

Anchors:
Only the top level shape can hold anchors. There are four types of anchors:

* {type: "center"}
* {type: "corners"}
* {type: "relative", x: Int, y: Int}
* {type: "fixpoints", x: Int, y: Int}

The shapes property is a list. To build conjuncted shapes
in a hierarchie, the same properties are allowed to be applied
recursive.

Following parameters are *only* in the mother shape available:

* minWidth, minHeight
* maxWidth, maxHeight
* stretchH, stretchV
* proportional

Also a boundingbox size will be calculated for the mother shape.
This boundingbox size is based on the sizes of the child shapes.
The size parameter in the mother shape is therefore the size of
the invisible boundingbox.

Compartments:

Compartments are a special case of shapes. Shapes marked as compartment
are able to host other shapes, which can be placed there via drag & drop.

Only Rectangle and Ellipse can hold compartments.

* compartment: {layout: fixed|vertical|horizontal|fit, spacing: Int, margin: Int, insisible: Bool, stretchH: Bool, stretchV: Bool}

Connections:

The connection shapes are explicitly seperated from the "normal" shapes.
They have:

* name: String
* connectionType: String (freeform or manhattan)
* placings

The placings can contrain:

* offset: Double
* distance: Double
* angle: Double
* shape

The shape is a primitive Shape, which is on it's own and therefore can't
hold (nested) other shapes.

PI Example
----------

# 1

shape PI_Vessel_Vertical {
    rounded-rectangle {
        size (width=120, height=60)
        curve (width=50, height=50)
        text style TextStyle {
            size (width=100, height=20)
            position (x=3, y=20)
            align (horizontal=center, vertical=middle)
            id = shapeName 
        }
    }
}

PI_Vessel_Vertical = {
  name: "PI_Vessel_Vertical",
  params: {},
  anchors: [],
  shapes: [{
    name: "rounded-rectangle",
    params: {
      size: {width: 120, height: 60},
      curve: {width: 50, height: 50}
    },
    shapes: [{
      name: "text",
      params: {
        position: [{x:3, y:20}],
        size: {width: 100, height: 20},
        align: {horizontal: "center", vertical: "middle"},
        id: "shapeName"
      },
      shapes: undefined
    }]
  }]
}

# 2

shape PI_Boiler {
  rounded-rectangle {
    curve(width=30,height=30)
    position (x=0, y=0)
    size (width=60, height=100)
    }
    polyline {
        point (x=90, y=70)
        point (x=30, y=70)
        point (x=50, y=50)
        point (x=30, y=30)
        point (x=90, y=30)
    }
    text style TextStyle {
      position(x=60,y=0)
      size (width=100, height=20)
      id = shapeName
    }
    anchor {
        position (x=0, y=30)
        position (x=0, y=70)
        position (x=90, y=30)
        position (x=90, y=70)
    }
}

PI_Boiler = {
  name: "PI_Boiler",
  params: {},
  anchors: [
      {type: "fixpoint", x: 0, y: 30},
      {type: "fixpoint", x: 0, y: 70},
      {type: "fixpoint", x: 90, y: 30},
      {type: "fixpoint", x: 90, y: 70},
  ],
  shapes: [{
    name: "rounded-rectangle",
    params: {
      curve: {width:30, height: 30},
      position: {x:0, y:0},
      size: {width:60, height:100}
    },
    shapes: undefined
  },
  {
    name: "polyline",
    params: {
      point: [
        {x:90, y:70}, {x:30, y:70},
        {x:50, y:50}, {x:30, y:30}, 
        {x:90, y:30}
      ]
    },
    shapes: undefined
  },
  {
    name: "text",
    params: {
      position: {x:60, y:5},
      size: {width: 100, height: 20},
      id: "shapeName"
    },
    shapes: undefined
  },
  {
    name: "anchor",
    params: {
      position: [
        {x:0, y:30}, {x:0, y:70},
        {x:90, y:30}, {x:90, y:70}
      ]
    },
    shapes: undefined
  }]
}

# 3

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

PI_Location_DashedLine = {
  name: "PI_Location_DashedLine",
  params: undefined,
  shapes: [{
    name: "ellipse",
    params: {
      size: {width: 50, height: 50}
    },
    shapes: [
      {
        name: "line",
        params: {
          point: [{x:0, y:25}, {x:50,y:25}]
        },
        shapes: undefined
      },
      {
        name: "text",
        params: {
          position: [{x:0, y:5}],
          size: {width: 50, height: 20},
          align: {horizontal: "center", vertical: "middle"},
          id: "shapeName"
        },
        shapes: undefined
      },
      {
        name: "text",
        params: {
          position: [{x:0, y:30}],
          size: {width: 50, height: 20},
          align: {horizontal: "center", vertical: "middle"},
          id: "valueName"
        },
        shapes: undefined
      }
    ]
  }]
}


References
----------

[1]: The Shape Grammar http://tinyurl.com/l6zddo5
