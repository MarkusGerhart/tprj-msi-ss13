spray = function() {
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
    this.sock.onopen = function(evt) {
      this.onopen(evt);
    };
    this.sock.onclose = function(evt) {
      this.onclose(evt);
    };
    this.sock.onmessage = function(evt) {
      this.onmessage(evt);
    };
    this.sock.onerror = function(evt) {
      this.onerror(evt);
    };
  };
  spray.WebSocket.prototype.onopen = function(event) {
    console.log("WebSocket connected.");
  };
  spray.WebSocket.prototype.onclose = function(event) {
    console.log("WebSocket disconnected.");
  };
  spray.WebSocket.prototype.onmessage = function(event) {
    console.log("WebSocket got: " + event.data);
  };
  spray.WebSocket.prototype.onerror = function(event) {
    console.log("WebSocket got error: " + event.data);
  };
  spray.WebSocket.prototype.send = function(message) {
    console.log("WebSocket send: " + message);
    this.sock.send(message);
  };
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