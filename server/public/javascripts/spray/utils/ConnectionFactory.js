/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class htwg.spray.ConnectionFactory
 * Spray Connection Factory
 *
 * @author Simon Schneeberger
 */

var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.ConnectionFactory = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.drawChild = function(shapeDef, parent){
        var shape = null;
        switch( shapeDef.shape.name ){
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
    },

    this.drawRoundedRectangle = function(shapeDef, parent){

        var rect = new spray2d.shape.basic.Rectangle(0,0);

        var offset = 0;
        var angle = 0;
        var distance = 0;

        if ( shapeDef.hasOwnProperty("offset")){
            offset = shapeDef.offset;
        }
        if ( offset > 1 ){
            offset = 1;
        }

        if ( shapeDef.hasOwnProperty("angle")){
            angle = shapeDef.angle;
        }

        if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
            distance = shapeDef.distance;
        }

        rect.setUserData({"type":"Rectangle", "offset":offset, "angle":angle, "distance":distance});

        if ( typeof shapeDef.shape.params != "undefined" ){

            var params = shapeDef.shape.params;
            rect.setDimension(params.size.width, params.size.height);
            rect.setRadius(params.curve.width);
        }

        rect.setBackgroundColor("#ffffff");
        parent.addFigure(rect, new draw2d.layout.locator.ConnectionLocator(rect));
        parent.attachMoveListener(rect);

        return rect;
    },

    this.drawRectangle = function(shapeDef, parent){

        var rect = new spray2d.shape.basic.Rectangle(0,0);

        var offset = 0;
        var angle = 0;
        var distance = 0;

        if ( shapeDef.hasOwnProperty("offset")){
            offset = shapeDef.offset;
        }
        if ( offset > 1 ){
            offset = 1;
        }

        if ( shapeDef.hasOwnProperty("angle")){
            angle = shapeDef.angle;
        }

        if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
            distance = shapeDef.distance;
        }

        rect.setUserData({"type":"Rectangle", "offset":offset, "angle":angle, "distance":distance});

        if ( typeof shapeDef.shape.params != "undefined" ){

            var params = shapeDef.shape.params;
            rect.setDimension(params.size.width, params.size.height);
        }

        rect.setBackgroundColor("#ffffff");
        parent.addFigure(rect, new draw2d.layout.locator.ConnectionLocator(rect));
        parent.attachMoveListener(rect);

        return rect;
    },

    this.drawEllipse = function(shapeDef, parent){

        var ellipse = new spray2d.shape.basic.Ellipse(0,0);

        var offset = 0;
        var angle = 0;
        var distance = 0;


        if ( shapeDef.hasOwnProperty("offset")){
            offset = shapeDef.offset;
        }
        if ( offset > 1 ){
            offset = 1;
        }

        if ( shapeDef.hasOwnProperty("angle")){
            angle = shapeDef.angle;
        }

        if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
            distance = shapeDef.distance;
        }

        ellipse.setUserData({"type":"Ellipse", "offset":offset, "angle":angle, "distance":distance});

        if ( typeof shapeDef.shape.params != "undefined" ){

            var params = shapeDef.shape.params;
            ellipse.setDimension(params.size.width, params.size.height);
        }

        ellipse.setBackgroundColor("#ffffff");
        parent.addFigure(ellipse, new draw2d.layout.locator.ConnectionLocator(ellipse));
        parent.attachMoveListener(rect);

        return ellipse;
    },

    this.drawLabel = function(shapeDef, parent){

        var label = new spray2d.shape.basic.Label("default");
        label.setStroke(0);
        label.setAlpha(0);

        var offset = 0;
        var angle = 0;
        var distance = 0;

        if ( shapeDef.hasOwnProperty("offset")){
            offset = shapeDef.offset;
        }
        if ( offset > 1 ){
            offset = 1;
        }

        if ( shapeDef.hasOwnProperty("angle")){
            angle = shapeDef.angle;
        }

        if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
            distance = shapeDef.distance;
        }

        label.setUserData({"type":"Label", "offset":offset, "angle":angle, "distance":distance});

        if ( typeof shapeDef.shape.params != "undefined" ){
            var params = shapeDef.shape.params;

            if ( params.hasOwnProperty("align")){
                var userData = label.getUserData();
                if ( userData == null ){
                    userData = {};
                }
                $(userData).extend({"verticalAlign":params.align.vertical,
                    "textAlign":params.align.horizontal});
            }
        }

        parent.addFigure(label, new draw2d.layout.locator.ConnectionLocator(label));
        parent.attachMoveListener(label);
        label.installEditor(new draw2d.ui.LabelInplaceEditor());

        return label;
    },

    this.drawLine = function(shapeDef, parent){

        if ( typeof shapeDef.shape.params != "undefined" ){
            var offset = 0;
            var angle = 0;
            var distance = 0;

            if ( shapeDef.hasOwnProperty("offset")){
                offset = shapeDef.offset;
            }
            if ( offset > 1 ){
                offset = 1;
            }

            if ( shapeDef.hasOwnProperty("angle")){
                angle = shapeDef.angle;
            }

            if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
                distance = shapeDef.distance;
            }

            var params = shapeDef.shape.params;

            var line = new spray2d.shape.basic.Line(params.points[0].x, params.points[0].y,
                                                    params.points[1].x, params.points[1].y);
            line.setConnection(true);
            line.setUserData({"type":"Line", "offset":offset, "angle":angle, "distance":distance});

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

            parent.addFigure(line, new draw2d.layout.locator.ConnectionLocator(line));
            parent.attachMoveListener(line);

            return line;
        }
        return null;
    },

    this.drawPolyline = function(shapeDef, parent){
        if ( typeof shapeDef.shape.params != "undefined" ){
            var params = shapeDef.shape.params;
            var polyline = new spray2d.shape.basic.Polyline(parent);
            polyline.setConnection(true);
            var offset = 0;
            var angle = 0;
            var distance = 0;

            if ( shapeDef.hasOwnProperty("offset")){
                offset = shapeDef.offset;
            }
            if ( offset > 1 ){
                offset = 1;
            }

            if ( shapeDef.hasOwnProperty("angle")){
                angle = shapeDef.angle;
            }

            if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
                distance = shapeDef.distance;
            }
            polyline.setOffset(offset);
            polyline.setDistance(distance);
            polyline.setAngle(angle);
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
        if ( typeof shapeDef.shape.params != "undefined" ){
            var params = shapeDef.shape.params;
            var polygon = new spray2d.shape.basic.Polygon(parent);
            polygon.setConnection(true);
            var offset = 0;
            var angle = 0;
            var distance = 0;

            if ( shapeDef.hasOwnProperty("offset")){
                offset = shapeDef.offset;
            }
            if ( offset > 1 ){
                offset = 1;
            }

            if ( shapeDef.hasOwnProperty("angle")){
                angle = shapeDef.angle;
            }

            if ( shapeDef.hasOwnProperty("distance") && shapeDef.distance > 0 ){
                distance = shapeDef.distance;
            }
            polygon.setOffset(offset);
            polygon.setDistance(distance);
            polygon.setAngle(angle);
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
    }
}
