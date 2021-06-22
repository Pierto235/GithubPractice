package example

object Hello extends Greeting with App {
  println(greeting + "z master")
  val r = "rebasing in bugFix"
}

trait Greeting {
  lazy val greeting: String =
    "hello, " +
    "first commit, " +
    "bugFix branch"
}
