var vows = require("vows"),
    load = require("../load"),
    assert = require("../assert");

var suite = vows.describe("spray.module");

suite.addBatch({
  "module.foo": {
    topic: load("package/module").document(),
    "returns the string 'bar'": function(spray) {
      //spray.require("d3").select("body");
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

suite.addBatch({
  "module.FooBar": {
    topic: load("package/module").document(),
    "instance with constructor (1,2)": {
      topic: function (spray) {
        return new spray.FooBar(1, 2);
      },
      "mymethod should add the args with x": function (instance) {
        assert.equal(instance.mymethod(3), 1+2+3);
      }
    }
  }
});

suite.export(module);
