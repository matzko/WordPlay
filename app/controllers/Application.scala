package controllers

import play.api._
import play.api.mvc._

import scala.slick.driver.MySQLDriver.simple._

import models.Post

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(Post.find))
  }
}
