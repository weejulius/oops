organization := "oopsday"

name := "oopsday"

version := "0.1"

scalaVersion := "2.10.0-RC1"
 
resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")
 
libraryDependencies ++= Seq(
  "org.scalaz" % "scalaz-core" % "7.0.0-M3" cross CrossVersion.full
)

libraryDependencies ++= Seq(
   "org.specs2" %% "specs2" % "1.13-SNAPSHOT" % "test"
)

initialCommands in console := "import scalaz._, Scalaz._"
