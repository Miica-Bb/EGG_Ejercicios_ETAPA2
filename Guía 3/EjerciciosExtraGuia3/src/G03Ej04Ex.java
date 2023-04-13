
import java.util.Scanner;

public class G03Ej04Ex {
    
    public static void main (String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número del 1 al 10, se mostrará su equivalente romano");
        int num;
        
        do {
            
            num = leer.nextInt();
            
            if (num < 1 || num > 10) {
                System.out.println("Número ingresado fuera del rango indicado. Inténtelo nuevamente");
            }
            
        } while (num < 1 || num > 10);
        
        switch (num) {
            case 1:
                System.out.println(num + " = I");
                break;

            case 2:
                System.out.println(num + " = II");
                break;

            case 3:
                System.out.println(num + " = III");
                break;

            case 4:
                System.out.println(num + " = IV");
                break;
            case 5:
                System.out.println(num + " = V");
                break;
            case 6:
                System.out.println(num + " = VI");
                break;
            case 7:
                System.out.println(num + " = VII");
                break;
            case 8:
                System.out.println(num + " = VIII");
                break;
            case 9:
                System.out.println(num + " = IX");
                break;
            case 10:
                System.out.println(num + " = X");
                break;
        }
        
    }
    
}
