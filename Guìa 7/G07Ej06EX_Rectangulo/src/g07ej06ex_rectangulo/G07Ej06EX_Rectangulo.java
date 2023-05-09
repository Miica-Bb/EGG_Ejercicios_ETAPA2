package g07ej06ex_rectangulo;

import java.util.Scanner;
import Entidad.Rectangulo;

public class G07Ej06EX_Rectangulo {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Indique la base del rectángulo");
        rectangulo1.lado1B = leer.nextDouble();
        System.out.println("Indique la altura del rectángulo");
        rectangulo1.lado2A = leer.nextDouble();
        
        double area = rectangulo1.calcularArea(rectangulo1);
        
        System.out.println("El área del rectángulo conformado es de " + area);
    }
}
