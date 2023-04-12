package manosalaobra4;

import java.util.Scanner;

public class ManosALaObra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double nota;
        System.out.println("Ingrese una nota numérica");
        nota = leer.nextDouble();
        
        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada debe estar entre 0 y 10");
            System.out.println("Ingrese nuevamente la nota");
            nota = leer.nextDouble();
        }
    }
    
}
