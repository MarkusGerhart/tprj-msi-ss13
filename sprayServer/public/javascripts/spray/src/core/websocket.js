import "../core/browser"

// class: Websocket

spray.WebSocket = function (wsURI) {
  var WebSocket = spray.require("WebSocket")
  this.sock = new WebSocket(wsURI);
  this.ready = false;
  self = this;  // for correct closure
  this.sock.onopen = function(evt) { self.onopen(evt) };
  this.sock.onclose = function(evt) { self.onclose(evt) };
  this.sock.onmessage = function(evt) { self.onmessage(evt) };
  this.sock.onerror = function(evt) { self.onerror(evt) };
}

spray.WebSocket.prototype.onopen = function (event) {
  this.ready = true;
  console.log("WebSocket connected.");
}

spray.WebSocket.prototype.onclose = function (event) {
  this.ready = false;
  console.log("WebSocket disconnected.");
}

spray.WebSocket.prototype.onmessage = function (evt) {
  console.log("WebSocket got: " + evt.data);
  //this.sock.close();
}

spray.WebSocket.prototype.onerror = function (event) {
  console.log("WebSocket got error: " + event.data);
}

spray.WebSocket.prototype.send = function (message) {
  console.log("WebSocket send: " + message);
  this.sock.send(message);
  return message;
}