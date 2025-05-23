import org.scalatest.funsuite.AnyFunSuite

class DerivationsSuite extends AnyFunSuite {

  test("A person show is derived") {
    val person = Person("Alice", 30)
    assert(summon[Show[Person]].show(person) == "Instance of Person")
  }

  test("A color show is derived") {
    val color = Color.Red
    assert(summon[Show[Color]].show(color) == "Instance of Color")
  }

}
