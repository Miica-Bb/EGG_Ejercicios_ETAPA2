
import java.util.Scanner;


public class G04Ej02 {

    public static void main(String[] args) {
 
        System.out.println("A continuación se pedirán datos de personas y se indicará si son o no mayores de edad");
        infoPersonas();
        
    }
    
    public static void infoPersonas () {
        Scanner leer = new Scanner(System.in);
        String finalizar;
        int contador = 0;
        
        do {
            contador = contador + 1;
            System.out.println("Ingresar primer nombre de la " + contador + "° persona");
            String nombre = leer.next();
            System.out.println("Ingresar edad de la " + contador + "° persona");
            int edad = leer.nextInt();
            
            boolean adulto = mayoriaEdad(edad);
            if (adulto == true) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " aún es menor de edad");
            }
            
            System.out.println("Desea agregar más personas? (S/N)");
            finalizar = leer.next().toUpperCase();
            
        } while (!"N".equals(finalizar));

    }
    
    public static boolean mayoriaEdad (int edad) {
        int mayoriaEdad = 18;
        boolean esMayor = edad >= mayoriaEdad;
        return esMayor;
    }
    
}
