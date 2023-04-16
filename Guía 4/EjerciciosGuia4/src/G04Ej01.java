
import java.util.Scanner;


public class G04Ej01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double num1, num2;
        System.out.println("Esta es una calcuuladora simple de dos números");
        System.out.println("Ingrese el primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextDouble();
        
        System.out.println("Qué operación desea realizar con dichos números?");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                double suma = sumar(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            case 2:
                double resta = restar(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            case 3:
                double multiplicacion = multiplicar(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
                break;
            case 4:
                double division = dividir(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + division);
                break;
                
        }
        
        
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////
    
    public static double sumar (double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }
    
    public static double restar (double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }
    
    public static double multiplicar (double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }
    
    public static double dividir (double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
