object nomor6 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val platNomor = new Array[String](n)
    for (i <- 0 until n) {
      platNomor(i) = scala.io.StdIn.readLine()
    }

    val daftarDaerah = List("A", "AB", "B", "F")

    val kelompok = daftarDaerah.flatMap { daerah =>
      val platDaerah = platNomor.filter(plat => plat.startsWith(daerah) && plat.length == daerah.length)
      if (platDaerah.nonEmpty) Some((daerah, platDaerah)) else None
    }.sortBy(_._1) // Sorting the groups alphabetically

    kelompok.foreach { case (daerah, platDaerah) =>
      println(s"$daerah: ${platDaerah.mkString(", ")}")
    }
  }
}
