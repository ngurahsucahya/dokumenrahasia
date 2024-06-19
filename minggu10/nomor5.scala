object nomor5 extends App {
    def data(x : String) : String ={
        if(x.startsWith("{")) return x.drop(1)
        else if(x.endsWith("}")) return x.dropRight(1)
        else x
    }

    var json = scala.io.StdIn.readLine.split(", ").toList
    json = json.map(data)
    var ekstrak = json.map(_.split("'").toList)
                    .map(_.filter(x => x != ": " && x != ""))
    var key = ekstrak.map(_.head)
    var value = ekstrak.map(_.last)
    println("key: " + key.mkString(", "))
    println("value: " + value.mkString(", "))
}