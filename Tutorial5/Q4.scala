package tute_5

object Q4 {
  def main(args: Array[String]): Unit={
    println(isOdd(9));
  }

  def isOdd(number: Int): Boolean =
    if(number == 2) {return false}
    else if(!isOdd(number - 1)) {return true}
    else {return false}

}
