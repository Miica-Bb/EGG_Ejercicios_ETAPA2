package g02ej05;

import java.util.Scanner;

public class G02Ej05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        System.out.println("Ingrese un número entero");
        num1 = leer.nextInt();
        
        int doble = num1 * 2;
        int triple = num1 * 3;
        double raiz = Math.sqrt(num1);
        
        System.out.println("Número ingresado: " + num1);
        System.out.println("Su doble es: " + doble);
        System.out.println("Su triple es: " + triple);
        System.out.println("Su raíz cuadrada es: " + raiz);
        
        
    }
    
}
