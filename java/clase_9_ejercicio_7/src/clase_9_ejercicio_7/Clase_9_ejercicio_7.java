
package clase_9_ejercicio_7;

import java.util.Scanner;

public class Clase_9_ejercicio_7 {

    public static void main(String[] args) {
        final int salario = 1000;
        var comision = 150;
        Scanner valor = new Scanner(System.in);
        System.out.println("ingre los meses trabajados: ");
        int meses = valor.nextInt();
        System.out.println("ingre cuantos autos vendio: ");
        int autos = valor.nextInt();
        System.out.println("ingrese el valor un auto vendido");
        float valorVenta = valor.nextFloat();
        
        var porsentaje = valorVenta * 0.5;//el porsentaje de paga por auto
        var resulTotal = porsentaje + (salario * meses);//se suma con el salario mensual
        System.out.println("su lario es de: " + resulTotal + " por mes");
    }
    
}
