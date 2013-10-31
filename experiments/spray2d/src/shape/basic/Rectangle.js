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
        // corner radius
        this._super( width, height );

        this.widthDimensionRatioToRoot = 1;
        this.heightDimensionRatioToRoot = 1;
    },

    setWidthDimensionRatioToRoot:function(ratio){
        this.widthDimensionRatioToRoot = ratio;
    },

    setHeightDimensionRatioToRoot:function(ratio){
        this.heightDimensionRatioToRoot = ratio;
    },

    onOtherFigureIsResizing:function(figure){
        this.setDimension( figure.getWidth()/this.widthDimensionRatioToRoot, figure.getHeight()/this.heightDimensionRatioToRoot);
    }
});