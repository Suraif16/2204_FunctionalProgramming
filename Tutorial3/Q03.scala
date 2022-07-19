object Q03 extends App{

  //function for calculating volume of sphere
  def volumeOfSphere(radius:Int): Double ={
    //pi contains in package object of scala math
    return math.Pi * radius * radius * radius * (4/3);
  }

  val r:Int = 5;
  printf("volume of sphere = %f",volumeOfSphere(r))   //answer :- 392.699082

}