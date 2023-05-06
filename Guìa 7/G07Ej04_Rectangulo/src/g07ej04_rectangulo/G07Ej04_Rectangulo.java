package g07ej04_rectangulo;

import Servicios.RectanguloServicios;
import Entidades.Rectangulo;

public class G07Ej04_Rectangulo {

    public static void main(String[] args) {
        RectanguloServicios metodo = new RectanguloServicios();
        Rectangulo rectUno = new Rectangulo();
        
        metodo.crearRectangulo(rectUno);
        System.out.println("La superficie del rectángulo es: " + metodo.calcularSuperficie(rectUno));
        System.out.println("El perímetro del rectángulo es: " + metodo.calcularPerimetro(rectUno));
    }
    
}
