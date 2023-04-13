
import java.util.Scanner;

public class G03Ej07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto, en lo posible que respete el siguiente formato:");
        System.out.println("*5 caracteres de largo");
        System.out.println("*El primer caracter debe ser una 'X'");
        System.out.println("*El último caracter debe ser una 'O'");
        System.out.println("PARA FINALIZAR EL ENVÍO DE FRASES INGRESAR '&&&&&'");
        
        boolean stop, correcto;
        int contadorCorrecto = 0, contadorIncorrecto = 0;
        
        do {
            
            String frase = leer.nextLine();
            stop = frase.equals("&&&&&");
            correcto = ((frase.length() == 5) && (frase.substring(4, 5).equals("O")) && (frase.substring(0, 1).equals("X")));
            
            if (stop) {
                break;
            } else if (correcto) {
                contadorCorrecto = contadorCorrecto + 1;
            } else {
                contadorIncorrecto = contadorIncorrecto + 1;
            }
                 
        } while (!stop);
        
        System.out.println("Ingresos correctos: " + contadorCorrecto);
        System.out.println("Ingresos incorrectos; " + contadorIncorrecto);
        
    }
    
}
