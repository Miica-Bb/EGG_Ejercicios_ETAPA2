package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        public Date fechaNacimiento() {
            System.out.println("Sobre su nacimiento:");
            System.out.println("indique el día (dd):");
            int dia = leer.nextInt();
            System.out.println("indique el mes (mm):");
            int mes = leer.nextInt();
            System.out.println("indique el año (aaaa):");
            int anio = leer.nextInt();
            
            Date nacimiento = new Date(anio - 1900, mes, dia);
            return nacimiento;
        }
        
        public Date fechaActual() {
            Date actual = new Date();
            return actual;
        }
        
        public int diferencia(Date actual, Date nacimiento) {
            int difAnios = (actual.getYear() + 1900) - (nacimiento.getYear() + 1900);
            return difAnios;
        }
}
