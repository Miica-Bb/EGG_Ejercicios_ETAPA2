
package ejerciciosguia3;

import java.util.Scanner;


public class G03Ej01 {

    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        
        if (num%2 != 0) {
            System.out.println("El número ingresado es impar");
        } else {
            System.out.println("El número ingresado es par");
        }
        
    }
    
}
