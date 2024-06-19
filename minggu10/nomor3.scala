object Soal3_LKP10 extends App {
  def cekPalindrome(kata : String) : Boolean = {
    kata == kata.reverse
  }
 
    val n = scala.io.StdIn.readInt()
    val baris = new Array[String](n)
    for (i <- 0 until n) {
      baris(i) = scala.io.StdIn.readLine()
    }

    var palindrome = baris.map(_.toLowerCase).filter(cekPalindrome).sortWith(_ > _)
    palindrome.foreach(println)
  
}
