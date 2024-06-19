object Nomor3 {

    def faktorial(n: Int): Int = {
        if (n == 0 || n == 1) {
        1
        } else {
        n * faktorial(n - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt()
        println(s"${faktorial(n)}")
    }
}
