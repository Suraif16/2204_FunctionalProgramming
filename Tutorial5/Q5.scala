package tute_5

object Q5 extends App{
  def isEven(number: Int): Boolean =
    if(number == 1) return false
    else if(!isEven(number - 1)) return true
    else return false



  // Getting the addition
  def getAdditionSum(number: Int): Int =
    if(number > 1 && isEven(number)) getAdditionSum(number - 1) + number
    else if(number > 1 && !isEven(number)) getAdditionSum(number - 1)
    else return 0



  println(getAdditionSum(10))


}
