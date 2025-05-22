#Clase 2
#TIPOS DE DATOS
#tipo str(texto)
a = "hola mundo"
print(type(a))
#tipo int(numeros enteros)
a = 10
print(type(a))
#tipo float(numeros con coma)
a = 1.50
print(type(a))
#tipo buleano(verdadero o falso)
a = True
print(type(a))
#tipo buleano(verdadero o falso)
a = False
print(type(a))

#MANEJO DE CADENAS (String)
MiGrupoFavorito = "The Letter Black " + "The Best Rock Band"
print("mi grupo favorito es: " + MiGrupoFavorito)

#otro ejemplo
MiGrupoFavorito = "The Letter Black "
caracteristica = "The Best Rock Band"
print("mi grupo favorito es: ", caracteristica + MiGrupoFavorito)

#otro ejemplo
num = "10"
num2 = "10"
print(num + num2)
print(int(num) + int(num2))

#TIPOS BOLEANOS
num = True
print(num)
num = False
print(num)
resultado = 8 < 1
#ejemplo de condicionales
print(resultado)
if resultado:
    print("el resultado es verdadero")
else:
    print("el resultado es falso")

#PROCESAR ENTRADA DE USUARIO
pelota =(input("digite un nombre: "))
print(pelota)
#convercion de datos
num = int(input("numero: "))
num2 = int(input("digite otro numero: "))
resultado = num + num2
print("el resultado es: ", resultado)
