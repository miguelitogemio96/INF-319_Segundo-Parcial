leer::IO Int
leer = do
  num <- getLine
  return (read num)

suma = \a -> \b -> a + b
resta = \a -> \b -> a - b
mult = \a -> \b -> a * b
divi = \a -> \b -> a `div` b

main = do
  putStr("______________CALCULADORA________________\n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division\n>\n")
  op <- leer
  putStr("Introduzca el primer numero:> ")
  a <- leer
  putStr("Introduzca el segundo numero:> ")
  b <- leer
  let res=if op==1 then suma a b else if op==2 then resta a b else if op==3 then mult a b else if op==4 then divi a b else 0
  putStr("  Resultado: "++show(res)++"\n")
