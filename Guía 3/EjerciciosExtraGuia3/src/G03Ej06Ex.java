
import java.util.Scanner;

public class G03Ej06Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Este programa compara estaturas de personas");
        System.out.println("Ingrese cuántas personas se van a comparar");
        int personas = leer.nextInt(), contador = 0;
        double estaturaIngresada, promedioEstaturas = 0.0, debajoMedia = 0.0, estaturaMedia = 1.60;
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura (en metros) número " + (i+1));
            estaturaIngresada = leer.nextDouble();
            
            promedioEstaturas = promedioEstaturas + estaturaIngresada;
            
            if (estaturaIngresada < estaturaMedia) {
                debajoMedia = debajoMedia + estaturaIngresada;
                contador = contador + 1;                                         //para saber cuántos están por debajo así después se saca el promedio
            }
            
            if (i == personas - 1) {
                promedioEstaturas = promedioEstaturas / personas;
                debajoMedia = debajoMedia / contador;
            }
            
        }
        
        System.out.println("Teniendo en cuenta que se promediaban " + personas + " alturas:");
        System.out.println("El promedio general de estaturas es de: " + promedioEstaturas + " metros");
        System.out.println("Hubieron " + contador + " alturas por debajo de la media (" + estaturaMedia + "mts), siendo el promedio de éstas " + debajoMedia + " metros");
        
    }
    
}
