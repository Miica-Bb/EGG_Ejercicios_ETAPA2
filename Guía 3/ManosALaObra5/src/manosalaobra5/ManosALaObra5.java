package manosalaobra5;

import java.util.Scanner;

public class ManosALaObra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double contador = 0, suma = 0, num = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextDouble();
            
            contador = contador + 1;
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
        } while (contador < 20);
        
        System.out.println("La suma de los números positivos ingresados es: " + suma);
        
        
    }
    
}
