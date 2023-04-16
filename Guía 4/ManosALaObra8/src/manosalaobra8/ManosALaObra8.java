package manosalaobra8;

import java.util.Scanner;

public class ManosALaObra8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
        
    }
    
    ////////////////////////////////////////////////////////////////////////
    
    public static void esMultiplo (int num1, int num2) {
        
        if (num1%num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es múltiplo de " + num2);
        }
    }
}
