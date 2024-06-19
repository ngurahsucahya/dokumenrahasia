object TransposeMatrix {
  import scala.io.StdIn.readLine

  def transposeMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val M = matrix.length
    val N = matrix(0).length

    // Membuat matriks hasil transpose dengan ukuran N x M
    val transposedMatrix = Array.ofDim[Int](N, M)

    // Mengisi matriks transpose
    for {
      i <- 0 until M
      j <- 0 until N
    } {
      transposedMatrix(j)(i) = matrix(i)(j)
    }

    transposedMatrix
  }

  def main(args: Array[String]): Unit = {
    // Membaca nilai M dan N
    val Array(M, N) = readLine().split(" ").map(_.toInt)

    // Membaca matriks dari input
    val matrix = Array.ofDim[Int](M, N)
    for (i <- 0 until M) {
      matrix(i) = readLine().split(" ").map(_.toInt)
    }

    // Menghitung matriks transpose
    val result = transposeMatrix(matrix)

    // Mencetak matriks transpose
    println("Matriks transpose:")
    for {
      i <- 0 until result.length
      j <- 0 until result(0).length
    } {
      print(result(i)(j))
      if (j < result(0).length - 1) print(" ") else println()
    }
  }
}
