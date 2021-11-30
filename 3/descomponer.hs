{-
Se hace uso del paquete SPLIT
intalacion: cabal install split
importacion: import Data.List.Split
-}
import Data.List.Split
leer::IO Int
leer = do
  num <- getLine
  return (read num)

leerStr::IO String
leerStr = do
  num <- getLine
  return (read num)

palabras = \cad -> words cad
letras = \cad -> drop 1 (splitOn "" cad)

main = do
  putStr("______________OPERACIONES CON CADENAS________________\nElija una opcion:\n  1 Por Palabras\n  2 Por letras\n")
  op <- leer
  putStr("Introduzca la cadena:  ")
  cadena <- leerStr
  let res= if op==1 then palabras cadena else if op==2 then letras cadena else ["error de opcion"]
  putStr("  Resultado: "++show(res)++"\n")
