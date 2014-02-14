package travisTest.travisstub

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.test.JasmineTest

object TravisstubTest extends JasmineTest {

  describe("Travisstub") {

    it("should implement square()") {
      import Travisstub._

      expect(square(0)).toBe(0)
      expect(square(4)).toBe(16)
      expect(square(-5)).toBe(25)
    }
  }
}
