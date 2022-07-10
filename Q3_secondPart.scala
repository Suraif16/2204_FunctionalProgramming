object Q3_secondPart extends App {

  //Define and assign values to variables
  var a:Int = 2;
  var b:Int = 3;
  var c:Int = 4;
  var d:Int = 5;
  var k:Float = 4.3f;
  var g:Float = 6.8f;


  //evaluate -> println( - -b * a + c *d - -);
  b-=1;
  println( b * a + c * d );     //  24

  //evaluate ->  println(a++);
  println(a);             // 2
  a+=1;

  //evaluate ->  println (–2 * ( g – k ) +c);
  var answer:Double = -2 * (g - k) + c;
  println(answer);      //-1.0

  //evaluate ->  println (c=c++);
  println (c)           // 4
  c+=1;

  //evaluate ->  println (c=++c*a++);
  c+=1;
  c = c * a
  println (c)           // 18
  a+=1;

}