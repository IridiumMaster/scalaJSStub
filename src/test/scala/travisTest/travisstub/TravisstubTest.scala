package travisTest.travisstub

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.test.JasmineTest

object TravisstubTest extends JasmineTest {

  describe("Travisstub") {

    it("should implement square()") {
      import Travisstub._
      import scala.collection.immutable.Map
      import scala.collection.immutable.Set


      expect(square(0)).toBe(0)
      expect(square(4)).toBe(16)
      expect(square(-5)).toBe(25)

    }
    
      it("Should add an object to a map.") {
      import Travisstub._
      import scala.collection.immutable.Map
      import scala.collection.immutable.Set


      var topicConsumers = Map[String, Set[String]]()
      
      var theNewSet = Set[String]()
      theNewSet += "testConsumer"
      
      topicConsumers += "testProducer" -> theNewSet

      expect(topicConsumers("testProducer").contains("testConsumer")).toBe(true)
      
    }
  }
}
