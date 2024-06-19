object latihan110 {

  trait Kalkulator {
    def penjumlahan(): Int 
    def pengurangan(): Int 
  }

  class Persegi(sisi: Int) extends Kalkulator {
    override def penjumlahan(): Int = {
      val jumlah = sisi + sisi
      jumlah
    }

    override def pengurangan(): Int = {
      0 // atau implementasi lain jika diperlukan
    }

    // Metode display untuk menampilkan informasi Persegi
    def display(): Unit = {
      println(s"Persegi dengan sisi: $sisi")
      println(s"Hasil penjumlahan sisi: ${penjumlahan()}")
    }
  }

  class Orang(nama: String) {
    println(nama)
  }

  def main(args: Array[String]): Unit = {
    val persegi1 = new Persegi(25)
    persegi1.display() // Memanggil metode display

    var array1 = Array("Saya", "Budi")

    val Sucahya = new Orang("Mantap")

    (1 to 10).map(_ * 2).foreach(println)

    val list2 = List(1, 2, 3, 4).map(_ * 2).filter(data => data % 2 == 0).foreach(print)

    val data = List.range(1, 10)

    var B = 2
    if (B == 2)
      println("ini dua")
    else
      println("saya dua")
  }
}
