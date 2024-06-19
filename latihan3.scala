import scala.io.StdIn.readLine
@main def latihan() = {
    var namaBuah = List("duku", "jambu", "pisang");
    for c <- namaBuah do println(c)
    var b = for j <- namaBuah yield j.capitalize
    println(b)
    for a <- b do println(a)
    val n = readLine().toInt
    val ints = List(1, 6, 10, 4, 5)

    ints.foreach(println)
    for
        i <- ints if i <= n
    do
        println(i)
    for
        i <- 0 until n 
    do
        println(i)
}