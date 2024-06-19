object Soal3_LKP10 extends App {  
    def hitung (x : String, y : List[String]) : Int = {
    y.count(_ == x)
    }

    var n = scala.io.StdIn.readLine.toInt
    var kata = scala.io.StdIn.readLine.split(" ").toList
    var kalimat = scala.io.StdIn.readLine.split(" ").toList
    var kataSpesifik = kata.map(hitung(_, kalimat)).sum
    println(kataSpesifik)
}