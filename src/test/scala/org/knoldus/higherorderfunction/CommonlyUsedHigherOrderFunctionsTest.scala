package org.knoldus.higherorderfunction

import org.scalatest.flatspec.AnyFlatSpec

class CommonlyUsedHigherOrderFunctionsTest extends AnyFlatSpec{

  "map" should "take a function as its argument to transform a list" in
  {
    val names: List[String] = List("Prateek", "Rohan", "Ruhi", "Amarnath", "Karan")
    val expectedLengthOfNames: List[Int] = List(7, 5, 4, 8, 5)
    assert(CommonlyUsedHigherOrderFunctions.performMapOperation(names) == expectedLengthOfNames)
  }

  "flatMap" should "take a function as its argument to transform a list" in
  {
    val sentences = List("He is a bad boy", "Karan looks smart")
    val expectedList = List("He", "is", "a", "bad", "boy", "Karan", "looks", "smart")
    assert(CommonlyUsedHigherOrderFunctions.performFlatMapOperation(sentences) == expectedList)
  }

  "filter" should "take a function as its argument to filter a list" in
  {
    val names = List("Prateek", "Rohan", "Ruhi", "Amarnath", "Karan", "Aman", "Sakshi")
    val expectedFilteredListOfNames = List("Prateek", "Rohan", "Amarnath", "Karan", "Sakshi")
    assert(CommonlyUsedHigherOrderFunctions.performFilterOperation(names) == expectedFilteredListOfNames)
  }

  "reduce" should "take a function as its argument to reduce a list into a single element" in
  {
    val earnings = List(1500, 2000 ,5000, 2500)
    val expectedSumOfEarnings = 11000
    assert(CommonlyUsedHigherOrderFunctions.performReduceOperation(earnings) == expectedSumOfEarnings)
  }

  "fold" should "take a function as its argument to fold a list into a single element" in
    {
      val earnings = List(1500, 2000 ,5000, 2500)
      val expectedSumOfDoubledEarnings = 22000
      assert(CommonlyUsedHigherOrderFunctions.performFoldOperation(earnings) == expectedSumOfDoubledEarnings)
    }

}
