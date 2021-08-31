package org.knoldus.higherorderfunction

object CommonlyUsedHigherOrderFunctions {

  // map
  def performMapOperation(listOfNames: List[String]): List[Int] = {
    listOfNames.map(name => name.length)
  }

  // flatMap
  def performFlatMapOperation(listOfNames: List[String]): List[String] = {
    listOfNames.flatMap(name => name.split(" "))
  }

  // filter
  def performFilterOperation(listOfNames: List[String]): List[String] = {
    listOfNames.filter(name => name.length > 4)
  }

  // reduce
  def performReduceOperation(listOfEarnings: List[Int]): Int = {
    listOfEarnings.reduce((acc, earning) => acc + earning)
  }

  // fold
  def performFoldOperation(list: List[Int]): Int = {
    list.fold(0)((acc, earning) => acc + earning * 2)
  }

}
