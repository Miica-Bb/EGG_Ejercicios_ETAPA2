package ejerciciosguia3;

import java.util.Scanner;

public class G03Ej02 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra clave");
        String frase = leer.next();
        
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO. Ingresó la palabra clave");
        } else {
            System.out.println("INCORRECTO. No es la palabra clave");
        }
        
    }
    
    
}
