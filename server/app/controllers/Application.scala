package controllers

import play.api._
import play.api.libs.concurrent._
import play.api.libs.iteratee._
import play.api.libs.json._
import play.api.mvc._
import play.api.templates._

import concurrent.ExecutionContext.Implicits.global  // needed for Iteratee.foreach

import Ecore._  // Our Ecore Model Implementation

object Application extends Controller {

  def index = Action { implicit request =>
    Ok(
      views.html.index("Welcome to spray ")
    )
  }


  def websocket = WebSocket.using[JsValue] { request =>

    val (out, channel) = Concurrent.broadcast[JsValue]

    val in = Iteratee.foreach[JsValue] { msg =>
        println("Got from WebSocket: " + msg)
        this.commandHandling(msg, channel)
    }

    (in, out)
  }


  def message(typ: String, command: String, text: String) = JsObject(Seq(
      "type" -> JsString(typ),
      "command" -> JsString(command),
      "text" -> JsString(text))
    ).as[JsValue]


  def loadError = message (
    "server", "unkown", "Unknown command for the server.")


  def commandHandling(msg: JsValue, websocket: Concurrent.Channel[JsValue]) = {

    val command = (msg \ "command").as[String]
    val factory = WebToEcoreFactoryImpl.getInstance()

    command match {
      case "clear" =>{
        factory.clear();
      }
      case "createObj" => {
        val domainObj = (msg \ "domainObj").as[String]
        factory.createEObject(domainObj)
        websocket.push(this.message("server", "createObj", "ok"))
      }
      case "createConnection" => {
        val domainObj = (msg \ "domainObj").as[String]
        val fromObj = (msg \ "fromObj").as[String]
        val toObj = (msg \ "toObj").as[String]
        val fromID = (msg \ "fromID").as[String].toInt
        val toID = (msg \ "toID").as[String].toInt
        factory.createEObject(domainObj, fromObj, toObj, fromID, toID)
        websocket.push(this.message("server", "createConnection", "ok"))
      }
      case "createCompartment" => {
        val domainObj = (msg \ "domainObj").as[String]
        val parentObj = (msg \ "parentObj").as[String]
        val parentID = (msg \ "parentID").as[String].toInt
        factory.createEObject(domainObj, parentObj, parentID)
        websocket.push(this.message("server", "createCompartment", "ok"))
      }
      case "removeObj" => {
        val domainObj = (msg \ "domainObj").as[String]
        val id = (msg \ "ID").as[String].toInt
        factory.removeEObject(domainObj, id)
        websocket.push(this.message("server", "removeObj", "ok"))
      }
      case "removeConnection" => {
        val domainObj = (msg \ "domainObj").as[String]
        val fromObj = (msg \ "fromObj").as[String]
        val toObj = (msg \ "toObj").as[String]
        val fromID = (msg \ "fromID").as[String].toInt
        val toID = (msg \ "toID").as[String].toInt
        factory.removeEObject(domainObj, fromObj, toObj, fromID, toID)
        websocket.push(this.message("server", "removeConnection", "ok"))
      }
      case "removeObjFromParent" => {
        val domainObj = (msg \ "domainObj").as[String]
        val id = (msg \ "ID").as[String].toInt
        val parentObj = (msg \ "parentObj").as[String]
        val parentID = (msg \ "parentID").as[String].toInt
        factory.removeEObject(domainObj, id, parentObj, parentID)
        websocket.push(this.message("server", "removeObjFromParent", "ok"))
      }
      case "load" => {
        if ((new java.io.File("model.json")).exists()) {
            val fileContent = io.Source.fromFile("model.json").getLines.mkString
            println("msg to client: " + fileContent)
            websocket.push(this.message("server", "load", fileContent))
        } else {
            websocket.push(this.message("server", "load", ""))
        }
      }
      case "save" => {
        import java.io.PrintWriter
        val s = new PrintWriter("model.json")
        s.print(msg)
        s.close()
      }
      case _ => {
        println("Ecore Error")
        websocket.push(this.loadError)
      }
    }

  }

}
