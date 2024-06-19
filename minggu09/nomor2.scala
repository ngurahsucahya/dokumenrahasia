import scala.math.sqrt

object nomor2 {
  def cekKuadrat(n: Int): Boolean = {
    val akar = sqrt(n)
    akar * akar == n
  }
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val angka = scala.io.StdIn.readLine().split(" ").map(_.toInt) 
    var hasil = angka.filter(cekKuadrat).sum 
    printf("%d", hasil)
  }
}
