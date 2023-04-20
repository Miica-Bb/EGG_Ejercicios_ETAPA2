
import java.util.Scanner;

public class G05Ej02Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se llenarán dos vectores de modo aleatorio y se comprobará si son iguales");
        System.out.println("Indique la longitud que tendrán");
        int longitud = leer.nextInt();
        int vectorUno[] = new int[longitud];
        int vectorDos[] = new int[longitud];
        
        llenarVector(vectorUno);
        llenarVector(vectorDos);
        compararVectores(vectorUno, vectorDos);
        
    }
    
    ///////////////////////////////////////////////////////////////////////LLENAR VECTORES
    
    public static void llenarVector (int vector[]) {
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random() * 3 + 1);
        }
        
        for(int elemento: vector) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
    
    //////////////////////////////////////////////////////////////////////COMPARAR VECTORES
    
    public static void compararVectores (int vectorUno[], int vectorDos[]) {
        
        for (int i = 0; i < vectorUno.length; i++) {
            if ((vectorUno[i] == vectorDos[i]) && (i == vectorUno.length - 1)) {
                System.out.println("Ambos vectores son iguales");
            } else if (vectorUno[i] != vectorDos[i]) {
                System.out.println("Los vectores son distintos");
                break;
            }
        }
    }
    
}
