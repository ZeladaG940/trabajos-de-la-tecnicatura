num = int(input("ingrese el valor: "))
valor_max = 5
valor_mini = 0
dentro_del_rango = (num >= valor_mini and num <= valor_max)
if dentro_del_rango:
    print(f"el valor {num} esta dentro del rango")
else:
    print(f"el valor {num} esta fuera del rango")