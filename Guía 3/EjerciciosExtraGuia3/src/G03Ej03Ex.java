
import java.util.Scanner;

public class G03Ej03Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        boolean vocal = letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U");
        
        if (vocal) {
            System.out.println("La letra ingresada, " + letra + ", es una VOCAL");
        } else {
            System.out.println("La letra ingresada, " + letra + ", es una CONSONANTE");
        }
        
    }
    
}
