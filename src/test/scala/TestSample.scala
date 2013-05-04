package shurijp

import org.specs2._

class HelloSpec extends Specification {
  def is =
    "test test" ^
    "'hello world' string should" ^
    "contain 11 characters" ! e1^
    "start with 'hello'" ! e2^
    "end with 'world'" ! e3^
    end

  def e1 = "hello world" must have size(11)
  def e2 = "hello world" must startWith("hello")
  def e3 = "hello world" must endWith("world")
}
