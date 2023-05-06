package Servicios;

import java.util.Scanner;
import Entidades.Operacion;

public class OperacionServicios {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Se le pedirán dos números enteros a partir de los que se realizarán operaciones");
        
        System.out.println("ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        return (new Operacion(num1, num2));
    }
    
    public int sumar(Operacion cuenta) {
        int suma;
        return (suma = (cuenta.getNumero1() + cuenta.getNumero2()));
    }
    
    public int restar(Operacion cuenta) {
        int resta;
        return (resta = (cuenta.getNumero1() - cuenta.getNumero2()));
    }
    
    public int multiplicar(Operacion cuenta) {
        int multiplicacion;
        
        if ((cuenta.getNumero1() == 0) || (cuenta.getNumero2() == 0)) {
            System.out.println("Uno de los números ingresados es 0, por lo tanto");
            return 0;
        } else {
            return (multiplicacion = (cuenta.getNumero1() * cuenta.getNumero2()));
        }
        
    }
    
    public double dividir(Operacion cuenta) {
        double division;
        
        if ((cuenta.getNumero1() == 0) || (cuenta.getNumero2() == 0)) {
            System.out.println("Uno de los números ingresados es 0, por lo tanto");
            return 0;
        } else {
            return (division = (cuenta.getNumero1() / cuenta.getNumero2()));
        }
    }
    

    public int menu() {
        System.out.println("Qué operación desea realizar? (Ingrese número del 1 al 5 según corresponda)");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int opcion;
        do {
            opcion = leer.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("número ingresado incorrecto. Intente nuevamente");
            } 
        } while (opcion < 1 || opcion > 4);
        
        return opcion;
        
    }
}
