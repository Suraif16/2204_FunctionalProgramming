package tute_5

object Q3 {
  def main(args: Array[String]): Unit={
    println(Addition_of_numbers(5));
  }
  def Addition_of_numbers(n:Int):Int ={
    if(n==0){return 0;}
    else {return n+Addition_of_numbers(n-1);}
  }

}
