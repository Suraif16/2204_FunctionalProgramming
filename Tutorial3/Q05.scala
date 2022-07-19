object Q05 extends App{
  //function for calculating time for easy pace
  def easyPace(L:Int):Int= return L*8;


  //function for calculating time for Tempo
  def Tempo(L:Int):Int= return L*7;


  //calculating total run time
  var totalRun:Int = easyPace(2) + Tempo(3) + easyPace(2);
   printf("Total running time : %d",totalRun);

}
