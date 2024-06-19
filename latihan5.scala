trait Pahlawan {
    def darah(): Unit = {
        println("Yeay kamu dapat darah")
    }
}

class Orang (private var a: String, private var b: String) extends Pahlawan{
    def display(): Unit = {
        println(s"Nama: $a")
    } 
}

@main def main() = {
    var sucahya = new Orang("Sucahya", "Saya")
    sucahya.display()
    sucahya.darah()
}