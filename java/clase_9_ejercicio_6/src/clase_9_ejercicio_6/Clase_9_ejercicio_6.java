
package clase_9_ejercicio_6;

import java.util.Scanner;

public class Clase_9_ejercicio_6 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);//importo escanner
        
        System.out.println("digite el dinero de gillermo: ");
        float giller = dato.nextFloat();//guardo el dinero en giller
        
        //resultados
        var luis = giller / 2;//
        var juan = (giller + luis) / 2;
        
        //imprimo
        System.out.println("gillemo tiene un total de dolares de : " + giller );
        System.out.println("luis tiene un total de doleres de: " + luis);
        System.out.println("juan tiene un total de dolares de: " + juan);
    }
    
}
