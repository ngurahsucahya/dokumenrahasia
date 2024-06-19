object Nomor1 {
  def main(args: Array[String]): Unit = {
    val jumlahBilangan = scala.io.StdIn.readInt()
    var jumlahGanjil = 0
    var angkaPertama = true
    var nilaiTerkecil = 0
    var nilaiTerbesar = 0

    for (i <- 1 to jumlahBilangan) {
      val bilangan = scala.io.StdIn.readInt()

      if (angkaPertama) {
        nilaiTerkecil = bilangan
        nilaiTerbesar = bilangan
        angkaPertama = false
      } else {
        if (bilangan < nilaiTerkecil) nilaiTerkecil = bilangan
        if (bilangan > nilaiTerbesar) nilaiTerbesar = bilangan
      }

      if (bilangan % 2 != 0) jumlahGanjil += bilangan
    }

    println(s"$nilaiTerkecil $nilaiTerbesar $jumlahGanjil")
  }
}
