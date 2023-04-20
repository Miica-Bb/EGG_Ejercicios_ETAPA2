import java.util.Scanner;

public class G02Ej01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        String num1 = leer.next();
        int num1B = Integer.parseInt(num1);
        System.out.println("Ingrese otro número entero");
        String num2 = leer.next();
        int num2B = Integer.parseInt(num2);
        
        int suma = num1B + num2B;
        System.out.println("La suma de " + num1B + " y " + num2B + " es: " + suma);
        
        
        
    }
    
}
