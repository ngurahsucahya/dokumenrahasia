@main def Main() = {
    var buah = List("pepaya", "pisang")
            .map(_.toUpperCase)
            .foreach(println)
}