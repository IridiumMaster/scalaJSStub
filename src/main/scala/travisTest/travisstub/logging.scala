package travisTest.travisstub

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.js.annotation.JSName
import scala.collection.mutable.ArrayBuffer

import js.Dynamic
import js.Any
import Any._
import scala.language.implicitConversions


trait logging {

  val isActive = true
  
  def log(text: String)
  {
    if (isActive)
    {
      g.console.log(text)
    }
  }
  
}