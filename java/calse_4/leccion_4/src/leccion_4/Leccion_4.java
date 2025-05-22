
package leccion_4;

public class Leccion_4 {

    public static void main(String[] args) {
        // typo byte
        byte num_byte  = (byte)127;
        System.out.println("num_byte = " + num_byte);
        System.out.println("valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("el valor maximo del byte: " + Byte.MAX_VALUE);
        //tipo short
        short num_short = 32767;
        System.out.println("num_short = " + num_short);
        System.out.println("el valor minimo es" + Short.MIN_VALUE);
        System.out.println("el valor maximo es: " + Short.MAX_VALUE);
        //tipo int
        int num_entero = (int)2147483647;
        System.out.println("num_entero = " + num_entero);
        System.out.println("el valor minimo es" + Integer.MIN_VALUE);
        System.out.println("el valor maximo es: " + Integer.MAX_VALUE);
        //tipo long
        long num_entero_long = 9223372036854775807L;
        System.out.println("num_entero_long = " + num_entero_long);
        System.out.println("el valor minimo es" + Long.MIN_VALUE);
        System.out.println("el valor maximo es: " + Long.MAX_VALUE);
        //tipo float
        float num_float = 3.4028235E38F;
        System.out.println("num_float = " + num_float);
        System.out.println("el valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("el valor maximo de float: " + Float.MAX_VALUE);
        //tipo double
        double num_double = 1.7976931348623157E308D;
        System.out.println("num_double = " + num_double);
        System.out.println("el valor minimo de float: " + Double.MIN_VALUE);
        System.out.println("el valor maximo de float: " + Double.MAX_VALUE);
    }
    
}