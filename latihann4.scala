import scala.util.Try

object TryCatchFinallyExample {
  def main(args: Array[String]): Unit = {
    val data: List[Int] = List(1, 2, 3, 4, 5)
    val index = 4
    
    try {
      // Potensial untuk terjadi IndexOutOfBoundsException
      val element = data(index)
      println(s"Element at index $index is $element")
    } catch {
      // Tangkap eksepsi jika terjadi IndexOutOfBoundsException
      case e: IndexOutOfBoundsException =>
        println(s"Index $index out of bounds: ${e.getMessage}")
    } finally {
      // Finally block akan selalu dieksekusi, baik terjadi eksepsi atau tidak
      println("Finally block executed")
    }
  }
}
