
import java.util.Scanner;

public class G04Ej04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        boolean numPrimo = esPrimo(num);
        
        if (numPrimo == true) {
            System.out.println("El número ingresado es primo (solo es divisible por 1 y si mismo)");
        } else if (numPrimo == false) {
            System.out.println("El número ingresdo NO es primo");
        } else {
            System.out.println("Sucedió algo raro, reinicie el programa");
        }
        
    }
    
    public static boolean esPrimo (int num) {
        boolean primo = true;
        
        for (int i = 2; i < num; i++) {

            if ((num != 2) && (num != 3) && (num%i == 0)) {
                primo = false;
                break;
            } else if (num == 2 || num == 3 || (num%i != 0 && i == num - 1)) {
                primo = true;
                break;
            }
        }
        
        return primo;
    }
}
