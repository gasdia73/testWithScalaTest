import io.circe._ // Core imports: Encoder, Decoder, Codec, Json
import io.circe.syntax._ // For .asJson extension method
import io.circe.parser.decode // For decoding JSON strings

// 1. Define a case class
// We use 'derives Codec.AsObject' to automatically generate
// JSON encoder and decoder that treat this case class as a JSON object.
case class Book(title: String, author: String, yearPublished: Int, isAvailable: Boolean)
  derives Codec.AsObject // This is the Scala 3 derivation!

// 2. Define an enum (or a sealed trait hierarchy)
// For enums/sealed traits, 'derives Codec' is typically sufficient.
enum Genre derives Codec {
  case Fiction, ScienceFiction, Fantasy, History, Technical
}

case class Author(name: String, birthYear: Int) derives Codec.AsObject
case class DetailedBook(title: String, authors: List[Author], genre: Genre, pages: Option[Int]) derives Codec.AsObject
