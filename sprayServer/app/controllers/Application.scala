package controllers

import play.api._
import play.api.libs.concurrent._
import play.api.libs.iteratee._
import play.api.libs.json._
import play.api.mvc._
import play.api.templates._

import Ecore._  // Our Ecore Model Implementation

object Application extends Controller {
  
  var out: Enumerator.Pushee[JsValue] = _
  
  def index = Action { implicit request =>
    // Test ECore
    val factory: WebToEcoreFactory = WebToEcoreFactoryImpl.getInstance();
    factory.createEObject("Place");
    factory.createEObject("Transition");
    factory.createEObject("Transition");
    factory.createEObject("PTEdge", "Place", "Transition", 0, 1);
    factory.createEObject("PTEdge", "Place", "Transition", 0, 2);
    factory.removeEObject("Transition",2);
    Ok(
      views.html.index("Welcome to spray " + factory)
    )
  }

  def websocket = WebSocket.async[JsValue] { request =>

    val in = Iteratee.foreach[JsValue](this.commandHandling)

    val out = Enumerator.pushee[JsValue] {
      pushee => pushee.push(
        JsObject(Seq(
          "type" -> JsString("editor"),
          "command" -> JsString("load"),
          "text" -> JsString("Happy Coding!"))
        ).as[JsValue])
      this.out = pushee
    }

    Promise.pure((in,out))
  }

  
  def loadError = JsObject(Seq(
      "type" -> JsString("ecore"),
      "command" -> JsString("error"),
      "text" -> JsString("Something went wrong while storing to ecore!"))
    ).as[JsValue];
  
// 	public abstract void createEObject(String domainObj);
/*  def createEObject(domainObj: String) = {
    val factory: WebToEcoreFactory = WebToEcoreFactoryImpl.getInstance()
    factory.createEObject(domainObj)
  } */

  
  /*****
*
* TODO 1. Mapping in eine model class auslagern
*
*/

  def commandHandling(msg: JsValue) = {
    //TODO: ERROR when js key not exists or IO Exception
    val command = (msg \ "command").as[String]

    command match {
      /*case "create" => {
        val param0 = (msg \ "param0").as[String]
        println(param0)
        createEObject(param0)
      } */
      case "" => out.push(loadError)
    }
  }
}