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

spray2d.shape.basic.BoundingBox = draw2d.shape.basic.Rectangle.extend({

    NAME : "spray2d.shape.basic.BoundingBox",

    /**
     * @constructor
     * Creates a new figure element which are not assigned to any canvas.
     *
     */
    init: function( width, height) {
        this._super( width, height );
        this.cachedWidth = width;
        this.cachedHeight = height;
        this.ratio = parseFloat( height / width );
        this.maxWidth = 1000;
        this.maxHeight = 1000;
        this.proportional = false;
        this.stretchingHorizontal = true;
        this.stretchingVertical = true;
    },

    setDimension:function(w,h){
        if ( this.stretchingHorizontal == false ){
            w = this.cachedWidth;
        }

        if ( this.stretchingVertical == false ){
            h = this.cachedHeight;
        }

        if ( w >= this.maxWidth && h >= this.maxHeight ){
            return
        }else if ( w >= this.maxWidth ){
            return;
        }else if ( h >= this.maxHeight ){
            return;
        }

        if ( this.getProportional() == true ){
            h = w * this.ratio;
        }

        this._super(w,h);
    },

    setMaxWidth:function(w){
        this.maxWidth =parseFloat(w);

        return this;
    },

    setMaxHeight:function(h){
        this.maxHeight = parseFloat(h);

        return this;
    },

    setProportional:function(bool){
        this.proportional = bool;
    },

    setStretchingHorizontal:function(bool){
        this.stretchingHorizontal = bool;
    },

    setStretchingVertical:function(bool){
        this.stretchingVertical = bool;
    },

    getMaxWidth:function(){
        return this.maxWidth;
    },

    getMaxHeight:function(){
        return this.maxHeight;
    },

    getProportional:function(){
        return this.proportional;
    },

    getStretchingHorizontal:function(){
        return this.stretchingHorizontal;
    },

    getStretchingVertical:function(){
        return this.stretchingVertical;
    }
});