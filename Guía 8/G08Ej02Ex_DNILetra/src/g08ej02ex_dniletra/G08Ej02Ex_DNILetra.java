package g08ej02ex_dniletra;

import Servicios.NIFServicios;
import Entidad.NIF;

public class G08Ej02Ex_DNILetra {

    public static void main(String[] args) {
        NIFServicios metodosNIF = new NIFServicios();
        NIF nuevo = metodosNIF.crearNIF();
        
        metodosNIF.mostrar(nuevo);
    }

}
