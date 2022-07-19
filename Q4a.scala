import scala.io.StdIn.readInt

object Q4a extends App{

  //function for calculating total payment for normal working hours per week
  def totalNormal(h:Int):Int={
    var total:Int = h * 250;
    return total;
  }

  //function for calculating total payment for OT working hours per week
  def totalOT(hOT:Int):Int={
    var total:Int = hOT * 85;
    return total;
  }

  //function for calculating total payment for per week
  def totalPay(h:Int,hOT:Int):Int={
    return (totalNormal(h)+totalOT(hOT));
  }

  //function for calculating total Tax for per week
  def Tax(h:Int,hOT:Int):Double={
    return (totalPay(h,hOT)*.12);
  }

  //function for calculating total Salary for per week
  def salary(h:Int,hOT:Int):Double={
    return (totalPay(h,hOT)-Tax(h,hOT) );
  }

  // Get the working hours and OT hours as inputs
  print("Enter working hours of employee per week: ")
  val hoursNormal = readInt()
  print("Enter OT hours of employee per week: ")
  val hoursOT = readInt()

  printf("Total Salary : %.3f",salary(hoursNormal:Int,hoursOT:Int));      //Total Salary : 11044.000000

}
