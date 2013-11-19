var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.Menu = function($){

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

        var topPosition = 0;
        var size = 80;

        $.each(shapes, function(i, item) {
            canvasElem = $("<div style='width: "+size+"px; height: "+size+"px;' id='"+ item +"'></div>");
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
                    menuElem = $("<div lang="+item+" class='palette_node_element draw2d_droppable ui-draggable' id='" + item+ "'>" +
                                 "<div class='flyout'>"+item+"</div>" + svg + "</div>");
                    that.menu.append(menuElem);
                    $("#"+item).hover(function(){
                        $(this).find('.flyout').show();
                    },function(){
                        $(this).find('.flyout').hide();
                    });
                    $("#"+item).css("top", topPosition );
                    $("#"+item).css("z-index",1);
                    topPosition += figure.getHeight()+10;
                });
            }
        });
    }

};