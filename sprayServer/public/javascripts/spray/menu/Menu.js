var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.Menu = function($){

    /*var exampleJSON = [{ id:"elem1", type: "draw2d.shape.node.Start", title: "Start", attributes: ""},
                       { id:"elem2", type: "draw2d.shape.node.Between", title: "Between", attributes: ""},
                       { id:"elem3", type: "draw2d.shape.node.End", title: "Stop", attributes: ""},
                       { id:"elem4", type: "draw2d.shape.basic.Circle", title:"Circle", attributes: "10"},
        { }];*/

    if ( jQuery('#menu').length === 0 ) {
        //no need to initialize
        return false;
    };

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.menu = jQuery("#menu");

    this.buildMenu = function( shapes ){
        $.each(shapes, function(i, item) {

                var size = 60;
                canvasElem = $("<div style='width: 60px; height: 60px;' id='"+ item +"'></div>");
                that.menu.append(canvasElem);
                canvas = new draw2d.Canvas(item);
                var figure = htwg.spray.factory.drawShape(item);

                if ( figure.getWidth() > size || figure.getHeight() > size ){
                    if ( figure.getWidth() > figure.getHeight() ){
                        figure.setDimension(size, parseInt(size * figure.getHeight()/figure.getWidth()));
                    }else{
                        figure.setDimension(parseInt(size * figure.getWidth()/figure.getHeight()), size);
                    }
                }

                if ( !$.isEmptyObject(figure) ){
                    canvas.addFigure(figure);
                    shape = figure.getShapeElement();
                    var writer = new draw2d.io.svg.Writer();
                    writer.marshal(canvas, function(svg){
                        canvasElem.remove();
                        menuElem = $("<div class='palette_node_element draw2d_droppable ui-draggable' id='" + item+ "'>" + svg + "</div>");
                        that.menu.append(menuElem);
                        topPosition = i*70;
                        $("#"+item).css("top", topPosition );
                        $("#"+item).css("z-index",1);
                    });
                }
        });
    }

};