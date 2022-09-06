package tute_5

object Q2 {
  def checkPrimes(number:Int):Boolean = if (loopPrime(number,Math.round(Math.sqrt(number)).toInt)) return true
  else return false

  def loopPrime(number: Int, divider: Int):Boolean = {
    if(number == 2) return true
    else if (number % divider == 0) return false
    else if (divider>2) return loopPrime(number,divider-1)
    else return true
  }
  def printSequence(number: Int): Unit = {
    if(number > 1){
      printSequence(number-1)
    }

    if (checkPrimes(number)) println(number)
  }

  def main(args: Array[String]): Unit = {
    printSequence(10)
  }

}

