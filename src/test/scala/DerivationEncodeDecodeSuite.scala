import org.scalatest.funsuite.AnyFunSuite
import io.circe._ // Core imports: Encoder, Decoder, Codec, Json
import io.circe.syntax._ // For .asJson extension method
import io.circe.parser.decode // For decoding JSON strings

class DerivationEncodeDecodeSuite extends AnyFunSuite {

  test("A book is serialized") {
    val book = Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, true)
    println(s"Original Book: $book")

    val bookJson: Json = book.asJson // Uses the derived Encoder[Book]
    val bookJsonString: String = bookJson.noSpaces
    assert(
      """{"title":"The Lord of the Rings","author":"J.R.R. Tolkien","yearPublished":1954,"isAvailable":true}""" == bookJsonString
    )
  }

  test("A book is deserialized") {
    val jsonToDecode = """{"title":"1984","author":"George Orwell","yearPublished":1949,"isAvailable":false}"""
    val decodedBook: Either[Error, Book] = decode[Book](jsonToDecode) // Uses the derived Decoder[Book]

    assert(decodedBook.isRight)
    assert(decodedBook.right.get.title == "1984")
  }

}
