print("______________CALCULADORA________________\n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division")
op = int(input("Elija una Opcion 1-4: "))
a = int(input("Introduzca el 1er numero: "))
b = int(input("Introduzca el 2do numero: "))
res = 0
suma = lambda a,b:a+b
resta = lambda a,b:a-b
mult = lambda a,b:a*b
div = lambda a,b:a/b
if (op == 1):
    res = suma(a,b)
elif (op == 2):
    res = resta(a,b)  
elif (op == 3):
    res = mult(a,b)  
elif (op == 4):
    res = div(a,b)
else:
    res = "Opcion invalida"
print(f'El resultado es: {res}')  