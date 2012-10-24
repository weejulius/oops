organization := "oopsday"

name := "oopsday"

version := "0.1"

scalaVersion := "2.10.0-RC1"
 
resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")


libraryDependencies ++= Seq(
   "org.specs2" %% "specs2" % "1.13-SNAPSHOT" % "test"
)

libraryDependencies += "org.clapper" % "markwrap_2.10" % "1.0.0"

initialCommands in console := "import scalaz._, Scalaz._"
