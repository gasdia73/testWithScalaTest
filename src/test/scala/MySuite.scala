import org.scalatest.funsuite.AnyFunSuite

class MySuite extends AnyFunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

}
