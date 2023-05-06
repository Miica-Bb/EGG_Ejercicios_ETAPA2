package g07ej03_operacionesaritmeticas;

import Servicios.OperacionServicios;
import Entidades.Operacion;
import java.util.Scanner;

public class G07Ej03_operacionesAritmeticas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OperacionServicios metodo = new OperacionServicios();
        Operacion a = metodo.crearOperacion();
        int opcion = metodo.menu();
        double resultado;
        String repetir = "";
        
        out:
        do {
           
            switch (opcion) {
                case 1:
                    resultado = metodo.sumar(a);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    resultado = metodo.restar(a);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    resultado = metodo.multiplicar(a);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    resultado = metodo.dividir(a);
                    System.out.println("El resultado es: " + resultado);
                    break;
            } 
            System.out.println("Desea realizar otra operación con esos números? (S/N)");
            repetir = leer.next();
            if (repetir.equals("S") || (repetir.equals("s"))) {
                opcion = metodo.menu();
            }
        } while (!"N".equals(repetir) && !"n".equals(repetir));
        
        
    }
    
}
