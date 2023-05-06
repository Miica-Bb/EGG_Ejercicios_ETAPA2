package Servicios;

import Entidades.Punto;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PuntoServicios {
    Scanner leer = new Scanner(System.in);
    
    public Punto crearPunto() {
        double x, y;

        System.out.println("Indicar el valor de la coordenada X");
        x = leer.nextDouble();
        System.out.println("Indicar el valor de la coordenada Y");
        y = leer.nextDouble();

        return (new Punto(x, y));
    }
    
    public double calcularDistancia (Punto a, Punto b) {
        double resultado = (sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2)));
        return resultado;
    }
}
