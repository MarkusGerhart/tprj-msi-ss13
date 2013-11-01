spray.shapes.Rectangle = draw2d.shape.basic.Rectangle.extend({

    NAME : "spray.shapes.Rectangle",

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