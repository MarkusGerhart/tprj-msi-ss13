var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.document = document;
htwg.spray.window = window;

// class: Websocket
htwg.spray.WebSocket = function (wsURI) {
  var WebSocket = htwg.spray.require("WebSocket")
  this.sock = new WebSocket(wsURI);
  this.ready = false;
  self = this;  // for correct closure
  this.sock.onopen = function(evt) { self.onopen(evt) };
  this.sock.onclose = function(evt) { self.onclose(evt) };
  this.sock.onmessage = function(evt) { self.onmessage(evt) };
  this.sock.onerror = function(evt) { self.onerror(evt) };
}

htwg.spray.WebSocket.prototype.onopen = function (event) {
  this.ready = true;
  //console.log("WebSocket connected.");
}

htwg.spray.WebSocket.prototype.onclose = function (event) {
  this.ready = false;
  console.log("WebSocket disconnected.");
}

htwg.spray.WebSocket.prototype.onmessage = function (evt) {
    //console.log("WebSocket got evt.data: " + evt.data);

    var json1 = JSON.parse(evt.data);

    if (json1.command == "load" && json1.text != '') {
        var json2 = JSON.parse(json1.text);
        htwg.spray.utils.model = json2.domainObj
        htwg.spray.utils.setModel();
    }

  //this.sock.close();
}

htwg.spray.WebSocket.prototype.onerror = function (event) {
  console.log("WebSocket got error: " + event.data);
}

htwg.spray.WebSocket.prototype.send = function (message) {
  try{
      //console.log("WebSocket send: " + JSON.stringify(message));
      this.sock.send(JSON.stringify( message ));
      return message;
  }catch(e){
      console.log(e);
  }
}

htwg.spray.require = function (dep) {
    if (dep == "WebSocket") {
        if (htwg.spray.window["MozWebSocket"] != undefined) {
            return htwg.spray.window["MozWebSocket"];
        } else {
            return htwg.spray.window["WebSocket"];
        }
    }
    return htwg.spray.window[dep];
}