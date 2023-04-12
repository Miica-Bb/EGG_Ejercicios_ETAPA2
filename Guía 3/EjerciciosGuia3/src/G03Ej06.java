
import java.util.Scanner;


public class G03Ej06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = 0, num2 = 0;
        System.out.println("Este es un programa que realiza operaciones matemáticas");
        
        int opcion;
        String confirmacion = " ";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");

            opcion = leer.nextInt();
            int resultado;
            
            if (opcion != 5) {
                do {
                    System.out.println("Ingrese un número entero positivo");
                    num1 = leer.nextInt();
                    if (num1 < 1) {
                        System.out.println("El número ingresado no es correcto");
                    }
                } while (num1 <= 0);

                do {
                    System.out.println("Ingrese otro número entero positivo");
                    num2 = leer.nextInt();
                    if (num2 < 1) {
                        System.out.println("El número ingresado no es correcto");
                    }
                } while (num2 <= 0);
            }

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + resultado);
                    break;
                case 5:
                    System.out.println("Realmente quiere dejar el programa? (S/N)");
                    confirmacion = leer.next();
                    if (confirmacion.equals("S")) {
                        System.out.println("Hasta la próxima");
                        break;
                    } else {
                        System.out.println("Se mostrará nuevamente el menú");
                    }
            }
        } while (!"S".equals(confirmacion));

    }

}
