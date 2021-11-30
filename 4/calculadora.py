def suma(a,b):
    return a + b
def resta(a,b):
    return a - b
def mult(a,b):
    return a * b
def div(a,b):
    return a / b
def ejecutar_funcion(funcion, a, b):
    return funcion(a,b);    


print("______________CALCULADORA________________\n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division\n-->")
op = int(input("Elija una Opcion 1-4: "))
a = int(input("Introduzca el 1er numero: "))
b = int(input("Introduzca el 2do numero: "))
res = 0
if (op == 1):
    res = ejecutar_funcion(suma,a,b)
elif (op == 2):
    res = ejecutar_funcion(resta,a,b)  
elif (op == 3):
    res = ejecutar_funcion(mult,a,b)  
elif (op == 4):
    res = ejecutar_funcion(div,a,b)
else:
    res = "Opcion invalida"
print(f'El resultado es: {res}')  