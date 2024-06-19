object latihan12 {
  import scala.io.StdIn.{readInt, readLine}

  def countUniqueGroups(M: Int, N: Int): Array[Int] = {
    val result = new Array[Int](M)
    
    for (i <- 0 until M) {
      val numbers = readLine().split(" ").map(_.toInt)
      val uniqueNumbers = numbers.toSet
      result(i) = uniqueNumbers.size
    }
    
    result
  }

  def main(args: Array[String]): Unit = {
    val input = readLine().split(" ").map(_.toInt)
    val M = input(0)
    val N = input(1)
    
    val counts = countUniqueGroups(M, N)
    var sum: Int= 0
    counts.foreach(num=>{
        
        if(num<N){
            sum += 1
        }else{
            sum += 0 
        }
    })
    println (sum)
  }
}
