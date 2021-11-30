object Descomponer {
  def main(args: Array[String]): Unit = {
    print("______________OPERACIONES CON CADENAS________________\nElija una opcion:\n  1 Por Palabras\n  2 Por letras\n")
    val op : Int = scala.io.StdIn.readLine.toInt
    print("Introduce la Cadena: ")
    val cad : String = scala.io.StdIn.readLine
    var res = if (op == 1) cad.split(" ") else if (op == 2) cad.split("") else cad.split("",0)
    for ( l <-res ){println("--> "+l)}
  }
}