import sbt._
import sbt.Keys._

object ScalaHexpressBuild extends Build {

  lazy val scalaHexpress = Project(
    id = "scala-hexpress",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Scala Hexpress",
      organization := "com.mancvso",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
      // add other settings here
    )
  )
}
