// Turn this project into a Scala.js project by importing these settings
import scala.scalajs.sbtplugin.ScalaJSPlugin._
import ScalaJSKeys._
import scala.js.workbench.Plugin._

scalaJSSettings

buildSettingsX

name := "travisStub"

version := "0.1-SNAPSHOT"


libraryDependencies ++= Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-jquery" % "0.3-SNAPSHOT",
    "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.3-SNAPSHOT",
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test",
    "org.webjars" % "envjs" % "1.2" % "test"    
)

// Specify additional .js file to be passed to package-js and optimize-js

unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "startup.js"

ScalaJSKeys.packageJS in Compile := {
  (ScalaJSKeys.packageJS in Compile).value :+ generateClient.value
}

bootSnippet := "ScalaJS.modules.travisTest.travisstub_Travisstub().main();"

updateBrowsers <<= updateBrowsers.triggeredBy(ScalaJSKeys.packageJS in Compile)
    