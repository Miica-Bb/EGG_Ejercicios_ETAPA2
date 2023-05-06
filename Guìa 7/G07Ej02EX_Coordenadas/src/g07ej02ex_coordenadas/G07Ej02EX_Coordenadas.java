package g07ej02ex_coordenadas;

import Entidades.Punto;
import Servicios.PuntoServicios;
import java.util.Scanner;

public class G07Ej02EX_Coordenadas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PuntoServicios metodo = new PuntoServicios();
        System.out.println("Se calculará la distancia entre dos puntos ubicados en el eje cartesiano");
        System.out.println("");
        
        System.out.println("Vamos a crear el primer punto");
        Punto a = metodo.crearPunto();
        System.out.println("");
        
        System.out.println("Vamos a crear el segundo punto");
        Punto b = metodo.crearPunto();
        System.out.println("");
        
        double distancia = metodo.calcularDistancia(a, b);
        System.out.println("La distancia entre el primer punto y el segundo es: " + distancia);
    }

}
