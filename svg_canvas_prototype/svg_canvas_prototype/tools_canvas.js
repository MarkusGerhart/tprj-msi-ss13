/**
 * This script contains the complete tool logic.
 *
 * @author sischnee <sischnee@gmail.com>
 * @since 2012/28/11
 */

var WBOARD = WBOARD || {};
WBOARD.htwg = WBOARD.htwg || {};

WBOARD.htwg.Tools = function(){

    if ( jQuery('#tools').length === 0 ) {
        //no need to initialize
        return false;
    }

    var tool = false;
    var tools = {};

    var toolText = $("#text");
    var toolLine = $("#line");
    var toolPen = $("#pen");
    var toolForms = $("#forms");

    this.stage = null;
    this.layer = null;
    this.canvas = null;
    this.context = null;
    this.select = false;

    /**
     * Scope duplicator / parent this.
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    /**
     * Add a corner anchor for a group.
     *
     * @access public
     * @return void
     */
    this.addAnchor = function(group, x, y, name) {

        var anchor = new Kinetic.Circle({
            x: x,
            y: y,
            stroke: "#666",
            fill: "#ddd",
            strokeWidth: 2,
            radius: 6,
            name: name,
            draggable: true
        });

        anchor.on("dragmove", function() {
            that.update(group, this, false);
            that.layer.draw();
        });
        anchor.on("mousedown touchstart", function() {
            group.setDraggable(false);
            this.moveToTop();
        });
        anchor.on("dragend", function() {
            group.setDraggable(true);
            that.layer.draw();
        });
        // add hover styling
        anchor.on("mouseover", function() {
            document.body.style.cursor = "pointer";
            this.setStrokeWidth(4);
            that.layer.draw();
        });
        anchor.on("mouseout", function() {
            document.body.style.cursor = "default";
            this.setStrokeWidth(2);
            that.layer.draw();
        });

        group.add(anchor);
    }

    /**
     * Add a center anchor for a group.
     *
     * @access public
     * @return void
     */
    this.addCenterAnchor = function(group, x, y, name) {

        var anchor = new Kinetic.Circle({
            x: x,
            y: y,
            stroke: "#666",
            fill: "#ddd",
            strokeWidth: 1,
            radius: 2,
            name: name,
            draggable: false
        });

        group.add(anchor);
    }

    /**
     * Add a red rotation anchor for a group.
     *
     * @access public
     * @return void
     */
    this.addRotationAnchor = function(group, x, y, name) {

        var anchor = new Kinetic.Circle({
            x: x,
            y: y,
            stroke: "red",
            fill: "#ddd",
            strokeWidth: 2,
            radius: 6,
            name: name,
            draggable: true
        });

        anchor.on("dragmove", function() {
            that.update(group, this, true);
            // that.layer.draw();

        });
        anchor.on("mousedown touchstart", function() {
            group.setDraggable(false);
            this.moveToTop();
        });
        anchor.on("dragend", function() {
            group.setDraggable(true);
            //that.layer.draw();
        });
        // add hover styling
        anchor.on("mouseover", function() {
            document.body.style.cursor = "pointer";
            this.setStrokeWidth(4);
            that.layer.draw();
        });
        anchor.on("mouseout", function() {
            document.body.style.cursor = "default";
            this.setStrokeWidth(2);
            that.layer.draw();
        });

        group.add(anchor);
    }

    /**
     * Update the group when an anchor is dragged (moving/rotation of different type of elements).
     *
     * @access public
     * @return void
     */
    this.update = function(group, activeAnchor, rotation, mousePos) {
        var groupName = group.getName();
        // depend on kind of shape different calculates are needed
        if (groupName == "rectGroup") {
            var topLeft = group.get(".topLeft")[0];
            var topRight = group.get(".topRight")[0];
            var bottomRight = group.get(".bottomRight")[0];
            var bottomLeft = group.get(".bottomLeft")[0];
            var rotationPoint = group.get(".rotation")[0];
            var centerPoint = group.get(".center")[0];
            var rect = group.get(".rect")[0];

            if ( rotation ){
                var angle = Math.atan2((group.getOffset().y - rotationPoint.attrs.y), (group.getOffset().x - rotationPoint.attrs.x));
                group.rotate(angle-Math.PI);
            }
            else{
                // update anchor positions
                switch (activeAnchor.getName()) {
                    case "topLeft":
                        topRight.attrs.y = activeAnchor.attrs.y;
                        bottomLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "topRight":
                        topLeft.attrs.y = activeAnchor.attrs.y;
                        bottomRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomRight":
                        bottomLeft.attrs.y = activeAnchor.attrs.y;
                        topRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomLeft":
                        bottomRight.attrs.y = activeAnchor.attrs.y;
                        topLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                }
                rect.setSize(topRight.attrs.x - topLeft.attrs.x, bottomLeft.attrs.y - topLeft.attrs.y);
                var x = topLeft.attrs.x + rect.getWidth()/2 ;
                var y = topLeft.attrs.y + rect.getHeight()/2;
                group.setOffset( x, y );
                rect.setPosition(topLeft.attrs.x,topLeft.attrs.y);
                centerPoint.setPosition( rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2);
            }
            rotationPoint.setPosition( rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2 );
        }
        if (groupName == "squareGroup") {
            var topLeft = group.get(".topLeft")[0];
            var topRight = group.get(".topRight")[0];
            var rotationPoint = group.get(".rotation")[0];
            var centerPoint = group.get(".center")[0];
            var rect = group.get(".square")[0];

            if ( rotation ){
                var angle = Math.atan2((group.getOffset().y - rotationPoint.attrs.y), (group.getOffset().x - rotationPoint.attrs.x));
                group.rotate(angle-Math.PI);
            }
            else{
                rect.setSize(topRight.attrs.x - topLeft.attrs.x,topRight.attrs.x - topLeft.attrs.x);
                var x = topLeft.attrs.x + rect.getWidth()/2 ;
                var y = topLeft.attrs.y + rect.getHeight()/2;
                group.setOffset( x, y );
                rect.setPosition(topLeft.attrs.x,topLeft.attrs.y);
                centerPoint.setPosition( rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2);
            }
            rotationPoint.setPosition( rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2 );
        }
        if (groupName == "circleGroup") {
            var right = group.get(".right")[0];
            var circle = group.get(".circle")[0];
            if ( right.attrs.x - circle.getPosition().x > 0 ){
                circle.setRadius(right.attrs.x - circle.getPosition().x);
            }
            right.attrs.x = circle.getPosition().x + circle.getRadius();
            right.attrs.y = circle.getPosition().y;
        }
        if (groupName == "ellipseGroup") {
            var top = group.get(".top")[0];
            var left = group.get(".left")[0];
            var rotationPoint = group.get(".rotation")[0];
            var ellipse = group.get(".ellipse")[0];
            if ( rotation ){
                var angle = Math.atan2((group.getOffset().y - rotationPoint.attrs.y), (group.getOffset().x - rotationPoint.attrs.x));
                group.rotate(angle-Math.PI);
            }
            else{
                var radiusY = ellipse.getPosition().y - top.attrs.y;
                var radiusX = ellipse.getPosition().x - left.attrs.x;
                if ( radiusX > 0 && radiusY > 0 ){
                    ellipse.setRadius([radiusX, radiusY]);
                }else{
                    if ( !(radiusX > 0) ){
                        left.attrs.x = ellipse.getPosition().x;
                    }
                    if ( !(radiusY > 0) ){
                        top.attrs.y = ellipse.getPosition().y;
                    }
                }
                top.attrs.x = ellipse.getPosition().x;
                left.attrs.y = ellipse.getPosition().y;
            }
            rotationPoint.setPosition( ellipse.getPosition().x + ellipse.getRadius().x, ellipse.getPosition().y );
        }
        if (groupName == "lineGroup") {
            var start = group.get(".start")[0];
            var end = group.get(".end")[0];
            var line = group.get(".line")[0];
            line.setPoints([ start.attrs.x, start.attrs.y, end.attrs.x,end.attrs.y ]);
        }
        if (groupName == "textGroup") {
            var topLeft = group.get(".topLeft")[0];
            var topRight = group.get(".topRight")[0];
            var bottomRight = group.get(".bottomRight")[0];
            var bottomLeft = group.get(".bottomLeft")[0];
            var rotationPoint = group.get(".rotation")[0];
            var centerPoint = group.get(".center")[0];
            var rect = group.get(".text")[0];

            if ( rotation ){
                var angle = Math.atan2((group.getOffset().y - rotationPoint.attrs.y), (group.getOffset().x - rotationPoint.attrs.x));
                group.rotate(angle-Math.PI);
            }
            else{
                // update anchor positions
                switch (activeAnchor.getName()) {
                    case "topLeft":
                        topRight.attrs.y = activeAnchor.attrs.y;
                        bottomLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "topRight":
                        topLeft.attrs.y = activeAnchor.attrs.y;
                        bottomRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomRight":
                        bottomLeft.attrs.y = activeAnchor.attrs.y;
                        topRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomLeft":
                        bottomRight.attrs.y = activeAnchor.attrs.y;
                        topLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                }

                if ( ( topRight.attrs.x - topLeft.attrs.x ) > rect.getWidth() && ( bottomLeft.attrs.y - topLeft.attrs.y ) > rect.getHeight() ){
                    rect.setFontSize( parseInt(rect.getFontSize()) + 1 );
                }
                else if ( ( topRight.attrs.x - topLeft.attrs.x ) < rect.getWidth() && ( bottomLeft.attrs.y - topLeft.attrs.y ) < rect.getHeight() ){
                    rect.setFontSize( parseInt(rect.getFontSize()) - 1 );
                }

                rect.setSize(topRight.attrs.x - topLeft.attrs.x, bottomLeft.attrs.y - topLeft.attrs.y);
                var x = topLeft.attrs.x + rect.getWidth()/2 ;
                var y = topLeft.attrs.y + rect.getHeight()/2;
                group.setOffset( x, y );
                rect.setPosition(topLeft.attrs.x,topLeft.attrs.y);
                centerPoint.setPosition( rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2);
            }
            rotationPoint.setPosition( rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2 );
        }
        if (groupName == "imageGroup") {
            var topLeft = group.get(".topLeft")[0];
            var topRight = group.get(".topRight")[0];
            var bottomRight = group.get(".bottomRight")[0];
            var bottomLeft = group.get(".bottomLeft")[0];
            var rotationPoint = group.get(".rotation")[0];
            var centerPoint = group.get(".center")[0];
            var rect = group.get(".image")[0];

            if ( rotation ){
                var angle = Math.atan2((group.getOffset().y - rotationPoint.attrs.y), (group.getOffset().x - rotationPoint.attrs.x));
                group.rotate(angle-Math.PI);
            }
            else{
                // update anchor positions
                switch (activeAnchor.getName()) {
                    case "topLeft":
                        topRight.attrs.y = activeAnchor.attrs.y;
                        bottomLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "topRight":
                        topLeft.attrs.y = activeAnchor.attrs.y;
                        bottomRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomRight":
                        bottomLeft.attrs.y = activeAnchor.attrs.y;
                        topRight.attrs.x = activeAnchor.attrs.x;
                        break;
                    case "bottomLeft":
                        bottomRight.attrs.y = activeAnchor.attrs.y;
                        topLeft.attrs.x = activeAnchor.attrs.x;
                        break;
                }
                rect.setSize(topRight.attrs.x - topLeft.attrs.x, bottomLeft.attrs.y - topLeft.attrs.y);
                var x = topLeft.attrs.x + rect.getWidth()/2 ;
                var y = topLeft.attrs.y + rect.getHeight()/2;
                group.setOffset( x, y );
                rect.setPosition(topLeft.attrs.x,topLeft.attrs.y);
                centerPoint.setPosition( rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2);
            }
            rotationPoint.setPosition( rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2 );
        }
    }

    /**
     * Pen functionality. Pen is not a function of KineticJS :(
     *
     * @access private
     * @return void
     */
    tools.pen = function() {
        var tool = this;
        this.started = false;

        var pencilLayer = new Kinetic.Layer({ listening: true});
        //var pencilLayer = that.layer;
        var contextPencilLayer = pencilLayer.getContext();
        that.stage.add(pencilLayer);

        that.stage.on("mousedown.pen", function() {
            var mousePos = that.stage.getMousePosition();
            contextPencilLayer.beginPath();
            contextPencilLayer.moveTo(mousePos.x, mousePos.y);
            tool.started = true;
        });

        that.stage.on("mousemove.pen", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                contextPencilLayer.lineTo(mousePos.x, mousePos.y);
                contextPencilLayer.strokeStyle = $("#tool_pen_color").css("background-color");
                contextPencilLayer.lineWidth = $("#pen_size").val();
                contextPencilLayer.stroke();
            }
        });

        that.stage.on("mouseup.pen", function() {
            if (tool.started) {
                tool.started = false;
            }
        });
    };

    /**
     * Line functionality
     *
     * @access private
     * @return void
     */
    tools.line = function() {
        var tool = this;
        tool.started = false;

        lineScope = null;

        that.stage.on("mousedown.line", function() {
            if ( tool.started ){
                tool.started = false;
                that.layer.draw();
            }

            var mousePos = that.stage.getMousePosition();

            var line = new Kinetic.Line({
                name: "line",
                points: [mousePos.x,mousePos.y,mousePos.x,mousePos.y],
                stroke: $("#tool_line_color").css("background-color"),
                strokeWidth: $("#line_size").val(),
                draggable: false
            });

            lineScope = line;

            var option = $("#tool_line_options").find(".active").find("span").attr("id");

            switch ( option ){
                case "tool_dashed":
                    line.setAttrs({dashArray: [20, 10]});
                    break;
                case "tool_dotted":
                    line.setAttrs({dashArray: [5, 10]});
                    break;
                default:break;
            }

            var lineGroup = new Kinetic.Group({
                x: 0,
                y: 0,
                name: "lineGroup",
                listening: true,
                draggable: true,
                dragBoundFunc: function(pos) {
                    if ( that.select ){
                        return {
                            x: pos.x,
                            y: pos.y
                        }
                    }else{
                        return {
                            x: this.getPosition().x,
                            y: this.getPosition().y
                        }
                    }
                }
            });

            lineGroup.on("dblclick dbltap", function(e) {
                if ( that.select ){
                    e.cancelBubble = true;
                    this.removeChildren();
                    that.layer.draw();
                }
            });

            lineGroup.on("dragstart", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "pointer";
                    if ( !this.get(".start")[0] && !lineGroup.get(".end")[0] ){
                        var line = this.get(".line")[0];
                        that.addAnchor(this, line.getPoints()[0].x, line.getPoints()[0].y, "start");
                        that.addAnchor(this, line.getPoints()[1].x, line.getPoints()[1].y, "end");
                    }
                }
            });

            lineGroup.on("dragend", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "default";
                }
            });

            lineGroup.on("click", function(e){
                if ( that.select ){
                    var line = this.get(".line")[0];
                    if ( line ){
                        if ( lineGroup.get(".start")[0] && lineGroup.get(".end")[0] ){
                            lineGroup.get(".start")[0].remove();
                            lineGroup.get(".end")[0].remove();
                        }
                        else{
                            that.addAnchor(lineGroup, line.getPoints()[0].x, line.getPoints()[0].y, "start");
                            that.addAnchor(lineGroup, line.getPoints()[1].x, line.getPoints()[1].y, "end");
                        }
                    }
                }
            });

            lineGroup.add(line);
            that.layer.add(lineGroup);
            that.layer.draw();
            that.stage.add(that.layer);

            tool.started = true;
        });

        that.stage.on("mousemove.line", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                lineScope.getPoints()[1].x = mousePos.x;
                lineScope.getPoints()[1].y = mousePos.y;
                that.layer.draw();
            }
        });

        that.stage.on("mouseup.line", function() {
            if (tool.started) {
                tool.started = false;
            }
        });
    };

    /**
     * Rectangle functionality
     *
     * @access private
     * @return void
     */
    tools.rectangle = function() {
        var tool = this;
        this.started = false;

        rectScope = null;
        rectGroupScope = null;

        that.stage.on("mousedown.rectangle", function() {
            if ( tool.started ){
                tool.started = false;
                that.layer.draw();
            }
            var mousePos = that.stage.getMousePosition();

            var rectGroup = new Kinetic.Group({
                x: 0,
                y: 0,
                name: "rectGroup",
                listening: true,
                draggable: true,
                dragBoundFunc: function(pos) {
                    if ( that.select ){
                        return {
                            x: pos.x,
                            y: pos.y
                        }
                    }else{
                        return {
                            x: this.getPosition().x,
                            y: this.getPosition().y
                        }
                    }
                }
            });

            rectGroupScope = rectGroup;

            var rect = new Kinetic.Rect({
                name: "rect",
                x: mousePos.x,
                y: mousePos.y,
                width: 10,
                height: 10,
                fill: $("#tool_filling_color").css("background-color"),
                stroke: $("#tool_border_color").css("background-color"),
                strokeWidth: $("#forms_border_size").val(),
                draggable: false
            });

            rectScope = rect;

            rectGroup.on("dblclick dbltap", function(e) {
                if ( that.select ){
                    e.cancelBubble = true;
                    this.removeChildren();
                    that.layer.draw();
                }
            });

            rectGroup.on("dragstart", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    tool.started = false;
                    document.body.style.cursor = "pointer";
                    if ( !this.get(".topLeft")[0] ){
                        var rect = this.get(".rect")[0];
                        that.addAnchor(this, rect.getPosition().x, rect.getPosition().y, "topLeft");
                        that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y, "topRight");
                        that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight(), "bottomRight");
                        that.addAnchor(this, rect.getPosition().x, rect.getPosition().y + rect.getHeight(), "bottomLeft");
                        that.addCenterAnchor(this, rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2, "center");
                        that.addRotationAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2, "rotation");
                    }
                }
            });

            rectGroup.on("dragend", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "default";
                }
            });

            rectGroup.on("click", function(e){
                if ( that.select ){
                    tool.started = false;
                    if ( this.get(".topRight")[0] ){
                        this.get(".topRight")[0].remove();
                        this.get(".bottomRight")[0].remove();
                        this.get(".topLeft")[0].remove();
                        this.get(".bottomLeft")[0].remove();
                        this.get(".center")[0].remove();
                        this.get(".rotation")[0].remove();
                    }
                    else{
                        var rect = this.get(".rect")[0];
                        that.addAnchor(this, rect.getPosition().x, rect.getPosition().y, "topLeft");
                        that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y, "topRight");
                        that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight(), "bottomRight");
                        that.addAnchor(this, rect.getPosition().x, rect.getPosition().y + rect.getHeight(), "bottomLeft");
                        that.addCenterAnchor(this, rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2, "center");
                        that.addRotationAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2, "rotation");
                    }
                }
            });

            if ( !that.select ){
                rectGroup.add(rect);
                that.layer.add(rectGroup);
                tool.started = true;
            }

            that.layer.draw();
            that.stage.add(that.layer);
        });

        that.stage.on("mousemove.rectangle", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                rectScope.setWidth( mousePos.x - rectScope.getPosition().x + 10 );
                rectScope.setHeight( mousePos.y - rectScope.getPosition().y + 10 );
                that.layer.draw();
            }
        });

        that.stage.on("mouseup.rectangle", function() {
            if (tool.started) {
                tool.started = false;
                var x = rectGroupScope.getPosition().x + rectScope.getWidth()/2 ;
                var y = rectGroupScope.getPosition().y + rectScope.getHeight()/2;
                rectGroupScope.setOffset( x, y );
                rectGroupScope.setAbsolutePosition(rectScope.getPosition().x + rectScope.getWidth()/2, rectScope.getPosition().y + rectScope.getHeight()/2);
                rectScope.setPosition(0,0);
                rectGroupScope.setSize( rectScope.getWidth(), rectScope.getHeight() );
                that.layer.draw();
            }
        });
    };

    /**
     * Square functionality
     *
     * @access private
     * @return void
     */
    tools.square = function() {
        var tool = this;
        this.started = false;

        squareScope = null;
        squareGroupScope = null;

        that.stage.on("mousedown.square", function() {
            if ( tool.started ){
                tool.started = false;
                that.layer.draw();
            }
            var mousePos = that.stage.getMousePosition();

            var squareGroup = new Kinetic.Group({
                x: 0,
                y: 0,
                name: "squareGroup",
                listening: true,
                draggable: true,
                dragBoundFunc: function(pos) {
                    if ( that.select ){
                        return {
                            x: pos.x,
                            y: pos.y
                        }
                    }else{
                        return {
                            x: this.getPosition().x,
                            y: this.getPosition().y
                        }
                    }
                }
            });

            squareGroupScope = squareGroup;

            var square = new Kinetic.Rect({
                name: "square",
                x: mousePos.x,
                y: mousePos.y,
                width: 10,
                height: 10,
                fill: $("#tool_filling_color").css("background-color"),
                stroke: $("#tool_border_color").css("background-color"),
                strokeWidth: $("#forms_border_size").val(),
                draggable: false
            });

            squareScope = square;

            squareGroup.on("dblclick dbltap", function(e) {
                if ( that.select ){
                    e.cancelBubble = true;
                    this.removeChildren();
                    that.layer.draw();
                }
            });

            squareGroup.on("dragstart", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    tool.started = false;
                    document.body.style.cursor = "pointer";
                    if ( !this.get(".topLeft")[0] ){
                        var square = this.get(".square")[0];
                        that.addAnchor(this, square.getPosition().x, square.getPosition().y, "topLeft");
                        that.addAnchor(this, square.getPosition().x + square.getWidth(), square.getPosition().y, "topRight");
                        that.addCenterAnchor(this, square.getPosition().x + square.getWidth()/2, square.getPosition().y + square.getHeight()/2, "center");
                        that.addRotationAnchor(this, square.getPosition().x + square.getWidth(), square.getPosition().y + square.getHeight()/2, "rotation");
                        this.get(".topRight")[0].setVisible(false);
                    }
                }
            });

            squareGroup.on("dragend", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "default";
                }
            });

            squareGroup.on("click", function(e){
                if ( that.select ){
                    tool.started = false;
                    if ( this.get(".topRight")[0] ){
                        this.get(".topRight")[0].remove();
                        this.get(".topLeft")[0].remove();
                        this.get(".center")[0].remove();
                        this.get(".rotation")[0].remove();
                    }
                    else{
                        var square = this.get(".square")[0];
                        that.addAnchor(this, square.getPosition().x, square.getPosition().y, "topLeft");
                        that.addAnchor(this, square.getPosition().x + square.getWidth(), square.getPosition().y, "topRight");
                        that.addCenterAnchor(this, square.getPosition().x + square.getWidth()/2, square.getPosition().y + square.getHeight()/2, "center");
                        that.addRotationAnchor(this, square.getPosition().x + square.getWidth(), square.getPosition().y + square.getHeight()/2, "rotation");
                        this.get(".topRight")[0].setVisible(false);
                    }
                }
            });

            if ( !that.select ){
                squareGroup.add(square);
                that.layer.add(squareGroup);
                tool.started = true;
            }

            that.layer.draw();
            that.stage.add(that.layer);
        });

        that.stage.on("mousemove.square", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                squareScope.setWidth( mousePos.x - squareScope.getPosition().x + 10 );
                squareScope.setHeight( squareScope.getWidth() );
                that.layer.draw();
            }
        });

        that.stage.on("mouseup.square", function() {
            if (tool.started) {
                tool.started = false;
                var x = squareGroupScope.getPosition().x + squareScope.getWidth()/2 ;
                var y = squareGroupScope.getPosition().y + squareScope.getHeight()/2;
                squareGroupScope.setOffset( x, y );
                squareGroupScope.setAbsolutePosition(squareScope.getPosition().x + squareScope.getWidth()/2, squareScope.getPosition().y + squareScope.getHeight()/2);
                squareScope.setPosition(0,0);
                squareGroupScope.setSize( squareScope.getWidth(), squareScope.getHeight() );
                that.layer.draw();
            }
        });
    };

    /**
     * Circle functionality.
     *
     * @access private
     * @return void
     */
    tools.circle = function() {
        var tool = this;
        this.started = false;

        circleScope = null;
        circleGroupScope = null;

        that.stage.on("mousedown.circle", function() {
            if ( tool.started ){
                tool.started = false;
                that.layer.draw();
            }
            var mousePos = that.stage.getMousePosition();

            var circleGroup = new Kinetic.Group({
                x: 0,
                y: 0,
                name: "circleGroup",
                listening: true,
                draggable: true,
                dragBoundFunc: function(pos) {
                    if ( that.select ){
                        return {
                            x: pos.x,
                            y: pos.y
                        }
                    }else{
                        return {
                            x: this.getPosition().x,
                            y: this.getPosition().y
                        }
                    }
                }
            });

            circleGroupScope = circleGroup;

            var circle = new Kinetic.Circle({
                name: "circle",
                x: mousePos.x,
                y: mousePos.y,
                radius: 5,
                fill: $("#tool_filling_color").css("background-color"),
                stroke: $("#tool_border_color").css("background-color"),
                strokeWidth: $("#forms_border_size").val(),
                draggable: false
            });

            circleScope = circle;

            circleGroup.on("dblclick dbltap", function(e) {
                if ( that.select ){
                    e.cancelBubble = true;
                    this.removeChildren();
                    that.layer.draw();
                }
            });

            circleGroup.on("dragstart", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    tool.started = false;
                    document.body.style.cursor = "pointer";
                    if ( !this.get(".right")[0] ){
                        var circle = this.get(".circle")[0];
                        that.addAnchor(this, circle.getPosition().x+circle.getRadius(), circle.getPosition().y, "right");
                        that.addCenterAnchor(this, circle.getPosition().x, circle.getPosition().y, "center");
                    }
                }
            });

            circleGroup.on("dragend", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "default";
                }
            });

            circleGroup.on("click", function(e){
                if ( that.select ){
                    tool.started = false;
                    if ( this.get(".right")[0] ){
                        this.get(".right")[0].remove();
                        this.get(".center")[0].remove();
                    }
                    else{
                        var circle = this.get(".circle")[0];
                        that.addAnchor(this, circle.getPosition().x+circle.getRadius(), circle.getPosition().y, "right");
                        that.addCenterAnchor(this, circle.getPosition().x, circle.getPosition().y, "center");
                    }
                }
            });

            if ( !that.select ){
                circleGroup.add(circle);
                that.layer.add(circleGroup);
                tool.started = true;
            }

            that.layer.draw();
            that.stage.add(that.layer);
        });

        that.stage.on("mousemove.circle", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                var radius = mousePos.x - circleScope.getPosition().x + 5;
                if ( radius < 5 ){
                    radius = 5;
                }
                circleScope.setRadius( radius );
                that.layer.draw();
            }
        });

        that.stage.on("mouseup.circle", function() {
            if (tool.started) {
                tool.started = false;
                that.layer.draw();
            }
        });
    };

    /**
     * Ellipse functionality.
     *
     * @access private
     * @return void
     */
    tools.ellipse = function() {
        var tool = this;
        this.started = false;

        ellipseScope = null;
        ellipseGroupScope = null;

        that.stage.on("mousedown.ellipse", function() {
            if ( tool.started ){
                tool.started = false;
                that.layer.draw();
            }
            var mousePos = that.stage.getMousePosition();

            var ellipseGroup = new Kinetic.Group({
                x: 0,
                y: 0,
                name: "ellipseGroup",
                listening: true,
                draggable: true,
                dragBoundFunc: function(pos) {
                    if ( that.select ){
                        return {
                            x: pos.x,
                            y: pos.y
                        }
                    }else{
                        return {
                            x: this.getPosition().x,
                            y: this.getPosition().y
                        }
                    }
                }
            });

            ellipseGroupScope = ellipseGroup;

            var ellipse = new Kinetic.Ellipse({
                name: "ellipse",
                x: mousePos.x,
                y: mousePos.y,
                radius: [10,5],
                fill: $("#tool_filling_color").css("background-color"),
                stroke: $("#tool_border_color").css("background-color"),
                strokeWidth: $("#forms_border_size").val(),
                draggable: false
            });

            ellipseScope = ellipse;

            ellipseGroup.on("dblclick dbltap", function(e) {
                if ( that.select ){
                    e.cancelBubble = true;
                    this.removeChildren();
                    that.layer.draw();
                }
            });

            ellipseGroup.on("dragstart", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    tool.started = false;
                    document.body.style.cursor = "pointer";
                    if ( !this.get(".left")[0] ){
                        var ellipse = this.get(".ellipse")[0];
                        that.addAnchor(this, ellipse.getPosition().x, ellipse.getPosition().y - ellipse.getRadius().y, "top");
                        that.addAnchor(this, ellipse.getPosition().x - ellipse.getRadius().x, ellipse.getPosition().y, "left");
                        that.addRotationAnchor(this, ellipse.getPosition().x + ellipse.getRadius().x, ellipse.getPosition().y, "rotation");
                        that.addCenterAnchor(this, ellipse.getPosition().x, ellipse.getPosition().y, "center");
                    }
                }
            });

            ellipseGroup.on("dragend", function(e){
                e.cancelBubble = true;
                if ( that.select ){
                    document.body.style.cursor = "default";
                }
            });

            ellipseGroup.on("click", function(e){
                if ( that.select ){
                    tool.started = false;
                    if ( this.get(".left")[0] ){
                        this.get(".left")[0].remove();
                        this.get(".top")[0].remove();
                        this.get(".rotation")[0].remove();
                        this.get(".center")[0].remove();
                    }
                    else{
                        var ellipse = this.get(".ellipse")[0];
                        that.addAnchor(this, ellipse.getPosition().x, ellipse.getPosition().y - ellipse.getRadius().y, "top");
                        that.addAnchor(this, ellipse.getPosition().x - ellipse.getRadius().x, ellipse.getPosition().y, "left");
                        that.addRotationAnchor(this, ellipse.getPosition().x + ellipse.getRadius().x, ellipse.getPosition().y, "rotation");
                        that.addCenterAnchor(this, ellipse.getPosition().x, ellipse.getPosition().y, "center");
                    }
                }
            });

            if ( !that.select ){
                ellipseGroup.add(ellipse);
                that.layer.add(ellipseGroup);
                tool.started = true;
            }

            that.layer.draw();
            that.stage.add(that.layer);
        });

        that.stage.on("mousemove.ellipse", function() {
            if (tool.started) {
                var mousePos = that.stage.getMousePosition();
                var xRadius = mousePos.x - ellipseScope.getPosition().x + 10;
                var yRadius = mousePos.y - ellipseScope.getPosition().y + 5;
                if ( xRadius < 5 ){
                    xRadius = 5;
                }
                if ( yRadius < 5 ){
                    yRadius = 5;
                }
                ellipseScope.setRadius( [xRadius, yRadius]);
                that.layer.draw();
            }
        });

        that.stage.on("mouseup.ellipse", function() {
            if (tool.started) {
                tool.started = false;
                ellipseGroupScope.setOffset( ellipseGroupScope.getPosition().x, ellipseGroupScope.getPosition().y );
                ellipseGroupScope.setAbsolutePosition(ellipseScope.getPosition().x,ellipseScope.getPosition().y);
                ellipseScope.setPosition(0,0);
                ellipseGroupScope.setSize( ellipseScope.getWidth(), ellipseScope.getHeight() );
                that.layer.draw();
            }
        });
    };

    /**
     * Text functionality.
     *
     * @access private
     * @return void
     */
    tools.text = function() {
        var tool = this;
        this.started = false;
        this.stopPropagationE = true;

        that.stage.on("click.text", function() {
            if ( !tool.started ){
                tool.started = true;
                var mousePos = that.stage.getMousePosition();

                var option = $("#tool_text_options").find(".active").find("span").attr("id");
                var fontStyle = "";

                switch ( option ){
                    case "tool_underline":
                        fontStyle = "text-decoration: underline;";
                        break;
                    case "tool_bold":
                        fontStyle = "font-weight: bold;";
                        break;
                    case "tool_italic":
                        fontStyle = "font-style: italic;";
                        break;
                    default:break;
                }

                var inputTextField = $("<div id='tool_input_text_box' style='top:"+mousePos.y+"px;left:"+mousePos.x+"px;'><textarea id='tool_input_text' placeholder='Your text...' style='"+fontStyle+" font-family:"+$("#font").val()+"; font-size:"+ $("#text_size").val() + "pt; color:" + $("#tool_text_color").css("background-color") + "; '></textarea><button type='submit' id='tool_input_text_submit'>Write</button></div>");

                var id = $("#slide_row").find(".active").parent().attr("rel");
                $("#board .kineticjs-content").append(inputTextField);

                $(document).click(function(e){
                    if ( !tool.stopPropagationE &&
                        $(e.target).attr("id") != "tool_input_text_box" &&
                        $(e.target).attr("id") != "tool_input_text" &&
                        $(e.target).attr("id") != "tool_input_text_submit" ){
                        $("#tool_input_text_box").remove();
                        $(this).unbind("click");
                        tool.started = false;
                        tool.stopPropagationE = true;
                        console.log("true");

                    }else{
                        console.log("false");
                        tool.stopPropagationE = false;
                    }
                });

                $("#tool_input_text_submit").click(function(e){
                    if ( $("#tool_input_text").val() != "" ){

                        var textGroup = new Kinetic.Group({
                            x: 0,
                            y: 0,
                            name: "textGroup",
                            listening: true,
                            draggable: true,
                            dragBoundFunc: function(pos) {
                                if ( that.select ){
                                    return {
                                        x: pos.x,
                                        y: pos.y
                                    }
                                }else{
                                    return {
                                        x: this.getPosition().x,
                                        y: this.getPosition().y
                                    }
                                }
                            }
                        });

                        var text = new Kinetic.Text({
                            name: "text",
                            x: mousePos.x,
                            y: mousePos.y,
                            fontFamily: $("#font").val(),
                            fontSize: $("#text_size").val(),
                            textFill: $("#tool_text_color").css("background-color"),
                            draggable: false
                        });

                        text.setAttrs({text: $("#tool_input_text").val()});
                        var option = $("#tool_text_options").find(".active").find("span").attr("id");

                        switch ( option ){
                            case "tool_underline":
                                break;
                            case "tool_bold":
                                text.setAttrs({fontStyle: "bold"});
                                break;
                            case "tool_italic":
                                text.setAttrs({fontStyle: "italic"});
                                break;
                            default:break;
                        }

                        textGroup.on("dblclick dbltap", function(e) {
                            e.cancelBubble = true;
                            if ( that.select ){
                                e.cancelBubble = true;
                                this.removeChildren();
                                that.layer.draw();
                            }
                        });

                        textGroup.on("dragstart", function(e){
                            e.cancelBubble = true;
                            if ( that.select ){
                                tool.started = false;
                                document.body.style.cursor = "pointer";
                                if ( !this.get(".topLeft")[0] ){
                                    var rect = this.get(".text")[0];
                                    that.addAnchor(this, rect.getPosition().x, rect.getPosition().y, "topLeft");
                                    that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y, "topRight");
                                    that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight(), "bottomRight");
                                    that.addAnchor(this, rect.getPosition().x, rect.getPosition().y + rect.getHeight(), "bottomLeft");
                                    that.addCenterAnchor(this, rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2, "center");
                                    that.addRotationAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2, "rotation");
                                }
                            }
                        });

                        textGroup.on("dragend", function(e){
                            e.cancelBubble = true;
                            if ( that.select ){
                                document.body.style.cursor = "default";
                            }
                        });

                        textGroup.on("click", function(e){
                            if ( that.select ){
                                tool.started = false;
                                if ( this.get(".topRight")[0] ){
                                    this.get(".topRight")[0].remove();
                                    this.get(".bottomRight")[0].remove();
                                    this.get(".topLeft")[0].remove();
                                    this.get(".bottomLeft")[0].remove();
                                    this.get(".center")[0].remove();
                                    this.get(".rotation")[0].remove();
                                }
                                else{
                                    var rect = this.get(".text")[0];
                                    that.addAnchor(this, rect.getPosition().x, rect.getPosition().y, "topLeft");
                                    that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y, "topRight");
                                    that.addAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight(), "bottomRight");
                                    that.addAnchor(this, rect.getPosition().x, rect.getPosition().y + rect.getHeight(), "bottomLeft");
                                    that.addCenterAnchor(this, rect.getPosition().x + rect.getWidth()/2, rect.getPosition().y + rect.getHeight()/2, "center");
                                    that.addRotationAnchor(this, rect.getPosition().x + rect.getWidth(), rect.getPosition().y + rect.getHeight()/2, "rotation");
                                }
                            }
                        });

                        if ( !that.select && tool.started ){
                            textGroup.add(text);
                            that.layer.add(textGroup);

                            var x = textGroup.getPosition().x + text.getWidth()/2 ;
                            var y = textGroup.getPosition().y + text.getHeight()/2;
                            textGroup.setOffset( x, y );
                            textGroup.setAbsolutePosition(text.getPosition().x + text.getWidth()/2, text.getPosition().y + text.getHeight()/2);
                            text.setPosition(0,0);
                            textGroup.setSize( text.getWidth(), text.getHeight() );

                            that.layer.draw();
                            that.stage.add(that.layer);

                            console.log(that.stage);
                            $(document).click();

                        }
                    }
                });
            }

        });
    };


    /**
     * Select functionality.
     *
     * @access private
     * @return void
     */
    tools.select = function(){
        that.select = true;
    }


    /**
     * Init method sets up event handler for different tools.
     *
     * @access public
     * @return void
     */
    this.init = function(){
        $(".tool").parent("td").click( function(){

            that.stage = WBOARD.htwg.stage.stage;
            that.layer = WBOARD.htwg.stage.stageLayer;
            that.context = that.layer.getContext();

            console.log(that.stage);

            that.select = false;
            $(".tool_option").hide();
            toolID = $(this).find("span").attr("id");
            $("#tool_"+toolID+"_options").show();
            $(".tool").parent("td").removeClass("active");
            $(this).toggleClass("active");
            $(".form").each(function(idx, elem){
                that.stage.off("."+$(elem).attr("id"));
            })
            $(".tool").each(function(idx, elem){
                that.stage.off("."+$(elem).attr("id"));
            })
            $(".form").parent("td").removeClass("active");
            $(".text").parent("td").removeClass("active");
            $(".text").parent("td").click(function(){
                $(".text").parent("td").removeClass("active");
                $(this).toggleClass("active");
            });
            if ( toolID == "forms" ){
                $(".form").parent("td").click( function(){
                    $(".form").each(function(idx, elem){
                        that.stage.off("."+$(elem).attr("id"));
                    })
                    toolID = $(this).find("span").attr("id");
                    $(".form").parent("td").removeClass("active");
                    $(this).toggleClass("active");
                    if (tools[toolID]) {
                        tool = new tools[toolID]();
                    }
                });
            }
            if (tools[toolID]) {
                tool = new tools[toolID]();
            }

        })

        $(".tool_option_item").parent("td").click( function(){
            $(".tool_option_item").parent("td").removeClass("active");
            $(this).toggleClass("active");
        })
    }

    this.init();
}