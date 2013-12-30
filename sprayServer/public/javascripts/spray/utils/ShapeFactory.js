/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class htwg.spray.ShapeFactory
 * Spray Shape Factory
 *
 * @author Simon Schneeberger
 */

var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.ShapeFactory = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.drawShape = function(name){
        var root = {};
		var classDef = htwg.spray.classDefinitionByName[name];
		var shapeDef = htwg.spray.shapeDefinitionByName[classDef.shape];
        root = that.createBoundingBox(shapeDef);
        if ( shapeDef.hasOwnProperty("shapes")){
            $.each(shapeDef.shapes, function(i,childShapeDef){
                 that.drawChild(childShapeDef, root, root);
            });
        }
        
        //with fallback for shapes which can be connected without anchor definition, expensive method
        if ( shapeDef.hasOwnProperty("anchors")){
            $.each(shapeDef.anchors, function(i,anchorDef){
                that.drawAnchor(anchorDef, root);
            });
        }else if ( this.checkForConnectionReference(name) ){
        	var anchorDef = {"type":"free"};
            that.drawAnchor(anchorDef, root);
        }

		root['sprayName'] = name;
        return root;
    },

    this.drawChild = function(shapeDef, parent, root){
        var shape = null;
        switch( shapeDef.name ){
            case "RoundedRectangle":
                shape = that.drawRoundedRectangle(shapeDef, parent);
                break;
            case "Rectangle":
                shape = that.drawRectangle(shapeDef, parent);
                break;
            case "Text":
                shape = that.drawLabel(shapeDef, parent);
                break;
            case "Ellipse":
                shape = that.drawEllipse(shapeDef, parent);
                break;
            case "Line":
                shape = that.drawLine(shapeDef, parent);
                break;
            case "Polyline":
                shape = that.drawPolyline(shapeDef, parent);
                break;
            case "Polygon":
                shape = that.drawPolygon(shapeDef, parent);
                break;
            default:break;
        }

        if ( shape != null ){
            if ( shapeDef.hasOwnProperty("compartment")){
                shape.setDraggable(true);
            }

            if ( shapeDef.hasOwnProperty("shapes")){
                $.each(shapeDef.shapes, function(i,childShapeDef){
                    if ( typeof shape != "undefined" ){
                        that.drawChild(childShapeDef, shape, root);
                    }
                });
            }
        }
    },

    this.drawAnchor = function(anchorDef, parent){

        switch (anchorDef.type) {
            case "fixpoint":
                var anchor = new spray2d.layout.locator.CustomPortLocator(anchorDef.x, anchorDef.y);
                break;
            case "relative":
                var anchor = new spray2d.layout.locator.CustomPortLocator(parseInt(anchorDef.x*parent.getWidth()), parseInt(anchorDef.y*parent.getHeight()));
                break;
            case "free":
            case "center":
                var anchor = new spray2d.layout.locator.CustomPortLocator(parseInt(parent.getWidth()/2), parseInt(parent.getHeight()/2));
                break;
            case "corners":
                var anchor_topleft = new spray2d.layout.locator.CustomPortLocator(0, 0);
                var anchor_topright = new spray2d.layout.locator.CustomPortLocator(parent.getWidth(), 0);
                var anchor_bottomleft = new spray2d.layout.locator.CustomPortLocator(0, parent.getHeight());
                var anchor_bottomright = new spray2d.layout.locator.CustomPortLocator(parent.getWidth(), parent.getHeight());
                var anchor_topmiddle = new spray2d.layout.locator.CustomPortLocator(parseInt(parent.getWidth()/2), 0);
                var anchor_leftmiddle = new spray2d.layout.locator.CustomPortLocator(0, parseInt(parent.getHeight/2));
                var anchor_rightmiddle = new spray2d.layout.locator.CustomPortLocator(parent.getWidth(), parseInt(parent.getHeight()/2));
                var anchor_bottommiddle = new spray2d.layout.locator.CustomPortLocator(parseInt(parent.getWidth()/2), parent.getHeight());
                break;
        }

        if ( anchorDef.type == "relative" || anchorDef.type == "center" ){
            anchor.setScalable(parent);
            parent.createPort("hybrid", anchor);
        }
        else if ( anchorDef.type == "fixpoint"){
            //not sure if fixpoint means definition in pixel or really fixed in position!
            anchor.setScalable(parent);
            parent.createPort("hybrid", anchor);
            var port = parent.getHybridPort(0);
        }else if ( anchorDef.type == "corners" ){
            anchor_topleft.setScalable(parent);
            anchor_topright.setScalable(parent);
            anchor_bottomleft.setScalable(parent);
            anchor_bottomright.setScalable(parent);
            anchor_topmiddle.setScalable(parent);
            anchor_leftmiddle.setScalable(parent);
            anchor_rightmiddle.setScalable(parent);
            anchor_bottommiddle.setScalable(parent);
            parent.createPort("hybrid", anchor_topleft);
            parent.createPort("hybrid", anchor_topright);
            parent.createPort("hybrid", anchor_bottomleft);
            parent.createPort("hybrid", anchor_bottomright);
            parent.createPort("hybrid", anchor_topmiddle);
            parent.createPort("hybrid", anchor_leftmiddle);
            parent.createPort("hybrid", anchor_rightmiddle);
            parent.createPort("hybrid", anchor_bottommiddle);
        }else if ( anchorDef.type == "free" ){
            anchor.setScalable(parent);
            parent.createPort("hybrid", anchor);
            var port = parent.getHybridPort(0);
            port.setDimension(parent.getWidth()/2, parent.getHeight()/2);
            port.setAlpha(0);
            port.setSpraySpecialPort(true);
            
            //TODO: port should grow with the parent
            //port.attachResizeListener(true);
        }
    },
    
    this.checkForConnectionReference = function(name){
    	var result = false;
        $.each(htwg.spray.classDefinition, function(i,classDef){
            if ( classDef.hasOwnProperty("connection") ){
            	if ( classDef.from == name ||
            		 classDef.to == name ||
            		 classDef.from == "fromElement" ||
            		 classDef.to == "toElement" ||
            		 jQuery.inArray( name, classDef.from ) >= 0 ||
            		 jQuery.inArray( name, classDef.to ) >= 0 ){
            		result = true;
            		return false;
            	}
            }
       });
       return result;
    },

    this.drawRoundedRectangle = function(shapeDef, parent){

        var rect = new spray2d.shape.basic.Rectangle(0,0);

        if ( typeof shapeDef.params != "undefined" ){

            var params = shapeDef.params;
            rect.setDimension(params.size.width, params.size.height);
            rect.setDimensionRatioToRoot( parent.getWidth()/rect.getWidth(), parent.getHeight()/rect.getHeight() );

            if ( params.hasOwnProperty("position")){
                rect.setPosition(params.position.x, params.position.y);
                rect.setPositionRatioToRoot( parent.getWidth()/rect.getPosition().x, parent.getHeight()/rect.getPosition().y );
                rect.setUserData({"type":"Rectangle"});
            }

            rect.setRadius(params.curve.width);
        }

        rect.setBackgroundColor("#ffffff");
        parent.addFigure(rect, new spray2d.layout.locator.FigureLocator(rect));
        parent.attachResizeListener(rect);

        return rect;
    },

    this.drawRectangle = function(shapeDef, parent){

        var rect = new spray2d.shape.basic.Rectangle(0,0);

        if ( typeof shapeDef.params != "undefined" ){

            var params = shapeDef.params;
            rect.setDimension(params.size.width, params.size.height);
            rect.setDimensionRatioToRoot( parent.getWidth()/rect.getWidth(), parent.getHeight()/rect.getHeight() );

            if ( params.hasOwnProperty("position")){
                rect.setPosition(params.position.x, params.position.y);
                rect.setPositionRatioToRoot( parent.getWidth()/rect.getPosition().x, parent.getHeight()/rect.getPosition().y );
                rect.setUserData({"type":"Rectangle"});
            }
        }

        rect.setBackgroundColor("#ffffff");
        parent.addFigure(rect, new spray2d.layout.locator.FigureLocator(rect));
        parent.attachResizeListener(rect);

        return rect;
    },

    this.drawEllipse = function(shapeDef, parent){

        var ellipse = new spray2d.shape.basic.Ellipse(0,0);

        if ( typeof shapeDef.params != "undefined" ){

            var params = shapeDef.params;
            ellipse.setDimension(params.size.width, params.size.height);
            ellipse.setDimensionRatioToRoot( parent.getWidth()/ellipse.getWidth(), parent.getHeight()/ellipse.getHeight() );

            if ( params.hasOwnProperty("position")){
                ellipse.setPosition(params.position.x, params.position.y);
                ellipse.setPositionRatioToRoot( parent.getWidth()/ellipse.getPosition().x, parent.getHeight()/ellipse.getPosition().y );
                ellipse.setUserData({"type":"Ellipse"});
            }
        }

        ellipse.setBackgroundColor("#ffffff");
        parent.addFigure(ellipse, new spray2d.layout.locator.FigureLocator(ellipse));
        parent.attachResizeListener(ellipse);

        return ellipse;
    },

    this.drawLabel = function(shapeDef, parent){

        var label = new spray2d.shape.basic.Label("default");
        label.setStroke(0);
        label.setAlpha(0);

        if ( typeof shapeDef.params != "undefined" ){
            var params = shapeDef.params;

            if ( params.hasOwnProperty("position")){
                label.setPosition(params.position.x, params.position.y);
                label.setPositionRatioToRoot( parent.getWidth()/label.getPosition().x, parent.getHeight()/label.getPosition().y );
                label.setUserData({"type":"Label"});
            }

            if ( params.hasOwnProperty("align")){
                var userData = label.getUserData();
                if ( userData == null ){
                    userData = {};
                }
                $(userData).extend({"verticalAlign":params.align.vertical,
                                    "textAlign":params.align.horizontal});
            }

            label.setDimension(params.size.width, params.size.height);
            label.setDimensionRatioToRoot( parent.getWidth()/params.size.width, parent.getHeight()/params.size.height );
        }

        parent.addFigure(label, new spray2d.layout.locator.FigureLocator(label));
        parent.attachResizeListener(label);
        label.installEditor(new draw2d.ui.LabelInplaceEditor());

        return label;
    },

    this.drawLine = function(shapeDef, parent){
        if ( typeof shapeDef.params != "undefined" ){
            var params = shapeDef.params;
            var line = new spray2d.shape.basic.Line(params.points[0].x,params.points[0].y,
                                                    params.points[1].x,params.points[1].y);
            line.setStartRatioToRoot( parent.getWidth(), parent.getHeight() );
            line.setEndRatioToRoot( parent.getWidth(), parent.getHeight() );
            line.setUserData({"type":"Line"});

            if ( params.hasOwnProperty("style")){

                switch ( params.style.lineStyle){
                    case "dash":
                        dash = "--";
                        break;
                    case "dot":
                        dash = ".";
                        break;
                    case "dash-dot":
                        dash = "-.";
                        break;
                    case "dash-dot-dot":
                        dash = "-..";
                        break;
                    default: dash = "";
                }
                line.setDashArray(dash);

                //TODO: add more styles...
            }

            parent.addFigure(line, new spray2d.layout.locator.FigureLocator(line));
            parent.attachResizeListener(line);
            parent.attachMoveListener(line);

            return line;
        }
        return null;
    },

    this.drawPolyline = function(shapeDef, parent){
        if ( typeof shapeDef.params != "undefined" ){
            var params = shapeDef.params;
            var polyline = new spray2d.shape.basic.Polyline(parent);
            $.each(params.points, function(i, point){
                if ( i == params.points.length-1 ){
                    return;
                }
                polyline.addLine(new draw2d.geo.Point(point.x,point.y),
                                 new draw2d.geo.Point(params.points[i+1].x,params.points[i+1].y));
            });

            return polyline;
        }
        return null;
    },

    this.drawPolygon = function(shapeDef, parent){
        if ( typeof shapeDef.params != "undefined" ){
            var params = shapeDef.params;
            var polygon = new spray2d.shape.basic.Polygon(parent);
            $.each(params.points, function(i, point){
                if ( i == params.points.length-1 ){
                    return;
                }
                polygon.addLine(new draw2d.geo.Point(point.x,point.y),
                                new draw2d.geo.Point(params.points[i+1].x,params.points[i+1].y));
            });

            var length = params.points.length;
            if ( length > 2 ){
                polygon.addLine(new draw2d.geo.Point(params.points[length-1].x,params.points[length-1].y),
                                new draw2d.geo.Point(params.points[0].x,params.points[0].y));
            }

            return polygon;
        }
        return null;
    },

    this.createBoundingBox = function( shape ){
        var bbox = new spray2d.shape.basic.BoundingBox(100,100);
        bbox.setAlpha(0);
        bbox.setPosition(10,10);
        bbox.setUserData({"name":shape.name});

        if ( typeof shape.params != "undefined" ){
            var params = shape.params;
            
            if ( params.hasOwnProperty("size") ){
            	bbox.setDimension(params.size.width, params.size.height);
            }
            //fallback
            if ( params.hasOwnProperty("width") && params.hasOwnProperty("height") ){
            	bbox.setDimension( params.width, params.height );
            }

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
                bbox.setProportional( params.proportional );
            }

            if ( params.hasOwnProperty("stretchH") ){
                bbox.setStretchingHorizontal( params.stretchH );
            }

            if ( params.hasOwnProperty("stretchV") ){
                bbox.setStretchingVertical( params.stretchV );
            }
        }

        return bbox;
    }
}
