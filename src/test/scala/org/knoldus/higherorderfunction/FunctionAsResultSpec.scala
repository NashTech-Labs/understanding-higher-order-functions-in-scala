package org.knoldus.higherorderfunction

import org.scalatest.flatspec.AnyFlatSpec

class FunctionAsResultSpec extends AnyFlatSpec {

  behavior of "math HOF"

  it should "return a add function as its result when we want to perform addition operation" in
  {
    val addFunAsResult = FunctionAsResult.math("add")
    assert(addFunAsResult(4,8) == 12)
  }

  it should "return a subtract function as its result when we want to perform subtraction operation" in
  {
    val subtractFunAsResult = FunctionAsResult.math("subtract")
    assert(subtractFunAsResult(18,8) == 10)
  }

  it should "return a multiply function as its result when we want to perform multiplication operation" in
  {
    val multiplyFunAsResult = FunctionAsResult.math("multiply")
    assert(multiplyFunAsResult(2,8) == 16)
  }

  it should "return a divide function as its result when we want to perform division operation" in
  {
    val divideFunAsResult = FunctionAsResult.math("divide")
    assert(divideFunAsResult(40,8) == 5)
  }

}
