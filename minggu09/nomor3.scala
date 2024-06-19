import scala.math.{sqrt, pow}

object nomor3 {
  def nilaiMeanKuadrat(x: Int, mean: Double): Double = {
    pow(x - mean, 2)
  }
  
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val n = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var valid = n.filter(x => x >= 0 && x <= 100)
  
    var mean = valid.sum.toDouble / valid.size  
    var pembilang = valid.map(nilaiMeanKuadrat(_, mean)).sum  
    var ragam = pembilang / valid.size
  
    printf("%.2f", ragam)
  }
}
