object KelompokPlatNomor extends App {
    def input(x : Int) : List[String] = {
    def base(y : Int, daftar : List[String]) : List[String] = {
        if (y < 1) daftar
        else base(y-1, scala.io.StdIn.readLine :: daftar)
    }
        base(x, List())
    }

    def kelompok(x : String) : String ={
        if (x.startsWith("AB")) return "AB"
        else if (x.startsWith("A")) return "A"
        else if (x.startsWith("B")) return "B"
        else return "F"
    }

    var a = scala.io.StdIn.readLine.toInt
    var plat = input(a).reverse
    var hasil = plat.groupBy(kelompok)
    var hasil2 = hasil.toSeq.sortBy(_._1)
    hasil2.foreach{case (key, value) => println("" + key + ": " + value.mkString(", "))}

    }
