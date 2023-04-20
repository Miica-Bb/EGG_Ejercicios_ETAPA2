import java.util.Scanner;

public class G02Ej03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
