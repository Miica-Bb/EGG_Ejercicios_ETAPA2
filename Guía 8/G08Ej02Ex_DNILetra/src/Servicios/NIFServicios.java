package Servicios;

import Entidad.NIF;
import java.util.Scanner;

public class NIFServicios {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNIF() {
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();
        
        int resto = dni % 23;
        
        return (new NIF(dni, letra[resto]));
    }
    
    public void mostrar(NIF nuevo) {
        System.out.println(nuevo.getNumeroDNI() + "-" + nuevo.getLetra());
    }
}
