/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class spray2d.shapes.Ellipse
 * A Spray Ellipse Figure.
 *
 * @author Simon Schneeberger
 * @extends spray2d.Ellipse
 */

var spray2d = spray2d || {};
spray2d.shape = spray2d.shape || {};
spray2d.shape.basic = spray2d.shape.basic || {};

spray2d.shape.basic.Ellipse = draw2d.shape.basic.Oval.extend({

    NAME : "spray2d.shape.basic.Ellipse",

    /**
     * @constructor
     * Creates a new figure element which are not assigned to any canvas.
     *
     */
    init: function( width, height) {
        this._super( width, height );
        this.dimensionRatioToRoot = { "x": 1, "y": 1};
        this.positionRatioToRoot = { "x": 1, "y": 1};
    },

    setDimensionRatioToRoot:function(x,y){
        if ( isNaN(x) || !( x > 0 ) ){
            x = 1;
        }
        if ( isNaN(y) || !( y > 0 ) ){
            y = 1;
        }
        this.dimensionRatioToRoot = { "x": x, "y": y};
    },

    setPositionRatioToRoot:function(x,y){
        if ( isNaN(x) || !( x > 0 ) ){
            x = 1;
        }
        if ( isNaN(y) || !( y > 0 ) ){
            y = 1;
        }
        this.positionRatioToRoot = { "x": x, "y": y};
    },

    getDimensionRatioToRoot:function(){
        return this.dimensionRatioToRoot;
    },

    getPositionRatioRoot:function(){
        return this.positionRatioToRoot;
    },

    onOtherFigureIsResizing:function(figure){
        this.setDimension( figure.getWidth()/this.dimensionRatioToRoot.x, figure.getHeight()/this.dimensionRatioToRoot.y);
    },

    onDoubleClick: function(){
    }
});