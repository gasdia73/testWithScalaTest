@main def Challenge(): Unit =
  println("Hello, Scala 3 project: testWithScalaTest!")
  println(appMessage)

def nTimes(f: Int => Int, n: Int): Int => Int = {
  if (n <= 1) f else 
  (x: Int) => nTimes(f, n - 1)(f(x))
}
