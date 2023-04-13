
import java.util.Scanner;


public class G03Ej01Ex {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
       
        int dias = minutos / 1440;      //hay 1440mins en un día
        int horas = (minutos - dias * 1440) / 60;       //hay 60mins en una hora
        
        
        if (dias == 1) {
            System.out.println("Los minutos ingresados equivalen a:");
            System.out.print(dias + " día y ");
            System.out.println(horas + " horas");
        } else {
            System.out.println("Los minutos ingresados equivalen a:");
            System.out.print(dias + " días y ");
            System.out.println(horas + " horas");
        }
        
    }
    
}
