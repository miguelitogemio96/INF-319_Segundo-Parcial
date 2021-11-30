leer::IO Int
leer = do
  num <- getLine
  return (read num)

operacion f1 x = (f1) x

main = do
  putStr("______________CALCULADORA________________\n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division\n>\n")
  op <- leer
  putStr("Introduzca el primer numero:> ")
  a <- leer
  putStr("Introduzca el segundo numero:> ")
  b <- leer
  let res=if op==1 then operacion (+a) b else if op==2 then operacion (subtract b) a else if op==3 then operacion (*a) b else if op==4 then operacion (div a) b else 0
  putStr("  Resultado: "++show(res)++"\n")