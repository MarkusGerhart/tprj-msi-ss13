package controllers

import play.api._
import play.api.mvc._
import play.api.templates._

object Application extends Controller {
  
  def index = Action {
    val html = Html("<h1>Spray.js</h1>")
    Ok(
      views.html.spray("Welcome to spray")(html)
    )
  }
  
}