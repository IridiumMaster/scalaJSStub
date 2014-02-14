// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

name := "travisStub"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-jquery" % "0.1-SNAPSHOT",
    "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.1-SNAPSHOT",
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % "0.3-SNAPSHOT" % "test",
    "org.webjars" % "envjs" % "1.2" % "test"    
)

// Specify additional .js file to be passed to package-js and optimize-js

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "jquery-2.1.0.js"

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "travisObject.js"

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "startup.js"
