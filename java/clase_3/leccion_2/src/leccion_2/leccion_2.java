package leccion_2;

import java.util.Scanner;

public class leccion_2{
    public static void main(String[] args) {
        //inferencias de tipos de datos
        var num = 50;
        var texto = " seguimos aprendiendo";
        System.out.println( num + texto);
        
        //concatenacion de variables
        var tex = "orlando";
        var tex2 = "zelada gira";
        var tex3 = tex + tex2;
        System.out.println("su nombre es: " + tex3);
        
        var numero = 18;
        var numero2 = 20;
        System.out.println(numero + numero2);
        
        //ejercicio:  caracteritticas es especiales
        var nombre = "osvaldo";
        System.out.println("nueva linea: \n" + nombre);//diagonal inversa \n
        System.out.println("sisten tabulador: \t" + nombre);//tabulador un espacio para sentrar
        System.out.println("menu: \t" + nombre);
        System.out.println("\t\t.menu: ");
        System.out.println("retroceso: \b" + nombre);//caracter de retroseso
        System.out.println("comillas dobles: \"" + nombre + "\"");//comillas dobles
        
        //clase scaner
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        var usuario = entrada.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("ingre el titulo: ");
        var entrada2 = entrada.nextLine();
        System.out.println("el nombre del tituloe es: " + entrada2);
        
    }
    
}