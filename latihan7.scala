trait KalkulatorBangunDatar {
    def hitungLuas (a: Int, b: Int): Int = {
        var Luas =  a
        Luas
    }
    def hitungKeliling (a: Int): Unit = {
    }
}

class Persegi (private var a: Int) extends KalkulatorBangunDatar {
    override def hitungLuas (a: Int): Int = {
        var Luas = a*a
        Luas
    }

    var luasPersegi = hitungLuas(a)
    def display()= {
        println(luasPersegi)
    }
} 

@main def Main()={
    var persegi1 = new Persegi (5)
    persegi1.hitungLuas()
    persegi1.display()
}