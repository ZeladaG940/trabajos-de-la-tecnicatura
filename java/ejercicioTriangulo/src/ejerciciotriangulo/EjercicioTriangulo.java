package ejerciciotriangulo;

import java.util.Scanner;

/**
 *
 * @author zelad
 */
public class EjercicioTriangulo {


    public static void main(String[] args) {
        //Sacar área y perímetro de un rectángulo El mayor de dos números (Operador Ternario)
        
        Scanner dato = new Scanner(System.in);//imorto scanner
        System.out.println("ingrese la base: ");
        int base = dato.nextInt();//guardo el dato en base
        System.out.println("ingrese la altura");
        int alt = dato.nextInt();//guardo el dato en altura
        
        var area = base * alt;//area
        var perimetro = base + (alt*3);//perimetro
        System.out.println("el area es: " + area + " el perimetro es: " + perimetro);//imprimo
        
        //imprimo el numero mayor
        var resultado = (base > alt)? "el numero mayor es " + base : "el numero mayor es " + alt;
        System.out.println(resultado);
    }
    
}
