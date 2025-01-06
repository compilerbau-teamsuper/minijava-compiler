ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "minijava-compiler",
    libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.13.2",
    libraryDependencies += "org.ow2.asm" % "asm" % "9.7.1",
    libraryDependencies += "org.scala-lang" %% "toolkit" % "0.1.7",
    libraryDependencies += "com.lihaoyi" %% "utest" % "0.8.4" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
