
import java.util.Scanner;

public class G03Ej09Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Este programa realiza divisiones. Se solicitarán dos números enteros mayores a 1");
        int dividendo, divisor, cociente = 1, residuo;
        
        do {
            System.out.println("Ingrese el dividendo");
            dividendo = leer.nextInt();
        } while (dividendo < 2);
        
        do {
            System.out.println("ingrese el divisor");
            divisor = leer.nextInt();
        } while (divisor < 2);
        
        residuo = dividendo - divisor;
        
        do {
            cociente = cociente + 1;
            residuo = residuo - divisor;
        } while (divisor <= residuo);
        
        System.out.println("RESULTADO:");
        System.out.println("cociente: " + cociente);
        System.out.println("residuo: " + residuo);
    }
    
}
