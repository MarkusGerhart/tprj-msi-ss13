/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class spray2d.shape.basic.Rectangle
 * A Spray Polyline Figure.
 *
 * @author Simon Schneeberger
 * @extends draw2d.VectoreFigure
 */

var spray2d = spray2d || {};
spray2d.shape = spray2d.shape || {};
spray2d.shape.basic = spray2d.shape.basic || {};

spray2d.shape.basic.Polygon = Class.extend({

    NAME : "spray2d.shape.basic.Polygon",

    DEFAULT_COLOR : new draw2d.util.Color(0,0,0),

    /**
     * @constructor
     * Creates a new figure element which are not assigned to any canvas.
     */
    init: function(root) {
        // all line segments with start/end as simple object member
        this.lineSegments = new draw2d.util.ArrayList();

        this.root = root;
        this.startRatioToRoot = 1;
        this.endRatioToRoot = 1;

        this.connection = false;
        this.offset = 0;
    },

    setConnection: function(conn){
        this.connection = conn;
    },

    setOffset: function(offset){
        this.offset = offset;
    },

    /**
     * @method
     * add Line
     *
     **/
    addLine:function(/*:draw2d.geo.Point*/ start, end)
    {
        if(typeof start=="undefined" || typeof end =="undefined"){
            return;
        }
        var line = new spray2d.shape.basic.Line(start.getX(), start.getY(), end.getX(), end.getY());
        if ( !this.connection ){
            line.setStartRatioToRoot( this.root.getWidth(), this.root.getHeight() );
            line.setEndRatioToRoot( this.root.getWidth(), this.root.getHeight() );
            //line.setUserData({"type":"Line"});
            this.root.addFigure(line, new spray2d.layout.locator.FigureLocator(this.root));
        }else{
            line.setUserData({"type":"Line", "offset":this.offset});
            line.setConnection(true);
            this.root.addFigure(line, new draw2d.layout.locator.ConnectionLocator(line));
        }

        this.root.attachMoveListener(line);

        this.lineSegments.add(line);
    },

    /**
     * @method
     * add figure
     *
     **/
    addFigure:function(figure){
        this.root.addFigure(figure, new spray2d.layout.locator.FigureLocator());
        this.root.attachResizeListener(figure);
    },

    /**
     * @method
     * Return all line segments of the polyline.
     *
     * @returns {draw2d.util.ArrayList}
     */
    getSegments: function(){
        return this.lineSegments;
    },

    onDoubleClick: function(){
    }

});
