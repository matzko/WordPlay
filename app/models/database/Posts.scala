package models.database

import scala.slick.driver.MySQLDriver.simple._
import models.Post

class Posts extends Table[Post]("wp_posts") {
  def id = column[Long]("ID")
  def title = column[String]("post_title")
  def content = column[String]("post_content")
  def * = id.? ~ title ~ content <> (Post.apply _, Post.unapply _)
}
