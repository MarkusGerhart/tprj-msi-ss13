/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class spray2d.shape.basic.Rectangle
 * A Spray Rectangle Figure.
 *
 * @author Simon Schneeberger
 * @extends spray2d.Rectangle
 */

var spray2d = spray2d || {};
spray2d.shape = spray2d.shape || {};
spray2d.shape.basic = spray2d.shape.basic || {};

spray2d.shape.basic.Rectangle = draw2d.shape.basic.Rectangle.extend({

    NAME : "spray2d.shape.basic.Rectangle",

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

    setProportional:function(bool){
        this.proportional = bool;
    },

    getDimensionRatioToRoot:function(){
        return this.dimensionRatioToRoot;
    },

    getPositionRatioRoot:function(){
        return this.positionRatioToRoot;
    },

    onOtherFigureIsResizing:function(figure){
        this.setDimension( figure.getWidth()/this.dimensionRatioToRoot.x, figure.getHeight()/this.dimensionRatioToRoot.y);
    }
});