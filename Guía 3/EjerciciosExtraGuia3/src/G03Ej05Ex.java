
import java.util.Scanner;

public class G03Ej05Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String socio;
        
        
        do {
            System.out.println("Ingrese la clase de socio (A/B/C)");
            socio = leer.next().toUpperCase();
            if ((!"A".equals(socio)) && (!"B".equals(socio)) && (!"C".equals(socio))) {
                System.out.println("Ingreso incorrecto. Pruebe nuevamente");
            }
        } while ((!"A".equals(socio)) && (!"B".equals(socio)) && (!"C".equals(socio)));
        
        
        System.out.println("Ingrese el costo del tratamiento");
        double costoTratamiento = leer.nextDouble();
        double importeAPagar = 0;
        
        switch (socio) {
            case "A":
                importeAPagar = costoTratamiento - (costoTratamiento * 0.5);  //tienen 50% de descuento
                break;
            case "B":
                importeAPagar = costoTratamiento - (costoTratamiento * 0.35);  //tienen 35% de descuento
                break;
            case "C":
                importeAPagar = costoTratamiento;   //no tienen descuento
                break;
        }
        
        System.out.println("El valor a pagar será de: $" + importeAPagar);
        
    }
    
}
