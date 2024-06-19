import scala.io.StdIn.readLine

def asal() = {
    println("Saya")
}

@main def helloNama() = {
    println("masukkan nama")
    val name = readLine()
    var x: Int = 5
    println("Hello, " + name)
    println("Calling asal() function now...")
    asal()
    println("asal() function finished.")
    println(s"$x")
    println(x)
}
