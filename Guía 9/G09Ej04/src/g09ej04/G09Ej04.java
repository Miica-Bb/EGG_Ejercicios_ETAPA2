package g09ej04;

import Servicios.FechaServicios;
import java.util.Date;

public class G09Ej04 {

    public static void main(String[] args) {
        FechaServicios fs = new FechaServicios();
        
        Date nacimiento = fs.fechaNacimiento();
        Date actual = fs.fechaActual();
        int diferencia = fs.diferencia(actual, nacimiento);
        
        System.out.println(nacimiento);
        System.out.println(actual);
        System.out.println("Hay " + diferencia + " años de diferencia");
        
//        if (actual.getMonth() <= nacimiento.getMonth()) {
//           System.out.println("Usted tiene " + (diferencia - 1) + " años."); 
//        } else {
//            System.out.println("Usted tiene " + diferencia + " años.");
//        }
        
    }

}
