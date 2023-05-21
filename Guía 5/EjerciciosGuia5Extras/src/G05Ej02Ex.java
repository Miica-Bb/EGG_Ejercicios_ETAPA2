
import java.util.Scanner;

public class G05Ej02Ex {

    public static void main(String[] args) {
        System.out.println("Crearemos el primer vector");
        int[] vector1 = crearVector();
        llenarVector(vector1);
        System.out.println("\n\n\n");
        
        System.out.println("Crearemos el segundo vector");
        int[] vector2 = crearVector();
        llenarVector(vector2);
        System.out.println("\n\n\n");
        
        compararVectores(vector1, vector2);
    }
    
    ///////////////////////////////////////////////////////
    
    public static int[] crearVector() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique el tamaño del vector");
        int tam = leer.nextInt();
        
        return (new int[tam]);
    }
    
    ////////////////////////////////////////////////////////
    
    public static void llenarVector(int[] vector) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ahora llenaremos el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresar " + (i + 1) + "° número: ");
            vector[i] = leer.nextInt();
        }
        
    }
    
    //////////////////////////////////////////////////////
    
    public static void compararVectores(int[] vectorUno, int[] vectorDos) {
        boolean iguales;
        
        if (vectorUno.length != vectorDos.length) {
            System.out.println("Los vectores son distintos, tienen distinto tamaño");
        } else {
            for (int i = 0; i < vectorUno.length; i++) {
                iguales = vectorUno[i] == vectorDos[i];
                
                if (iguales == false) {
                    System.out.println("Los vectores son distintos en la posición " + i);
                    System.out.println("vector1[" + i + "] = " + vectorUno[i] + "; vector2[" + i + "] = " + vectorDos[i]);
                    break;
                } else if (i == vectorUno.length - 1) {
                    System.out.println("Los vectores son iguales!");
                }
            }
        }
    }

}
