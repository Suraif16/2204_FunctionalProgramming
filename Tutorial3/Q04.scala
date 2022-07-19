object Q04 extends App{
  //function for calculating total discount
  def discount(price:Double):Double={
    //bookstores get a 40% discount
    var dis = price * 0.4;
    return dis;
  }

  //function for calculating total price
  def TotalPrise(copies:Int):Double={
    //book price *24.95
    var Total = copies * 24.95;
    return Total;
  }

  //function for calculating total Shipping cost
  def ShippingCost(copies:Int):Double={
    //Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy
    var TotalShip = if (copies<=50) copies * 3 else (copies*3) + (copies-50) * 0.75;
    return TotalShip;
  }

  //function for calculating total cost
  def TotalCost(copies:Int):Double={
    var Total = TotalPrise(copies)+ShippingCost(copies)-discount(TotalPrise(copies))
    return Total;
  }
  //displaying total cost
  printf("Total cost for 60 copies : %f",TotalCost(60))

}