package controllers

import play.api._
import play.api.mvc._
import play.api.templates._
import play.api.libs.iteratee._

object Application extends Controller {
  
  def index = Action { implicit request =>
    val html = Html("<h1>Spray.js</h1>")
    Ok(
      views.html.spray("Welcome to spray")(html)
    )
  }

  def websocket = WebSocket.using[String] { request => 
    
    // Log events to the console
    val in = Iteratee.foreach[String](println).mapDone { _ =>
      println("Disconnected")
    }
    
    // Send a single 'Hello!' message
    val out = Enumerator("Hello!")
    
    (in, out)
  }
  
}