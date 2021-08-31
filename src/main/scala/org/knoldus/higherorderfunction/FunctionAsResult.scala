package org.knoldus.higherorderfunction

object FunctionAsResult extends App {

  // HOF that returns another function as its result
  def math(name: String): (Int, Int) => Int = (x: Int, y: Int) => {
    name match {
      case "add" => x + y
      case "subtract" => x - y
      case "multiply" => x * y
      case "divide" => x/y
    }
  }

}
