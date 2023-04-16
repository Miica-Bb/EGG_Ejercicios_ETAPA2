
import java.util.Scanner;

public class G04Ej03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Este programa es un conversor de euros a otras monedas");
        System.out.println("Ingrese cantidad de euros a convertir");
        double euros = leer.nextDouble();
        
        System.out.println("Ingrese la moneda a la que convertirá, siendo las opciones dolar, libra o yen (omita tildes)");
        String moneda = leer.next().toLowerCase();
        
        conversorMoneda(euros, moneda);
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void conversorMoneda (double euros, String moneda) {
        double conversion;
        
        switch (moneda) {
            case "dolar":
            case "dolares":
                conversion = euros * 1.28611;
                System.out.println(euros + "€ = " + conversion + " " + moneda);
                break;
            case "libra":
            case "libras":    
                conversion = euros * 0.86;
                System.out.println(euros + "€ = " + conversion + " " + moneda);
                break;
            case "yen":
            case "yenes":
                conversion = euros * 129.852;
                System.out.println(euros + "€ = " + conversion + " " + moneda);
                break;
            default:
                System.out.println("Ingreso incorrecto. Reinicie el programa");
        }
        
    }
    
}
