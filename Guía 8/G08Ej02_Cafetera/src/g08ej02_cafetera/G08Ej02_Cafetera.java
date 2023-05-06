package g08ej02_cafetera;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;
import java.util.Scanner;

public class G08Ej02_Cafetera {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicios metodosCaf = new CafeteraServicios();
        Cafetera nuevaCaf = metodosCaf.crearCafetera();
        
        int opcion;
        do {
            System.out.println("MENÚ");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    metodosCaf.llenarCafetera(nuevaCaf);
                    continue;
                case 2:
                    metodosCaf.servirTaza(nuevaCaf);
                    continue;
                case 3:
                    metodosCaf.vaciarCafetera(nuevaCaf);
                    continue;
                case 4:
                    metodosCaf.agregarCafe(nuevaCaf);
                    continue;
                case 5:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Ingreso incorrecto, intente nuevamente");
            }
        } while (opcion != 5); 
    }

}
