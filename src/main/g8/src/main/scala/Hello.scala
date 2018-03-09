object Hello extends App {
  val greeter = new Greeter("World")
  println(greeter.greet)
}

class Greeter(subject: String) {
  def greet = "Hello, " + subject + "!"
}
