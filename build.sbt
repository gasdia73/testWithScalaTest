ThisBuild / scalaVersion := "3.3.6" // You can update to the latest Scala 3 version
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example" // Feel free to change this
ThisBuild / scalaTestVersion := "3.2.17" // Feel free to change this

lazy val root = (project in file("."))
  .settings(
    name := "testWithScalaTest",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core" % "0.14.7", // Or latest version
      "io.circe" %% "circe-generic" % "0.14.7", // For derivation
      "io.circe" %% "circe-parser" % "0.14.7", // For parsing JSON strings
      "org.scalatest" %% "scalatest" % scalaTestVersion % Test // Or the latest ScalaTest version

    )
  )
