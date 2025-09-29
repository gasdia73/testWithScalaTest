import org.scalatest.funsuite.AnyFunSuite

class ChallengeSuite extends AnyFunSuite {

  test("3 times 0+1 should give 3") {
    assert(nTimes(_ + 1, 3)(0) == 3)
  }

  test("1 times 20 * 20 should give 400") {
    assert(nTimes(_ * 20, 1)(20) == 400)
  }

  test("negative or zero times equals once") {
    assert(nTimes(_ * 20, -3)(20) == 400)
  }  
}
