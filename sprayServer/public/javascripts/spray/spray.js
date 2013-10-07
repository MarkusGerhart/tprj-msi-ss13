var SPRAY = SPRAY || {};
SPRAY.htwg = SPRAY.htwg || {};

SPRAY.htwg.spray = function() {
  var spray = {
    version: "0.0.0"
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
    var WebSocket = spray.require("WebSocket");
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

        init:function(id){
            this._super(id);

            this.setScrollArea("#"+id);

            this.currentDropConnection = null;
        },

        /**
         * @method
         * Called if the DragDrop object is moving around.<br>
         * <br>
         * Graphiti use the jQuery draggable/droppable lib. Please inspect
         * http://jqueryui.com/demos/droppable/ for further information.
         *
         * @param {HTMLElement} droppedDomNode The dragged DOM element.
         * @param {Number} x the x coordinate of the drag
         * @param {Number} y the y coordinate of the drag
         *
         * @template
         **/
        onDrag:function(droppedDomNode, x, y )
        {
        },

        /**
         * @method
         * Called if the user drop the droppedDomNode onto the canvas.<br>
         * <br>
         * Graphiti use the jQuery draggable/droppable lib. Please inspect
         * http://jqueryui.com/demos/droppable/ for further information.
         *
         * @param {HTMLElement} droppedDomNode The dropped DOM element.
         * @param {Number} x the x coordinate of the drop
         * @param {Number} y the y coordinate of the drop
         * @private
         **/
        onDrop : function(droppedDomNode, x, y)
        {
            var type = $(droppedDomNode).data("shape");
            var figure = eval("new "+type+"();");
            // create a command for the undo/redo support
            var command = new draw2d.command.CommandAdd(this, figure, x, y);
            this.getCommandStack().execute(command);
        }
    });

    var d3 = spray.require("d3");
  spray.foo = function() {
    var inner = "bar";
    var elem = spray.document.createElement("div");
    elem.id = "foo";
    elem.innerHTML = inner;
    spray.document.body.appendChild(elem);
    return inner;
  };
  spray.FooBar = function(arg1, arg2) {
    this.arg1 = arg1;
    this.arg2 = arg2;
  };
  spray.FooBar.prototype.mymethod = function(x) {
    return x + this.arg1 + this.arg2;
  };
  return spray;
}();