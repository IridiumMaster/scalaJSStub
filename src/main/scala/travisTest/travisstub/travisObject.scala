package travisTest.travisstub

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.js.annotation.JSName

class travisObject extends js.Object {
    def this(travisObject: travisObject) = this()
//def square(x: Int): Int = x*x
    def runTest() : Unit = ???
    def runTest2(x: String) : Unit = ???
    def getArbitraryParameter(param : String) : Unit = ???
    def returnDictionaryJSON() : js.Dictionary[js.Any] = ???
    def convertToJSON(myThingToConvert: String) : js.Dictionary[js.Any] = ???
    def log(myItem: String) : Unit = ???
//travisObject.prototype.convertToJSON = function(myThingToConvert)

}

object travisObject extends js.Object {
  def apply(): travisObject = ???
  def apply(travisObject: travisObject): travisObject = ???
}