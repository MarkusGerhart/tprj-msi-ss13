// class: Generator
// varianten: 1) konvertieren des spray json in draw2d json
//               dann mit rekursivem unmarshall zeichnen
//            2) direkt zeichnen von spray json und umwandlung was gebraucht?!

/*shape PI_Boiler {
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
}*/


/*
* shape PI_Vessel_Vertical {
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
*
* */

var PI_Vessel_Vertical = {
    shapes: [{
        name: "rounded-rectangle",
        size: {width: 120, height: 60},
        curve: {width: 50, height: 50},
        shapes: [{
            name: "text",
            position: {x:3, y:20},
            size: {width: 100, height: 20},
            align: {horizontal: "center", vertical: "middle"},
            id: "shapeName",
            shapes: "undefined"
        }]
    }
    ]
};

// to
/*
 var jsonDocument ={ "PI_Vessel_Vertical" : { "type": draw2d.Figure,
                                              "id": 1,
                                              "x": default?,
                                              "y": default?,
                                              children": [{
                                                             "type": "draw2d.shape.basic.Rectangle",
                                                             "id": "354fa3b9-a834-0221-2009-abc2d6bd852a",
                                                             "x": 0,
                                                             "y": 30,
                                                             "width": 100,
                                                             "height": 100,
                                                             "children" : [{
                                                                             "type": "draw2d.shape.basic.Rectangle",
                                                                             "id": "ebfb35bb-5767-8155-c804-14bda7759dc2",
                                                                             "locator" : "draw2d.layout.locator.LocatorA",
                                                                             "x": 25,
                                                                             "y": 100,
                                                                             "width": 50,
                                                                             "height": 20
                                                              }]
                                                        }]
                                            },
                       "PI_Vessel_2": {}
                    };
 */

var shapeExamples = { "PI_Vessel_Vertical": PI_Vessel_Vertical };

spray.Generator = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.shapeElements = [];
    this.draw2dJSON = [];
    this.configMenu = [];

    this.initialize = function(){

        this.convertSprayToDraw2dJSON(shapeExamples);

        $.each(this.draw2dJSON[0], function(name,elem){
            //TODO: probably more attributes like title
            that.configMenu.push({"name": name,
                                  "id": name});
        });

        this.configMenu.push({});
    };

    this.drawFigure = function(figureName, canvas){
        if ( this.draw2dJSON[0].hasOwnProperty(figureName) ){
            var figure = this.draw2dJSON[0][figureName];
            console.log(figure);
            var draw2dFigure = eval("new "+figure.type+"();");
            canvas.addFigure(draw2dFigure,new draw2d.layout.locator.CenterLocator(canvas));
            //this.drawShape(draw2dFigure, figure.children);
        }
    }

    this.drawShape = function( parentShape, shape ){
        $.each(shape, function(i,childShape){

            var draw2dChildShape = eval("new "+childShape.type+"()");
            console.log(childShape.type);
            console.log(parentShape);
            parentShape.addFigure(draw2dChildShape, new draw2d.layout.locator.CenterLocator(parentShape));

            if ( childShape.hasOwnProperty("children")){
                //that.drawShape(childShape, childShape.children);
            }
        });
    }

    this.convertSprayToDraw2dJSON = function(json){
        $.each(json, function(name,sprayShape){
            var draw2dShapeJSON = that.convertSprayToDraw2dShape(sprayShape.shapes);
            obj = {};
            obj[name] = {"type": "draw2d.shape.layout.HorizontalLayout",
                         "children": draw2dShapeJSON};
            that.draw2dJSON.push( obj );
        });
    }

    this.convertSprayToDraw2dShape = function(sprayShapes){
        var result = [];
        $.each(sprayShapes, function(i,sprayChildShape){
            draw2dElementObj = that.convertSprayToDraw2dObj(sprayChildShape);
            result.push( draw2dElementObj );
            if ( sprayChildShape.shapes != "undefined" ){
                draw2dElementObj["children"] = that.convertSprayToDraw2dShape(sprayChildShape.shapes);
            }
        });
        if ( result.length > 0 ) return result;
        return null;
    }

    this.convertSprayToDraw2dObj = function( sprayShape ){
        var draw2dElementObj = {};
        switch ( sprayShape.name ){
            case "rounded-rectangle":
                draw2dElementObj['type'] = "draw2d.shape.basic.Rectangle";
                //TODO: default width?!
                draw2dElementObj['width'] = sprayShape.size.width;
                draw2dElementObj['height'] = sprayShape.size.height;
                //TODO: no further specification for radius
                draw2dElementObj['radius'] = sprayShape.curve.width;
                break;
            case "text":
                draw2dElementObj['type'] = "draw2d.shape.basic.Label";
                draw2dElementObj['text'] = sprayShape.id;
                draw2dElementObj['width'] = sprayShape.size.width;
                draw2dElementObj['height'] = sprayShape.size.height;
                //TODO: default for horizontal/vertical
                draw2dElementObj['cssClass'] = "label_"+ sprayShape.align.horizontal+"_"+sprayShape.align.vertical;
                break;
            case "line":
                break;
            default:
        }

        if ( !sprayShape.hasOwnProperty('position') ){
            draw2dElementObj['x'] = 0;
            draw2dElementObj['y'] = 0;
        }
        else{
            draw2dElementObj['x'] = sprayShape.position.x;
            draw2dElementObj['y'] = sprayShape.position.y;
        }

        return draw2dElementObj;
    }

    this.initialize();
}
