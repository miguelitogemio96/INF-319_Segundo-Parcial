object Calculadora {
  def main(args: Array[String]): Unit = {
    print("\n______________CALCULADORA________________\nElije una opcion:\n  1 Suma\n  2 Resta\n  3 Multiplicacion\n  4 Division\n--> ")
    val op = scala.io.StdIn.readLine.toInt
    print("Introduce 1er Num: ")
    val a : Int = scala.io.StdIn.readLine.toInt
    print("Introduce 2do Num: ")
    val b : Int = scala.io.StdIn.readLine.toInt
    val suma: (Int, Int) => Int = (x: Int, y: Int) => x + y
    val resta: (Int, Int) => Int = (x: Int, y: Int) => x + y
    val mult: (Int, Int) => Int = (x: Int, y: Int) => x + y
    val div: (Int, Int) => Int = (x: Int, y: Int) => x + y
    val res: Int = if (op == 1) suma(a,b) else if (op == 2) resta(a,b) else if (op == 3) mult(a,b) else if (op == 4) div(a,b) else 0
    print("         Resultado: "+res)
  }
}