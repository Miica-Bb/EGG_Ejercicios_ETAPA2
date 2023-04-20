
import java.util.Scanner;
import java.util.Random;

public class G05Ej03Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se creará un vector, se rellenará aleatoriamente y se mostrará por pantalla cómo quedó conformado");
        System.out.println("Indique la longitud que desea que tenga el vector");
        int longitud = leer.nextInt();
        int vector[] = new int[longitud];
        
        System.out.println("");
        llenarVector(vector);
        mostrarVector(vector);
        
    }
    
    //////////////////////////////////////////////////////////////////LLENAR VECTOR
    
    public static void llenarVector (int vector[]) {
        
        Scanner leer = new Scanner(System.in);
        Random numsAleatorios = new Random();
        
        System.out.println("A continuación, se pedirán los valores mínimo y máximo que se tendrá en cuenta para la generación aleatoria de los elementos");
        System.out.println("Ingrese el valor mínimo:");
        int min = leer.nextInt();
        System.out.println("Ingrese el valor máximo:");
        int max = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = min + numsAleatorios.nextInt((max + 1) - min);
        }
    }
    
    /////////////////////////////////////////////////////////////////IMPRIMIR VECTOR
    
    public static void mostrarVector (int vector[]) {
        
        System.out.println("");
        for (int elemento: vector) {
            System.out.print(elemento + " ");
        }
       
    }
}
