
import java.util.Scanner;

public class G03Ej07Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Este programa compara números positivos y enteros ingresados por el usuario");
        System.out.println("Indicque la cantidad de números que va a ingresar");
        int cant = leer.nextInt();
        int numMin = 0, numMax = 0;
        double promedio = 0, suma = 0, aux = cant;
        
        while (cant > 0) {
            System.out.println("ingrese un número");
            int num = leer.nextInt();
            
            while (num < 1) {
                System.out.println("El número ingresado no es positivo. Ingrese nuevamente un número entero y positivo");
                num = leer.nextInt();
            }
            
            if (suma == 0) {
                numMin = num;
            }
            if (num < numMin) {
                numMin = num;
            }
            if (num > numMax) {
                numMax = num;
            }
            
            suma = suma + num;
            cant = cant - 1;
            
            if (cant == 0) {
                promedio = suma / aux;
            }
        }    
        
        System.out.println("INFORMACIÓN DE LOS NÚMEROS INGRESADOS:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Menor número ingresado: " + numMin);
        System.out.println("Mayor número ingresado: " + numMax);
        
    }
    
}
