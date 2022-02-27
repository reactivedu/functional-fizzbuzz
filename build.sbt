val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "functional-fizzbuzz",
    version := "1.0.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
