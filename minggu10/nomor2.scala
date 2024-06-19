object nomor2 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val nama = new Array[String](n)
    for (i <- 0 until n) {
      nama(i) = scala.io.StdIn.readLine()
    }

    val urutan = nama.sorted.sortBy(_.length)
    val hurufbesar = urutan.map(_.toUpperCase)

    hurufbesar.foreach(println)
  }
}
