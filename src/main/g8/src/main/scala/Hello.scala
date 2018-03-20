import scala.util.parsing.combinator._

class Greeter(subject: String) {
  def greet = "Hello, " + subject + "!"
}

class GreeterParser extends JavaTokenParsers {
  // http://www.rgagnon.com/javadetails/java-0522.html
  def unquote(s: String) = {     
    val props = new java.util.Properties
    props.load(new java.io.StringReader("x=" + s.substring(1, s.length - 1)))
    props.getProperty("x")
  }

  def statement: Parser[Greeter] = "greet" ~> stringLiteral ^^ 
    (s => new Greeter(unquote(s)))
}

object Hello extends App {
  val parser = new GreeterParser
  val result = parser.parseAll(parser.statement, """greet "CS152 students" """)
  println(result.get.greet)     
}
