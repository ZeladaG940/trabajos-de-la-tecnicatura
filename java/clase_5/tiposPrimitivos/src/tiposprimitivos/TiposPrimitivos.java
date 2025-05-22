package tiposprimitivos;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        /* //inferencia de var y tipos primitivos
        var numEntero = 20; //las literales sin punto son automaticamente int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;
        System.out.println("numDloat = " + numFloat);//automaticamente con el punto se trnasforma en tipo double
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        //tipos chimitivos
        char miVariableChar = 'a';
        System.out.println("miVariableChar1 = " + miVariableChar);
        
        char VarCaracter= '\u0024';//indicamos a java el valñor unicode
        System.out.println("VarCaracter1 = " + VarCaracter);
        
        char varCaracterDecimal = 36;
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal);
        
        char varSimbolo = '$';
        System.out.println("varSimbolo = " + varSimbolo);
        
        
        
        var miVariableChar1 = 'a';
        System.out.println("miVariableChar1 = " + miVariableChar1);
        
        var VarCaracter1= '\u0024';//indicamos a java el valñor unicode
        System.out.println("VarCaracter1 = " + VarCaracter1);
        
        var varCaracterDecimal1 = 36;//el valor pasa aser auomaticamente entero
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        
        var varSimbolo1 = '$';
        System.out.println("varSimbolo = " + varSimbolo1);
        
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
    }
    
}
