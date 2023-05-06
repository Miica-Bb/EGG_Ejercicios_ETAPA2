package Servicios;
    
import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicios {
    Scanner leer = new Scanner(System.in);
    
    public void crearRectangulo(Rectangulo rectUno) {
        System.out.println("Crearemos un rectángulo");
        
        System.out.println("Ingrese la base del mismo");
        rectUno.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del mismo");
        rectUno.setAltura(leer.nextDouble());   
    }
    
    public double calcularSuperficie (Rectangulo rectUno) {
        double resultado = rectUno.getBase() * rectUno.getAltura();
        return resultado;
    }
    
    public double calcularPerimetro (Rectangulo rectUno) {
        double resultado = (rectUno.getAltura() + rectUno.getBase()) * 2;
        return resultado;
    }
}
