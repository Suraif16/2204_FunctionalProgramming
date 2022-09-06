package tute_5

object Q6 extends App {
  def getFib(position: Int): Int =
  if(position == 0) return 0
  else if(position == 1) return 1
  else return getFib(position - 1) + getFib(position - 2)


  def generateFibSeq(number: Int): Unit = {
    if(number > 1) generateFibSeq(number - 1)


    println(s"${number} nth fibonacci number is ${getFib(number)}")
  }


  generateFibSeq(20)
}
