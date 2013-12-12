/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class htwg.spray.Menu
 * Menu
 *
 * @author Simon Schneeberger
 */

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

    this.buildMenu = function(){

        var topPosition = 0;
        var size = 80;
        var accordion = $("#accordion");

        $.each(htwg.spray.classDefinition, function(i, item) {

            if ( accordion.find("#"+item.palette).length == 0 ){
                accordion.append("<h3>"+item.palette+"</h3><div id='"+item.palette+"'><ul></ul></div>");
            }

            canvasSize = size + 10;
            canvasElem = $("<div style='width: "+canvasSize+"px; height: "+canvasSize+"px;' id='"+ item.name +"'></div>");
            that.menu.append(canvasElem);
            canvas = new draw2d.Canvas(item.name);
            var figure = htwg.spray.factory.drawShape(item.shape);

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
                    var list = $("#"+ item.palette + " ul");
                    if ( list ){
                        list.append("<li><div lang="+item.shape+" class='palette_node_element draw2d_droppable ui-draggable' id='" + item.shape+ "'>" +
                            "<div class='flyout'>"+svg+"</div>"+item.name+"</div></li>");
                    }
                    $("#"+item.shape +" .flyout").css("width", figure.getWidth()+20+"px");
                    $("#"+item.shape +" .flyout").css("height", figure.getHeight()+20+"px");

                    $("#"+item.shape).hover(function(){
                        $(this).find('.flyout').show();
                    },function(){
                        $(this).find('.flyout').hide();
                    });
                });
            }


        });

        accordion.accordion({
            collapsible: true
        });
    }

};