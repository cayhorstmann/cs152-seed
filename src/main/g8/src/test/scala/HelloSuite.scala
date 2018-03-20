import org.scalatest.FunSuite

class HelloSuite extends FunSuite {
  test("Greeting CS152 students") {
    assert(new Greeter("CS152 students").greet == "Hello, CS152 students!")
  }
}
