spray.document = document;
spray.window = window;

spray.require = function (dep) {
  if (dep == "WebSocket") {
    if (spray.window["MozWebSocket"] != undefined) {
      return spray.window["MozWebSocket"];
    } else {
      return spray.window["WebSocket"];
    }
  }
  return spray.window[dep];
}