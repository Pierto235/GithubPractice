package example

object Hello extends Greeting with App {
  println(greeting + "z master")
}

trait Greeting {
  val a = "rebasing"
  lazy val greeting: String =
    "hello, " +
    "first commit, " +
    "bugFix branch"
}
