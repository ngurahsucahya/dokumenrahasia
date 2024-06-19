object latihan11 {
    import scala.io.StdIn.readLine
    trait Bentuk {
        def luas(a:Int):Int
        def keliling():Int
    }

    class Persegi (sisi: Int)extends Bentuk{
        override def luas(a: Int):Int = {
            var Luas = sisi*sisi
            Luas
        }
        override def keliling():Int = {
            var Keliling = 4*sisi
            Keliling
        }
        def cetak():Unit = {
            println(s"Luas: ${luas()}")
        }
    }
    def main(args: Array[String]):Unit = {
        val persegi1 = new Persegi(5)
        persegi1.cetak()

        val n = readLine().toInt
        val array = readLine().split(",")
        for (x<-1 to n){
            val a = readLine().toInt
            array.foreach(println)
            print(a)
        }

    }
}