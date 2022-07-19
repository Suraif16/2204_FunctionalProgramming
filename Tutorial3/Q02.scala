object Q02 extends App{
  //function for converting celsius temperature into Fahrenheit
  def celsiusToFahrenheit(C:Double):Double ={
    var F:Double = 0;
    F = C * 1.80 + 32.00
    return F;
  }
  println(celsiusToFahrenheit(35));

}