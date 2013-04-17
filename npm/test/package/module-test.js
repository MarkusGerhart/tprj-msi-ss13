var vows = require("vows"),
    load = require("../load"),
    assert = require("../assert");

var suite = vows.describe("spray.module");

suite.addBatch({
  "foo()": {
    topic: load("package/module").expression("spray.foo"),
    "returns the string 'bar'": function(f) {
      assert.equal(f(), "bar");
    },
    "and has the length 3": function(f) {
      assert.equal(f().length, 3)
    }
  }
});

suite.export(module);
