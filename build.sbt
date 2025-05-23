ThisBuild / scalaVersion := "3.3.6" // You can update to the latest Scala 3 version
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example" // Feel free to change this

lazy val root = (project in file("."))
  .settings(
    name := "testWithScalaTest",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.17" % Test // Or the latest ScalaTest version
    )
  )
