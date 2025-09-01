
import org.scalatest.funsuite.AnyFunSuite
class InterviewsSuite extends AnyFunSuite {
  def prettyPrint(s: String) = s.stripMargin.split('\n').filter(_.nonEmpty).toList
  
  //pyramid
  test("with size 1 it should print" +
"""
*
"""
    ) {
    assert(ScalaInterviews.pyramid(1) == prettyPrint("""*"""))
  }

  test("with size 2 it should print" +
"""
.*.
***
"""
) {
    assert(ScalaInterviews.pyramid(2) == prettyPrint("""
.*.
***
"""))
  }

  test("with size 4 it should print" +
"""
...*...
..***..
.*****.
*******
"""
    ) {
    assert(ScalaInterviews.pyramid(4) == prettyPrint(
"""
...*...
..***..
.*****.
*******
"""
))
  }


  test("with size 15 it should print") {
    assert(ScalaInterviews.pyramid(15) == prettyPrint(
"""
..............*..............
.............***.............
............*****............
...........*******...........
..........*********..........
.........***********.........
........*************........
.......***************.......
......*****************......
.....*******************.....
....*********************....
...***********************...
..*************************..
.***************************.
*****************************
"""
))
  }  


}
