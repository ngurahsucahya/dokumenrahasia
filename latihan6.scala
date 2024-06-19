trait Hitung{
    def Luas(a: Int, b: Int):Int = {
        var luas = a*b
        luas
    }
}

class Persegi (private var a: Int) extends Hitung{
    var LuasPersegi = Luas(a, a)
    def display() = {
        println(s"$LuasPersegi")
    }
}

@main def main() = {
    var persegi1 = new Persegi(5)
    persegi1.display()
}