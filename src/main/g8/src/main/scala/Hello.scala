object Hello extends App {
  val greeter = new Greeter("CS152 students")
  println(greeter.greet)
}

class Greeter(subject: String) {
  def greet = "Hello, " + subject + "!"
}
