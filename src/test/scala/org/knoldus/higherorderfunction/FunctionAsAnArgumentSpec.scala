package org.knoldus.higherorderfunction

import org.scalatest.flatspec.AnyFlatSpec

class FunctionAsAnArgumentSpec extends AnyFlatSpec {

  behavior of "math HOF"

  it should "take a add function as its third argument to find addition" in
  {
    val sumOfTwoNumbers = FunctionAsAnArgument.math(5, 9, FunctionAsAnArgument.add)
    assert(sumOfTwoNumbers == 14)
  }

  it should "take a subtract function as its third argument to find subtraction" in
  {
    val diffOfTwoNumbers = FunctionAsAnArgument.math(12, 8, FunctionAsAnArgument.subtract)
    assert(diffOfTwoNumbers == 4)
  }

  it should "take a multiply function as its third argument to find multiplication" in
  {
    val mulOfTwoNumbers = FunctionAsAnArgument.math(5, 9, FunctionAsAnArgument.multiply)
    assert(mulOfTwoNumbers == 45)
  }

  it should "take a divide function as its third argument to find division" in
  {
    val divOfTwoNumbers = FunctionAsAnArgument.math(36, 9, FunctionAsAnArgument.divide)
    assert(divOfTwoNumbers == 4)
  }

}
