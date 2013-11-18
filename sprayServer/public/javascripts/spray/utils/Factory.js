var htwg = htwg || {};
htwg.spray = htwg.spray || {};

var shapedefs = [
    {
        name: "PI_Vessel_Vertical",
        params: {
            width: 120,
            height: 60
        },
        shapes: [
            {
                name: "RoundedRectangle",
                params: {
                    size: {width: 120, height: 60},
                    curve: {width: 50, height: 50}
                },
                shapes: [
                    {
                        name: "Text",
                        params: {
                            position: {x: 3, y: 20},
                            size: {width: 100, height: 20},
                            align: {
                                horizontal: "center",
                                vertical: "middle"
                            }
                        }
                    }
                ]
            }
        ]
    }
];

htwg.spray.Factory = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.shapeElements = [];

    this.initialize = function(){
        $.each(shapedefs, function(i,shape){
            if ( shape.hasOwnProperty("name") ){
                that.shapeElements.push(shape.name);
            }
        });
    },

    this.drawShape = function(name, canvas){
        var root = {};
        $.each(shapedefs, function(i,shapeDef){
            if ( shapeDef.hasOwnProperty("name") ){
                if (shapeDef.name == name ){
                    root = that.createBoundingBox(shapeDef);
                    if ( shapeDef.hasOwnProperty("shapes")){
                        $.each(shapeDef.shapes, function(i,childShapeDef){
                             that.drawChild(childShapeDef, root, root);
                        });
                    }
                    return;
                }
            }
        });
        return root;
    },

    this.drawChild = function(shapeDef, parent, root){
        switch( shapeDef.name ){
            case "RoundedRectangle":
                  var shape = that.drawRoundedRectangle(shapeDef, root);
                break;
            default:break;
        }
        parent.addFigure(shape, new spray2d.layout.locator.FigureLocator(shape));
        parent.attachResizeListener(shape);

        //hier habe ich noch einen rekursiven fehler, addFigure funzt nicht in draw2d
        /*if ( shapeDef.hasOwnProperty("shapes")){
            $.each(shapeDef.shapes, function(i,childShapeDef){
                if ( typeof shape != "undefined" ){
                that.drawChild(childShapeDef, shape, root);}
            });
        }*/
    },

    this.drawRoundedRectangle = function(shapeDef, root){
        var params = shapeDef.params;
        var rect = new spray2d.shape.basic.Rectangle(params.size.width, params.size.height);
        if ( params.hasOwnProperty("position")){
            rect.setPosition(params.position.x, params.position.y);
        }
        rect.setDimensionRatioToRoot( root.getWidth()/rect.getWidth(), root.getHeight()/rect.getHeight() );
        rect.setRadius(shapeDef.params.curve.width);
        rect.setBackgroundColor("#ffffff");
        return rect;
    },

    this.createBoundingBox = function( shape ){
        var bbox = new spray2d.shape.basic.BoundingBox(shape.params.width, shape.params.height);
        bbox.setAlpha(0);
        bbox.setPosition(0,0);

        var params = shape.params;

        if ( params.hasOwnProperty("minHeight") ){
            bbox.setMinHeight( params.minHeight );
        }

        if ( params.hasOwnProperty("minWidth") ){
            bbox.setMinWidth( params.minWidth );
        }

        if ( params.hasOwnProperty("maxHeight") ){
            bbox.setMaxHeight( params.maxHeight );
        }

        if ( params.hasOwnProperty("maxWidth") ){
            bbox.setMaxWidth( params.maxWidth );
        }

        if ( params.hasOwnProperty("proportional") ){
            //set true / false , string
            bbox.setProportional( params.proportional );
        }

        if ( params.hasOwnProperty("stretchingHorizontal") ){
            //set true / false , string
            bbox.setStretchingHorizontal( params.stretchingHorizontal );
        }

        if ( params.hasOwnProperty("stretchingVertical") ){
            //set true / false , string
            bbox.setStretchingVertical( params.stretchingVertical );
        }

        return bbox;
    }

    this.initialize();
}
