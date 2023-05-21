package Servicios;

import java.util.Scanner;

public class JuegoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] guardarMesesDelAnio() {
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        return mes;        
    }
    
    public String preguntarMes() {
        System.out.println("Ingrese un mes (en minúsculas)");
        String mesIngresado = leer.next();
        
        return mesIngresado;
    }
    
    public void adivinarMes() {
        String[] mes = guardarMesesDelAnio();
        String mesSecreto = mes[(int)Math.floor(Math.random()*12)];
        boolean correcto = false;
        
        do {
            String mesIngresado = preguntarMes();
            
            for (int i = 0; i < mes.length; i++) {
                if (mesSecreto.equalsIgnoreCase(mesIngresado)) {
                    System.out.println("Adivinaste!");
                    correcto = true;
                    break;
                } else if (i == (mes.length - 1)) {
                    System.out.println("Incorrecto. Intentá nuevamente");
                    correcto = false;
                }
            }
        } while (correcto == false);
    }
}
