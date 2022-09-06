package tute_5


object Q1 {
  def gcd(x:Int, y:Int):Int = y match {
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ => gcd(y, x%y)
  }

  def prime(p:Int, n:Int=2):Unit = n match {
    case x if(p == x) => println(p + " is a prime number")
    case x if(gcd(p,x)>1) => println(p + " is not a prime number")
    case x => prime(p,x+1)
  }

  def main(args: Array[String]): Unit = {
    prime(2)
  }

}
