package org.knoldus.higherorderfunction

object FunctionAsAnArgument extends App {

  // HOF that takes a function as its third argument
  def math(x:Int, y:Int, operation:(Int,Int)=>Int):Int = operation(x,y)

  // Normal functions that we'll pass as an argument to the above HOF
  def add(a:Int, b:Int):Int = a + b
  def subtract(a:Int, b:Int):Int = a - b
  def multiply(a:Int, b:Int):Int = a * b
  def divide(a:Int, b:Int):Int = a / b

}
