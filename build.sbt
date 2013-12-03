name := "blog"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

libraryDependencies ++= List(
  // use the right Slick version here:
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "mysql" % "mysql-connector-java" % "5.1.27"
)

play.Project.playScalaSettings
