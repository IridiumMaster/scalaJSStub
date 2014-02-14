package travisTest.travisstub


import scala.scalajs.js.Dynamic.global
import org.scalajs.jquery

object ElementCreator extends logging {
  val jQ = global.jQuery

  def create(): Unit = {
    jQ("body").append(jQ("<h1>Test</h1>"))
    log(jQ("body").text.toString())
  }
  
  
}