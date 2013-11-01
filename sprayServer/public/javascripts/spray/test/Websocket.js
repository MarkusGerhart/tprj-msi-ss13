describe("WebsocketSpec", function() {
  var sock;

  beforeEach(function() {  // init Classes
    //sock = new spray.WebSocket("ws://localhost:9000/websocket/");
  });

  it("should be able to send a message to the server", function() {

    runs(function() {
      sock = new htwg.spray.WebSocket("ws://localhost:9000/websocket/");
    });

    waitsFor(function() {
      return sock.ready;
    }, "WebSocket should be opended", 3000);

    runs(function() {
      expect(sock.send("hello")).toEqual("hello");
    });

  });

});
