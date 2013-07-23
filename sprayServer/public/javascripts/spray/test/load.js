process.env.TZ = "Europe/Berlin";

var smash = require("smash"),
    d3 = require("d3"),
    jsdom = require("jsdom");

//require("./XMLHttpRequest");

module.exports = function() {
  var files = [].slice.call(arguments).map(function(d) { return "src/" + d; }),
      expression = "spray",
      sandbox = null;

  files.unshift("src/start");
  files.push("src/end");

  function topic() {
    smash.load(files, expression, sandbox, this.callback);
  }

  topic.expression = function(_) {
    expression = _;
    return topic;
  };

  topic.document = function(_) {
    var document = jsdom.jsdom("<html><head></head><body></body></html>");

    // Monkey-patch createRange support to JSDOM.
    document.createRange = function() {
      return {
        selectNode: function() {},
        createContextualFragment: jsdom.jsdom
      };
    };

    var window = document.createWindow();
    window.d3 = d3;

    sandbox = {
      console: console,
      //XMLHttpRequest: XMLHttpRequest,
      document: document,
      window: window,
      setTimeout: setTimeout,
      clearTimeout: clearTimeout,
      Date: Date // so we can override Date.now in tests
    };

    return topic;
  };

  return topic;
};

process.on("uncaughtException", function(e) {
  console.trace(e.stack);
});
