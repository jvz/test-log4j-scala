scalaVersion := "2.12.2"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.8.2",
  "org.apache.logging.log4j" % "log4j-core" % "2.8.2"
)
resolvers += "Staging" at "https://repository.apache.org/content/repositories/orgapachelogging-1028/"
