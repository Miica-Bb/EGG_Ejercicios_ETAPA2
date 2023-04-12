
import java.util.Scanner;

public class G03Ej03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase. Debe tener 8 caracteres");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("CORRECTO. Se ingresó una palabra o frase de 8 de largo");
        } else {
            System.out.println("INCORRECTO. Se ingresó una palabra o frase de " + frase.length() + " de largo");
        }
    }
    
}
