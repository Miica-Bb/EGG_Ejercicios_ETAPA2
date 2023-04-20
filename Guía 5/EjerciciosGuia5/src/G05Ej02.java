
import java.util.Scanner;

public class G05Ej02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[] nums = new int[20];
        int numAleatorio;
        
        for (int i = 0; i < 20; i++) {
            nums[i] = (int)(Math.floor(Math.random()*(10-1+1)+1));
        }
        
        /* 
        String mostrarVector = "";
        for(int a: nums) {
            mostrarVector += " " + a;
        }
        System.out.println(mostrarVector);
        */
        
        System.out.println("Se creó un vector de 20 números enteros dentro del rango del 1 al 10");
        System.out.println("Indique un número a buscar dentro de dicho vector");
        int numBuscar = leer.nextInt();
        
        int aux = 0;
        for (int i = 0; i < 20; i++) {
            if (nums[i] == numBuscar) {
                System.out.println("El número " + numBuscar + " se encuentra en la posición " + i);
                aux = aux + 1;
            }
            if ((i == 19) && (aux < 1)) {
                System.out.println("El número " + numBuscar + " no se encuentra en el vector");
            }
        }

    }
    
}
