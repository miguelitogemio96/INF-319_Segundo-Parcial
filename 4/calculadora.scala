object Calculadora {
  def main(args: Array[String]): Unit = {
    print("\n______________CALCULADORA________________\nElije una opcion:\n  1 Suma\n  2 Resta\n  3 Multiplicacion\n  4 Division\n  > ")
    val op = scala.io.StdIn.readLine.toInt
    print("Introduce 1er Num: ")
    val a : Int = scala.io.StdIn.readLine.toInt
    print("Introduce 2do Num: ")
    val b : Int = scala.io.StdIn.readLine.toInt

    val suma = sum _;// Aquí sum es una función, asigna la función a una variable
    val resta = res _;
    val mult = mul _;
    val divi = div _;

    val resultado: Int = if (op == 1) suma(a,b) else if (op == 2) resta(a,b) else if (op == 3) mult(a,b) else if (op == 4) divi(a,b) else 0
    print("       Resultado: "+resultado)
  }

  def sum(a:Int,b:Int)= a+b;
  def res(a:Int,b:Int)= a-b;
  def mul(a:Int,b:Int)= a*b;
  def div(a:Int,b:Int)= a/b;
}