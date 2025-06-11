
package clase_7;

/**
 *
 * @author zelad
 */
public class Clase_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //operadores en java
//        int num = 8, num2 = 15;
//        var solucion = num + num2;//suma
//        System.out.println("suma" + solucion);
//        solucion = num - num2;//resta
//        System.out.println("resta " + solucion);
//        solucion = num * num2;//multtplicacion
//        System.out.println("multiplicacion " + solucion);
//        solucion = num / num2;//divicion
//        System.out.println("divicion " + solucion);
//        
//        var solucion2 = 1.5 / num2;//resultado flotante para que no sea entero
//        System.out.println("solucion flotante " + solucion2);
//        
//        solucion = num % num2;//resto
//        System.out.println("residuo " + solucion);
//        
//        //comprobacion
//        if(num % num2 == 0){
//            System.out.println("es un numero par");
//        }
//        else{
//            System.out.println("el numero no es par");
//        }
//        
        //operadores de asignacion
        int num = 8, num2 = 10;
        var resul = num + num2;
        System.out.println("el resultado es: " + resul);
        
        //una forma mas eficiente de obtener un valor
        num += num2;
        System.out.println("el resultado es " + num);
        num -= num2;
        System.out.println("el resultado es " + num);
        num *= num2;
        System.out.println("el resultado es " + num);
        num /= num2;
        System.out.println("el resultado es " + num);
        num %= num2;
        System.out.println("el resultado es " + num);
       
        
        
    }
}
