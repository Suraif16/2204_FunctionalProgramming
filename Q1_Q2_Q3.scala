object Q1_Q2_Q3 extends App
{
  //Declare and assign values to variables
  var i,j,k:Int = 2;
  var m,n:Int = 5;
  var f:Float = 12.0f;
  var g:Float = 4.0f;
  var c:Char = 'X';

  //Evaluate the expressions 
  var exp1 = k + 12 * m;    // 62
  var exp2 = m / j;         // 2
  var exp3 = n % j;         // 1
  var exp4 = m / j * j;     // 4
  var exp5 = f + 10 * 5 + g;    // 66.00000
  //var exp6 = ++i * n;   |||>>> Scala programming language doesn't support unary operators ++ or --

  //Display answers of expressions
  printf("exp1 : %d \n",exp1);
  printf("exp2 : %d \n",exp2);
  printf("exp3 : %d \n",exp3);
  printf("exp4 : %d \n",exp4);
  printf("exp5 : %f \n",exp5);
}