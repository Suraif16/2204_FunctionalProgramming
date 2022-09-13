object Q_3 {
  case class Account(ac: Int, bal: Int){
    var acNo: Int = ac
    var balance: Int = bal

    def transferTo(ac: Account, bal: Int) = {
      this.balance = this.balance - bal
      ac.deposit(bal)
    }

    def deposit(bal: Int) = {
      this.balance = this.balance + bal
    }

    override def toString(): String = acNo + "\t" + balance
  }

  def main(args: Array[String]) = {
    var A = Account(121475, 16000)
    var B = Account(671680, 26000)

    A.transferTo(B, 5000)
    println(A)
    println(B)
  }
}
