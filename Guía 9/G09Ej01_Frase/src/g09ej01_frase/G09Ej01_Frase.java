package g09ej01_frase;

import Entidades.Cadena;
import Servicios.CadenaServicios;

public class G09Ej01_Frase {

    public static void main(String[] args) {
        CadenaServicios cs = new CadenaServicios();
        
        System.out.println("Este programa le pedirá una frase y realizará distintas cosas sobre ella \n");
        Cadena nueva = cs.crearCadena();
        
        System.out.println(nueva.toString() + "\n");
        cs.menu(nueva);
    }

}
