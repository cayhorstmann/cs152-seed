import scala.util.parsing.combinator._

class Greeter(subject: String) {
  def greet = "Hello, " + subject + "!"
}

class GreeterParser extends JavaTokenParsers {
  def statement: Parser[Greeter] = "greet" ~> stringLiteral ^^ 
    (s => new Greeter(s))
}

object Hello extends App {
  val parser = new GreeterParser
  val result = parser.parseAll(parser.statement, """greet "CS152 students" """)
  println(result.get.greet)     
}