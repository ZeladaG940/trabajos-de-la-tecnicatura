#instrucciones de la tarea
#se solicita calsular el area y el perimetro de un rectangulo
#para eelo devemos crear las siguientes varianles, alto:int, ancho:int, el usuario
#deve proporcioanr los valores como alto y ancho para aser el calculo y despues imprimirlo
print("Se sacara el area y el perimetro de un triangulo")
alto = int(input("ingrese el alto: "))
ancho = int(input("ingrese el ancho: "))
area = (ancho * alto)
perimetro = (ancho + alto) * 2
print(f"el area del triangulo es {area} y su perimetro es {perimetro}")