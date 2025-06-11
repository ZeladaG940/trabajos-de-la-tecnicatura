#calcular el factorial de un numero mayor o igual a 0
from math import factorial

numero = int(input("ingrese el numero: "))
i = 0
while i < numero:
    numero *= i
    i += 1
print(numero)

