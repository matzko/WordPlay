package models

import models.database.Posts

import play.api.Play.current
import play.api._
import play.api.mvc._

import scala.slick.driver.MySQLDriver.simple._

import scala.slick.session.Session

case class Post(id: Option[Long], title: String, content: String)

object Post {
  val table = new Posts

   def find: List[Post] = Database.forURL(
      Play.current.configuration.getString("db.default.url").getOrElse(""), 
      driver = Play.current.configuration.getString("db.default.driver").getOrElse(""), 
      user = Play.current.configuration.getString("db.default.user").getOrElse(""),
      password = Play.current.configuration.getString("db.default.pass").getOrElse("")
    ) withSession { implicit session: Session =>
    Query(table).take(10).list
  }
}
