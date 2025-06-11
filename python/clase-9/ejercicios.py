"""#años visiestos
print("Comprobamos los años bisiestos")
numero = int(input("Ingrese su año: "))

while numero != 1:
    if (numero % 4 == 0 and numero % 100 != 0) or (numero % 400 == 0):
        print("El año es bisiesto")
    else:
        print("El año no es bisiesto")
    numero = int(input("Ingrese otro año o escriba '1' para salir: "))


#calcular la suma de n priimerops numeros
num = int(input("Ingrese un número: "))
suma = 0

for i in range(1, num + 1):
    suma += i

print(suma)"""""

#leer 10 numeros y imprimir cuantos son positivos negativos y neutros
positivos = 0
negativos = 0
neutros = 0

print("ingrese los numeros")
for i in range(10):
    numero = int(input("numero: "))
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    else:
        neutros += 1

print(f"numeros positivos {positivos}")
print(f"numero neativos {negativos}")
print(f"numeros neutros {neutros}")