num = int(input("digite el numero en un rango de 1 a 3: "))
numtex = ""
if num == 1:
    numtex = "numero 1"
elif num == 2:
    numtex = "numero 2"
elif num == 3:
    numtex = "numero 3"
else:
    numtex = "as ingresado un numero fuera del rango"
print(f"el numero ingresado es: {num} {numtex}")