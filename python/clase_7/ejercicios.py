#pedorle al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12
#luego decimos en estacion del año estan
#mes = int(input("Ingrese un mes (1-12): "))
#si mes esta en estos ramgos entonces
#if mes in [1, 2, 3]:
    #estacion = "Verano"
#elif mes in [4, 5, 6]:
    #estacion = "Otoño"
#elif mes in [7, 8, 9]:
 #   estacion = "Invierno"
#elif mes in [10, 11, 12]:
 #   estacion = "Primavera"
#else:
 #   estacion = "Mes inválido"

#print(f"Estás en: {estacion}")

#haremos un programa que cuando el usuario indique su edad, imprima la etapa de su vida en una oracion
#edad = int(input("Ingrese su edad: "))
#if edad < 0:
 #   print("ingrese denuevo su edad")
#elif edad <= 10:
 #   print("la infancia es increible y grandiosa")
#elif edad <= 11 and edad < 18:
 #   print("tienes muchos cambios mucho que estudiar")
#elif edad <= 20 and edad < 29:
 #   print("amor y comienza el trabajo")
#elif edad <= 30 and edad < 80:
 #   print("Eres un adulto solo labura y disfruta en familia")
#else:
 #   print("jubilate")

#crea un sistema de calificaciones
nota = int(input("Ingrese su calificación del 1 al 10: "))

if 9 <= nota <= 10:
    print("Nota A")
elif 8 <= nota < 9:
    print("Nota B")
elif 7 <= nota < 8:
    print("Nota C")
elif 6 <= nota < 7:
    print("Nota D")
elif nota < 6:
    print("Nota F")
else:
    print("error")
