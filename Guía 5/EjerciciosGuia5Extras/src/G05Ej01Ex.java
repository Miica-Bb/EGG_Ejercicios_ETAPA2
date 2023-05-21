import java.util.Scanner;

public class G05Ej01Ex {
        
    public static void main(String[] args) {
        double[] vectorUno = crearVector();
        llenarVector(vectorUno);
        System.out.println("La suma de los números ingresados es: " + sumarVector(vectorUno));
    }
    
    ////////////////////////////////////////////////////////
    
    public static double[] crearVector() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique la cantidad de números a sumar");
        int tam = leer.nextInt();
        
        return (new double[tam]);
    }
    
    ////////////////////////////////////////////////////////
    
    public static void llenarVector(double[] vector) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ahora llenaremos el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresar " + (i + 1) + "° número: ");
            vector[i] = leer.nextDouble();
        }
        
    }
    
    //////////////////////////////////////////////////////
    
    public static double sumarVector(double[] vector) {
        double suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        
        return suma;
    }

}
