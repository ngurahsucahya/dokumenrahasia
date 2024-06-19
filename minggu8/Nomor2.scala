object Nomor2 {
  def main(args: Array[String]): Unit = {

    val N = scala.io.StdIn.readInt()

    val array1 = Array.fill(N)(scala.io.StdIn.readInt())
    val array2 = Array.fill(N)(scala.io.StdIn.readInt())

    val mutlakarray1 = array1.map(math.abs).max
    val mutlakarray2 = array2.map(math.abs).max

    val hasilPerkalian = mutlakarray1 * mutlakarray2

    println(s"$hasilPerkalian")
  }
}
