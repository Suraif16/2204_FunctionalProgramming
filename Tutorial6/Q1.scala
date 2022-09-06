object Q1 extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  var shift = 0
  var message = ""


  //function for Encrypting
  val Encrtyp = (c:Char, key:Int, a:String) => {
    //check char is a letter
    if(c.isLetter){
      //adding 26 allows us to take any number even if it is negative
      a((a.indexOf(c.toUpper) + key + 26) % 26)
    }
    else{
      c
    }
  }


  //function for Decrypting
  val Decrtyp = (c:Char, key:Int, a:String) => {
    //check char is a letter
    if(c.isLetter){
      //adding 26 allows us to take any number even if it is negative
      a((a.indexOf(c.toUpper) - key + 26) % 26)
    }
    else{
      c
    }
  }

  //get user input for the shift number
  printf("shift by : ")
  shift = (scala.io.StdIn.readInt % 26)

  //get user input for the Secret Message
  message = scala.io.StdIn.readLine("Secret Message : ")

  //The Cipher function
  val Cipher = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val Ciphertext = Cipher(Encrtyp,message,shift,alphabet)
  val Plaintext = Cipher(Decrtyp,Ciphertext,shift,alphabet)

  //display the output of Cipher text and Plain text
  println("Ciphertext : " + Ciphertext)
  println("Plaintext : " + Plaintext)

}