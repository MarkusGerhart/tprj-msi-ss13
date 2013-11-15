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

                canvasElem = $("<div style='width: 60px; height: 60px; display:none;' id='"+ item.id +"'></div>");
                that.menu.append(canvasElem);
                canvas = new draw2d.Canvas(item.id);
                SPRAY.htwg.generator.drawFigure(item.name, canvas);
                var figure = canvas.getFigure(item.id);
                shape = figure.getShapeElement();
                var writer = new draw2d.io.svg.Writer();
                svg = writer.marshal(canvas);
                canvasElem.remove();

                menuElem = $("<div data-shape='"+item.type+"' class='palette_node_element draw2d_droppable' id='" + item.id+ "'>" + svg + "</div>");
                that.menu.append(menuElem);
                topPosition = i*70;
                $("#"+item.id).css("top", topPosition );
                $("#"+item.id).css("z-index",1);

        });
    }

};