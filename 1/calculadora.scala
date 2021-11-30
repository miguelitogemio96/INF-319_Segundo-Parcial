object Calculadora {
  def main(args: Array[String]): Unit = {
    print("\n______________CALCULADORA________________\nElije una opcion:\n  1 Suma\n  2 Resta\n  3 Multiplicacion\n  4 Division\n  > ")
    val op = scala.io.StdIn.readLine.toInt
    print("Introduce 1er Num: ")
    val a : Int = scala.io.StdIn.readLine.toInt
    print("Introduce 2do Num: ")
    val b : Int = scala.io.StdIn.readLine.toInt
    val res: Int = if (op == 1) suma(a,b) else if (op == 2) resta(a,b) else if (op == 3) mult(a,b) else if (op == 4) div(a,b) else 0
    print("       Resultado: "+res)
  }

  def suma(a:Int,b:Int): Int = {
    return (a + b)
  }
  def resta(a:Int,b:Int): Int = {
    return (a - b)
  }
  def mult(a:Int,b:Int): Int = {
    return (a * b)
  }
  def div(a:Int,b:Int): Int = {
    return (a / b)
  }
}