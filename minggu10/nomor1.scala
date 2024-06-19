object nomor1 extends App {
  def cekgrupBilangan(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until Math.sqrt(n).toInt + 1).exists(i => n % i == 0)
  }

  val N = scala.io.StdIn.readInt()
  val input = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

  val grupBilangan = input.groupBy(cekgrupBilangan)

  val prima = grupBilangan.getOrElse(true, List())
  val bukanPrima = grupBilangan.getOrElse(false, List())

  println(s"Prima: ${prima.mkString(", ")}")
  println(s"Non-prima: ${bukanPrima.mkString(", ")}")
}
