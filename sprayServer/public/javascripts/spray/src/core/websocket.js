import "../core/browser"

// class: Websocket

spray.WebSocket = function (wsURI) {
  var WebSocket = spray.require("WebSocket")
  this.sock = new WebSocket(wsURI);
  this.sock.onopen = function(evt) { this.onopen(evt) };
  this.sock.onclose = function(evt) { this.onclose(evt) };
  this.sock.onmessage = function(evt) { this.onmessage(evt) };
  this.sock.onerror = function(evt) { this.onerror(evt) };
}

spray.WebSocket.prototype.onopen = function (event) {
  console.log("WebSocket connected.");
}

spray.WebSocket.prototype.onclose = function (event) {
  console.log("WebSocket disconnected.");
}

spray.WebSocket.prototype.onmessage = function (event) {
  console.log("WebSocket got: " + event.data);
  //this.sock.close();
}

spray.WebSocket.prototype.onerror = function (event) {
  console.log("WebSocket got error: " + event.data);
}

spray.WebSocket.prototype.send = function (message) {
  console.log("WebSocket send: " + message);
  this.sock.send(message);
}