
package clase_9;

import java.util.Scanner;

public class Clase_9 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        //pido los datos al usuario
        System.out.println("ingrese la calificacion: ");
        int nota1 = dato.nextInt();
        
        System.out.println("ingrese la calificacion: ");
        int nota2 = dato.nextInt();
        
        System.out.println("ingrese la calificacion: ");
        int nota3 = dato.nextInt();
        
        var resultado = nota1 + nota2 + nota3;//sumo las notas
        System.out.println("la nota es: " + resultado);
    }
    
}
