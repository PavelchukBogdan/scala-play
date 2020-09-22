name := """play-scala-rest-api-example"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
//libraryDependencies += "postgresql" % "postgresql" % "42.2.1"
libraryDependencies += "com.typesafe.play" %% "play-slick" % "4.0.2"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "4.0.2"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "play-slick" % "3.3.0",
  "com.typesafe.slick" %% "play-slick-evolutions" % "3.3.0"
)
libraryDependencies += "postgresql" % "postgresql" % "42.2.1"