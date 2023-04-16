
import java.util.Scanner;

public class G03Ej08Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("A continuación se pedirá que ingrese números enteros positivos");
        int num, cantPares = 0, cantImpares = 0, cantLeidos = 0;
        boolean stop;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            while (num < 1) {
                System.out.println("Ingreso incorrecto. Ingrese un número entero y positivo");
                num = leer.nextInt();
            }
            
            if (num%2 == 0) {
                cantPares = cantPares + 1;
            } else if (num%2 == 1) {
                cantImpares = cantImpares + 1;
            }
            
            cantLeidos = cantLeidos + 1;
            stop = (num%5 == 0); 
        } while (stop == false);
        
        System.out.println("El ingreso se detenía al ingresar un múltiplo de 5 (en este caso, " + num + ")");
        System.out.println("cantidad de números leidos: " + cantLeidos);
        System.out.println("Cantidad de números pares ingresados: " + cantPares);
        System.out.println("Cantidad de números impares ingresados: " + cantImpares);
        
    }
    
}
