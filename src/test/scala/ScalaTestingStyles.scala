import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.freespec.AnyFreeSpec

class ScalaTestingStyles {}

class CalculatorSuite extends AnyFunSuite {

  val calculator = new Calculator

  test("mult by 0 is 0") {
    assert(calculator.multiply(57657657, 0) == 0)
    assert(calculator.multiply(-57657657, 0) == 0)
    assert(calculator.multiply(0, 0) == 0)
  }

  test("div by 0 throws error") {
    assertThrows[ArithmeticException](calculator.divide(57657657, 0))
  }

}

class CalculatorSpec extends AnyFunSpec {

  val calculator = new Calculator

  describe("multiplication") {
    it("should be 0 if mult by 0") {
      assert(calculator.multiply(57657657, 0) == 0)
      assert(calculator.multiply(-57657657, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
    }
  }

  describe("division") {
    it("should throw error if div by 0") {
      assertThrows[ArithmeticException](calculator.divide(57657657, 0))
    }
  }

}

class CalculatorWordSpec extends AnyWordSpec {
  val calculator = new Calculator

  "A calculator" should {
    "return 0 if mult by 0" in {
      assert(calculator.multiply(57657657, 0) == 0)
      assert(calculator.multiply(-57657657, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
    }

    "throw error if div by 0" in {
      assertThrows[ArithmeticException](calculator.divide(57657657, 0))

    }
  }

}

class CalculatorFreeSpec extends AnyFreeSpec {}

class Calculator {
  def add(a: Int, b: Int): Int = a + b
  def subtract(a: Int, b: Int): Int = a - b
  def multiply(a: Int, b: Int): Int = a * b
  def divide(a: Int, b: Int): Int = a / b
}
