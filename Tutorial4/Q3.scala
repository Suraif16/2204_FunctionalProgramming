package Tutorial4

import scala.Byte.MaxValue.toChar

object Q3 {


    def toUpper(str: String): String = {
        if(str.length > 1){
            if((str.head.toInt <= 'z'.toInt) && (str.head.toInt >= 'a'.toInt))
                s"${(str.head.toInt - 32).toChar}${toUpper(str.tail)}"
            else
                s"${str.head}${toUpper(str.tail)}"
        }
        else{
            if((str.head.toInt <= 'z'.toInt) && (str.head.toInt >= 'a'.toInt))
                s"${(str.head.toInt - 32).toChar}"
            else
                s"${str.head}"
        }
    }

    def toLower(str: String): String = {
        if(str.length > 1){
          if((str.head.toInt <= 'Z'.toInt) && (str.head.toInt >= 'A'.toInt))
            s"${(str.head.toInt + 32).toChar}${toLower(str.tail)}"
          else
            s"${str.head}${toLower(str.tail)}"
        }
        else{
          if((str.head.toInt <= 'Z'.toInt) && (str.head.toInt >= 'A'.toInt))
            s"${(str.head.toInt + 32).toChar}"
          else
            s"${str.head}"
        }
    }

    def formatNames(str: String, fun: String => String): Unit = {
        println(fun(str))
    }

    def main(args: Array[String]) = {
        var names = Array("Benny", "Niroshan", "Saman", "Kumara")

        formatNames(names(0), toUpper)
        formatNames(names(1), toUpper)
        formatNames(names(2), toLower)
        formatNames(names(3), toLower)
    }
}