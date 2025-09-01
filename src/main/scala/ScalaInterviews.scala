
trait ScalaInterviews {
  def pyramid(n: Int): List[String]
}

object ScalaInterviews {
  
  //pyramid
  def pyramid(n: Int): List[String] = {
    def doPyramid(offset: Int, n: Int, acc: List[String]): List[String] = {
      if (offset < n) {
        val line = buildLine(offset, n)
        println(line)
        doPyramid(offset + 1, n, acc ++ List(line))
      }
      else acc
    }
    doPyramid(1, n+1, List.empty[String])
  }

  def buildLine(offset: Int, n: Int): String = {
    val stream1  = (1 until (n - offset)).map(_ => '.')
    val stream2  = ((n - offset) + 1 until (n + offset)).map(_ => '*')
    val stream3 = ((n + offset) + 1 until n*2).map(_ => '.')
    (stream1 ++ stream2 ++ stream3).mkString("")
  }

  def main(args: Array[String]): Unit = {
    // 0 until 20 map { i => println(buildLine(i, 20))}
    pyramid(15)
  }

  
}
