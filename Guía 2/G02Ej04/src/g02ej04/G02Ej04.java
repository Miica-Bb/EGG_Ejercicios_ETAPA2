package g02ej04;

import java.util.Scanner;

public class G02Ej04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double celcius;
        
        System.out.println("Ingrese una temperatura en grados Celcius");
        celcius = leer.nextInt();
        
        double convertirFahrenheit = 32 + (9 * celcius / 5);
        System.out.println(celcius + "°C equivalen a " + convertirFahrenheit + "°F");
        
    }
    
}
