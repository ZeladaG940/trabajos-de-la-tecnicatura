
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author zelad
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el nombre dle libro: ");
        String nombreLibro = entrada.nextLine();//con este bloque se obtiene informacion del usuario
        
        System.out.println("digite el id de el libro");
        int id = Integer.parseInt(entrada.nextLine());//se obtiene el nuimero de id del libro
        
        System.out.println("digite el precio del libro: ");//se obtiene el precio del libro en float
        double precio = Double.parseDouble(entrada.nextLine());
        
        System.out.println("el envio es gratuito?: ");//se obtiene el valort buelano 
        boolean confirmar = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println("el nombre del libro es: " + nombreLibro);
        System.out.println("el id del libro es: " + id);
        System.out.println("el precio del libro es: " + precio);
        System.out.println("el envio es gratis: " + confirmar);
    }
}
