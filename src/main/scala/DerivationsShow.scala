import scala.deriving.Mirror
import scala.compiletime.constValue // Import this

// Define a type class
trait Show[A] {
  def show(a: A): String
}

object Show {
  // 1. Provide a 'derived' method for the type class
  // This uses 'scala.deriving.Mirror' to inspect the type
  inline given derived[A](using m: Mirror.Of[A]): Show[A] = {
    // Capture the type's name at compile time.
    // m.MirroredLabel is a type (a literal string type representing the name of A).
    // constValue[m.MirroredLabel] converts this compile-time type information
    // into a runtime String value.
    val typeName = constValue[m.MirroredLabel]

    new Show[A] {
      def show(a: A): String = s"Instance of $typeName" // Simplified example
    }
  }

  // Base instances
  given Show[Int] = _.toString
  given Show[String] = identity
}

// User code:
case class Person(name: String, age: Int) derives Show
// The 'derives Show' clause automatically generates the Show[Person] instance

enum Color derives Show {
  case Red, Green, Blue
}