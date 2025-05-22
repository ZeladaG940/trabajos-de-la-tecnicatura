
package ejercicio_leccion2;

import java.util.Scanner;

public class Ejercicio_leccion2 {
    
    public static void main(String[] args) {
        System.out.println("detalles de un libro");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre de un libro: ");
        var nombre = entrada.nextLine();
        System.out.println("ingrese el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println("el nombre del libro es: " + nombre + " y el nombre del autor es: " + autor);
    }
}
   