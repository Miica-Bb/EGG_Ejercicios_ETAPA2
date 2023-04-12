package manosalaobra2;

import java.util.Scanner;

public class ManosALaObra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("Ingrese un número entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero");
        num2 = leer.nextInt();

        if (num1 == 25 && num2 == 25) {
            System.out.println("Los números ingresados son ambos 25");
        } else if (num1 == 25 || num2 == 25) {
            System.out.println("Alguno de los números ingresados es igual a 25");
        } else {
            System.out.println("Usted ingresó " + num1 + " y 6" + num2);
        }
    }
}
    
