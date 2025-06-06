
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author zelad
 */
public class clase_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tipos buleanos
        boolean valor = true;
        boolean valor2 = false;
        System.out.println("valor = " + valor);
        System.out.println("valor2 = " + valor2);
        
        if (valor){
            System.out.println("bandera verde");
        }
        else{
            System.out.println("bandera roja");
        }
        
        //conversion de tipos primitivos
        var edad = Integer.parseInt("20");//este metodo convierte un str a int
        System.out.println("edad = " + edad);
        
        var valPi = Double.parseDouble("3.14");//convierte str en int 
        System.out.println("valPi = " + valPi);
        
        //pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        System.out.println("entrada = " + entrada);
        
        //conversion de tipos part2
        var edadTexto = String.valueOf(10);//convierte un tipo in  str
        System.out.println("edadTexto = " + edadTexto);
        
        var faceChar = "programamcodores".charAt(0);//esto muestra el indice de de una cadena
        System.out.println("faceChar = " + faceChar);
        
        faceChar = entrada.nextLine().charAt(0);//encuentra un un str en la cadena con un imput
        System.out.println("faceChar = " + faceChar);
    }
}
