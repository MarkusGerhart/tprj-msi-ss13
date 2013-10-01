package controllers

import play.api._
import play.api.mvc._
import play.api.templates._
import play.api.libs.json._
import play.api.libs.iteratee._

object Application extends Controller {
  
  def index = Action { implicit request =>
    Ok(
      views.html.index("Welcome to spray")
    )
  }

  def websocket = WebSocket.using[String] { request => 
    
    // Log events to the console
    // val in = Iteratee.foreach[String](println).mapDone { _ =>
    //   println("Disconnected")
    // }
    val in = Iteratee.foreach[String](WebSocketHandler.onmessage)

    // Send a single 'Hello!' message
    //val out = Enumerator("Hello!")
    val out = Enumerator.pushee[String] {
      websocketOutputInstance => websocketOutputInstance.push(
        "Hello world."
      )
      WebSocketHandler.websocketoutput = websocketOutputInstance
    }
    
    (in, out)
  }

  def send = Action { request =>
    WebSocketHandler.sendmessage("msg from server!")
    Ok("send?")
  }
  
}

object WebSocketHandler {

  var websocketoutput: Enumerator.Pushee[String] = _

  def onmessage(message: String) = {
    println(message)
  }

  def sendmessage(message: String) = {
    if (websocketoutput != null) {
      websocketoutput.push(message)
      println("send: " + message)
    }
  }

}