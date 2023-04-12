package manosalaobra3;

import java.util.Scanner;

public class ManosALaObra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tipoMotor;

        System.out.println("Ingrese un valor entre 1 y 4 y se dirá a qué bomba corresponde");
        tipoMotor = leer.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;

            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;

            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;

            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }

}
