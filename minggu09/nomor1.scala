object nomor1 {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val angka = scala.io.StdIn.readLine().split(" ").map(_.toInt)

    val (min, max, jumlahGanjil) = angka.foldLeft((Int.MaxValue, Int.MinValue, 0)) { (total, num) =>
      val (minSekarang, maxSekarang, jumlahGanjilSekarang) = total
      (Math.min(minSekarang, num), Math.max(maxSekarang, num), if (num % 2 != 0) jumlahGanjilSekarang + num else jumlahGanjilSekarang)
    }
    println(s"$min $max $jumlahGanjil")
  }
}
