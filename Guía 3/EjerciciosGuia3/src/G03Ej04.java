
import java.util.Scanner;

public class G03Ej04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que comience con 'A'");
        String frase = leer.nextLine();
        
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO. Lo ingresado comienza con " + frase.substring(0, 1));
        }
                
    }
    
}
