package manosalaobra12;

import Servicio.PersonaServicio;
import Entidad.Persona;

public class ManosALaObra12 {

    public static void main(String[] args) {
        PersonaServicio metodosPersona = new PersonaServicio();
        Persona unicoIndividuo = metodosPersona.crearPersona();
        
        metodosPersona.mostrarAtributos(unicoIndividuo);
    }

}
