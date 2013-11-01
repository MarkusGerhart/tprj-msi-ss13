var htwg = htwg || {};

htwg.spray = function() {
  var spray = {
    version: "0.0.0",
    shapes: {},
    locators: {}
  };
  console.log("Welcome to spray.js " + spray.version);
  spray.document = document;
  spray.window = window;
  spray.require = function(dep) {
    if (dep == "WebSocket") {
      if (spray.window["MozWebSocket"] != undefined) {
        return spray.window["MozWebSocket"];
      } else {
        return spray.window["WebSocket"];
      }
    }
    return spray.window[dep];
  };
  spray.WebSocket = function(wsURI) {
    var WebSocket = htwg.spray.require("WebSocket");
    this.sock = new WebSocket(wsURI);
    this.ready = false;
    self = this;
    this.sock.onopen = function(evt) {
      self.onopen(evt);
    };
    this.sock.onclose = function(evt) {
      self.onclose(evt);
    };
    this.sock.onmessage = function(evt) {
      self.onmessage(evt);
    };
    this.sock.onerror = function(evt) {
      self.onerror(evt);
    };
  };
  spray.WebSocket.prototype.onopen = function(event) {
    this.ready = true;
    console.log("WebSocket connected.");
  };
  spray.WebSocket.prototype.onclose = function(event) {
    this.ready = false;
    console.log("WebSocket disconnected.");
  };
  spray.WebSocket.prototype.onmessage = function(evt) {
    console.log("WebSocket got: " + evt.data);
  };
  spray.WebSocket.prototype.onerror = function(event) {
    console.log("WebSocket got error: " + event.data);
  };
  spray.WebSocket.prototype.send = function(message) {
    console.log("WebSocket send: " + message);
    this.sock.send(message);
    return message;
  };
  spray.View = draw2d.Canvas.extend({
    init: function(id) {
      this._super(id);
      this.setScrollArea("#" + id);
      this.currentDropConnection = null;
    },
    onDrag: function(droppedDomNode, x, y) {},
    onDrop: function(droppedDomNode, x, y) {
      var type = $(droppedDomNode).data("shape");
      var figure = eval("new " + type + "();");
      var command = new draw2d.command.CommandAdd(this, figure, x, y);
      this.getCommandStack().execute(command);
    }
  });
  var PI_Vessel_Vertical = {
    shapes: [ {
      name: "rounded-rectangle",
      size: {
        width: 120,
        height: 60
      },
      curve: {
        width: 50,
        height: 50
      },
      shapes: [ {
        name: "text",
        position: {
          x: 3,
          y: 20
        },
        size: {
          width: 100,
          height: 20
        },
        align: {
          horizontal: "center",
          vertical: "middle"
        },
        id: "shapeName",
        shapes: "undefined"
      } ]
    } ]
  };
  var shapeExamples = {
    PI_Vessel_Vertical: PI_Vessel_Vertical
  };
  spray.Generator = function($) {
    var that = this;
    this.shapeElements = [];
    this.draw2dJSON = [];
    this.configMenu = [];
    this.initialize = function() {
      this.convertSprayToDraw2dJSON(shapeExamples);
      $.each(this.draw2dJSON[0], function(name, elem) {
        that.configMenu.push({
          name: name,
          id: name
        });
      });
      this.configMenu.push({});
    };
    this.drawFigure = function(figureName, canvas) {
      if (this.draw2dJSON[0].hasOwnProperty(figureName)) {
        var figure = this.draw2dJSON[0][figureName];
        console.log(figure);
        var draw2dFigure = eval("new " + figure.type + "();");
        canvas.addFigure(draw2dFigure, new draw2d.layout.locator.CenterLocator(canvas));
      }
    };
    this.drawShape = function(parentShape, shape) {
      $.each(shape, function(i, childShape) {
        var draw2dChildShape = eval("new " + childShape.type + "()");
        console.log(childShape.type);
        console.log(parentShape);
        parentShape.addFigure(draw2dChildShape, new draw2d.layout.locator.CenterLocator(parentShape));
        if (childShape.hasOwnProperty("children")) {}
      });
    };
    this.convertSprayToDraw2dJSON = function(json) {
      $.each(json, function(name, sprayShape) {
        var draw2dShapeJSON = that.convertSprayToDraw2dShape(sprayShape.shapes);
        obj = {};
        obj[name] = {
          type: "draw2d.shape.layout.HorizontalLayout",
          children: draw2dShapeJSON
        };
        that.draw2dJSON.push(obj);
      });
    };
    this.convertSprayToDraw2dShape = function(sprayShapes) {
      var result = [];
      $.each(sprayShapes, function(i, sprayChildShape) {
        draw2dElementObj = that.convertSprayToDraw2dObj(sprayChildShape);
        result.push(draw2dElementObj);
        if (sprayChildShape.shapes != "undefined") {
          draw2dElementObj["children"] = that.convertSprayToDraw2dShape(sprayChildShape.shapes);
        }
      });
      if (result.length > 0) return result;
      return null;
    };
    this.convertSprayToDraw2dObj = function(sprayShape) {
      var draw2dElementObj = {};
      switch (sprayShape.name) {
       case "rounded-rectangle":
        draw2dElementObj["type"] = "draw2d.shape.basic.Rectangle";
        draw2dElementObj["width"] = sprayShape.size.width;
        draw2dElementObj["height"] = sprayShape.size.height;
        draw2dElementObj["radius"] = sprayShape.curve.width;
        break;

       case "text":
        draw2dElementObj["type"] = "draw2d.shape.basic.Label";
        draw2dElementObj["text"] = sprayShape.id;
        draw2dElementObj["width"] = sprayShape.size.width;
        draw2dElementObj["height"] = sprayShape.size.height;
        draw2dElementObj["cssClass"] = "label_" + sprayShape.align.horizontal + "_" + sprayShape.align.vertical;
        break;

       case "line":
        break;

       default:      }
      if (!sprayShape.hasOwnProperty("position")) {
        draw2dElementObj["x"] = 0;
        draw2dElementObj["y"] = 0;
      } else {
        draw2dElementObj["x"] = sprayShape.position.x;
        draw2dElementObj["y"] = sprayShape.position.y;
      }
      return draw2dElementObj;
    };
    this.initialize();
  };
  spray.shapes.Rectangle = draw2d.shape.basic.Rectangle.extend({
    NAME: "spray.shapes.Rectangle",
    init: function(width, height) {
      this._super(width, height);
      this.widthDimensionRatioToRoot = 1;
      this.heightDimensionRatioToRoot = 1;
    },
    setWidthDimensionRatioToRoot: function(ratio) {
      this.widthDimensionRatioToRoot = ratio;
    },
    setHeightDimensionRatioToRoot: function(ratio) {
      this.heightDimensionRatioToRoot = ratio;
    },
    onOtherFigureIsResizing: function(figure) {
      this.setDimension(figure.getWidth() / this.widthDimensionRatioToRoot, figure.getHeight() / this.heightDimensionRatioToRoot);
    }
  });
  spray.shapes.Text = draw2d.shape.basic.Label.extend({
    NAME: "spray.shapes.Label",
    init: function(width, height) {
      this._super(width, height);
      this.widthDimensionRatioToRoot = 1;
      this.heightDimensionRatioToRoot = 1;
    },
    setWidthDimensionRatioToRoot: function(ratio) {
      this.widthDimensionRatioToRoot = ratio;
    },
    setHeightDimensionRatioToRoot: function(ratio) {
      this.heightDimensionRatioToRoot = ratio;
    },
    onOtherFigureIsResizing: function(figure) {
      this.setDimension(figure.getWidth() / this.widthDimensionRatioToRoot, figure.getHeight() / this.heightDimensionRatioToRoot);
      this.repaint();
    }
  });
  spray.Menu = function($) {
    if (jQuery("#menu").length === 0) {
      return false;
    }
    var that = this;
    this.menu = jQuery("#menu");
    this.buildMenu = function(shapes) {
      $.each(shapes, function(i, item) {
        canvasElem = $("<div style='width: 60px; height: 60px; display:none;' id='" + item.id + "'></div>");
        that.menu.append(canvasElem);
        canvas = new draw2d.Canvas(item.id);
        SPRAY.htwg.generator.drawFigure(item.name, canvas);
        var figure = canvas.getFigure(item.id);
        shape = figure.getShapeElement();
        var writer = new draw2d.io.svg.Writer();
        svg = writer.marshal(canvas);
        canvasElem.remove();
        menuElem = $("<div data-shape='" + item.type + "' class='palette_node_element draw2d_droppable' id='" + item.id + "'>" + svg + "</div>");
        that.menu.append(menuElem);
        topPosition = i * 70;
        $("#" + item.id).css("top", topPosition);
        $("#" + item.id).css("z-index", 1);
      });
    };
  };
  spray.Toolbar = function($) {
    if (jQuery("#toolbar").length === 0) {
      return false;
    }
    var that = this;
    this.menu = jQuery("#toolbar");
    this.view = SPRAY.htwg.view;
    this.initialize = function() {
      this.undoButton = $("#undo");
      this.undoButton.click($.proxy(function() {
        that.view.getCommandStack().undo();
      }, this));
      this.redoButton = $("#redo");
      this.redoButton.click($.proxy(function() {
        that.view.getCommandStack().redo();
      }, this));
    };
    this.initialize();
  };
  spray.locators.FigureLocator = draw2d.layout.locator.Locator.extend({
    NAME: "spray.locator.FigureLocator",
    x: 0,
    y: 0,
    init: function(parent) {
      this._super(parent);
    },
    setPos: function(parent, x, y) {
      this.x = x - parent.getX();
      this.y = y - parent.getY();
    },
    relocate: function(index, target) {
      var userData = target.getUserData();
      if (userData != null) {
        if (userData.hasOwnProperty("type")) {
          var talign = userData.textAlign;
          var valign = userData.verticalAlign;
          switch (userData.type) {
           case "Label":
            if (talign == "center" && valign == "middle") {
              console.log(target);
            }
            break;

           default:
            target.setPosition(0, 0);
          }
        }
      } else {
        target.setPosition(0, 0);
      }
      target.repaint();
    }
  });
  return spray;
}();