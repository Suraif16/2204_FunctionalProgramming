package Tutorial4

object Q2{
  // Checking  whether the integer is even or odd
  def isEven(number: Int): Boolean = number match{
    case x if(x == 0) => true
    case x if(x > 0) => !isEven(number - 1)
    case x if(x < 0) => !isEven(number + 1)
  }

  def main(args: Array[String]): Unit = {
    // Getting number as the input from the command line
    val input = if(args.length > 0) args(0).toInt else 0

    if(isEven(input)) println("Even number") else println("Odd number")
  }
}