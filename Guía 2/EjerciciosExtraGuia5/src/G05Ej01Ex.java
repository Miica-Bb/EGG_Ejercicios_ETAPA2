
import java.util.Scanner;

public class G05Ej01Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Se creará un vector. Indique el tamaño del mismo");
        int longitud = leer.nextInt();
        int vector[] = new int [longitud];
        
        llenarVector(vector);
        int sumaVector = sumarElementosVector(vector);
        System.out.println("");
        System.out.println("La suma de los elemenros del vector formado es " + sumaVector);
        
        
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    
    //LLENAR  Y MOSTRAR VECTOR
    public static void llenarVector (int vector[]) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("A continuación, ingrese los valores enteros que llenarán el vector");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("valor " + (i+1));
            vector[i] = leer.nextInt();
        }
        
        System.out.println("");
        System.out.println("Vector formado:");
        for(int elemento: vector) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    
    //SUMAR ELEMENTOS DEL VECTOR
    
    public static int sumarElementosVector (int vector[]) {
        
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        
        return suma;
    }
    
}
