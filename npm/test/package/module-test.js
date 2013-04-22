var vows = require("vows"),
    load = require("../load"),
    assert = require("../assert");

var suite = vows.describe("spray.module");

suite.addBatch({
  "foo()": {
    topic: load("package/module").document(),
    "returns the string 'bar'": function(spray) {
      assert.equal(spray.foo(), "bar");
    },
    "and has the length 3": function(spray) {
      assert.equal(spray.foo().length, 3)
    },
    "adds #foo to the dom": function(spray) {
      spray.foo();
      var elem = spray.document.getElementById("foo");
      assert.equal(elem.innerHTML, "bar");
    }
  }
});

suite.export(module);
