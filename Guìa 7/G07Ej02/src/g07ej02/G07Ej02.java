package g07ej02;

import g07ej02.Entidad.Circunferencia;
import java.util.Scanner;

public class G07Ej02 {

    public static void main(String[] args) {
        crearCircunferencia();
    }
    
    ///////////////////////////////////////////pedir datos
    
    public static void crearCircunferencia () {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio. Se creará circunferencia a partir de él");
        
        Circunferencia uno = new Circunferencia(leer.nextFloat());
        System.out.println("área: " + uno.calcularArea());
        System.out.println("perímetro" + uno.calcularPerimetro());
    }
}
