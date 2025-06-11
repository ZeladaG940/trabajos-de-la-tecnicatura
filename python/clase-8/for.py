cadena = "orlando"
for letras in cadena:# se crea la variable letras y se recorre el string de cadena
    print(letras)
else:
    print("fin del ciclo")

for letra in "hola":
    if letra == ("b"):
        print(f"se enocntro la letra: {letra}")
        break #rompe la estructura y saldra del bucle y seguira con lo demas
else:
    print(" no se encontro la letra")


for i in range(10):#se declara el iterador y luego se define el rango
    if i % 2 == 0:
        print(f"par {i}")
    else:
        print(f"impar {i}")