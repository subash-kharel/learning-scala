name := "learning-scala"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.13",
  "org.scala-sbt" % "test-interface" % "1.0",
  "org.scalatest" %% "scalatest-funsuite" % "3.3.0-SNAP2" % Test,
  "org.specs2" %% "specs2-junit" % "4.10.6" % Test,
)