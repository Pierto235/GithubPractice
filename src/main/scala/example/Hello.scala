package example

object Hello extends Greeting with App {
  println(greeting + "z master")
}

trait Greeting {
  lazy val greeting: String =
    "hello, " +
    "first commit."
}
