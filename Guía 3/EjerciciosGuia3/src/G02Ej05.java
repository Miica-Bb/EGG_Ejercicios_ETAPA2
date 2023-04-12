
import java.util.Scanner;

public class G02Ej05 {

    public static void main(String[] args) {
        
        double limite = 369;
        Scanner leer = new Scanner(System.in);
        double suma = 0;
        
        do {
            
            System.out.println("Ingrese un número");
            double num = leer.nextDouble();
            
            suma = suma + num;
            
        } while (suma <= limite);
    }
    
}
