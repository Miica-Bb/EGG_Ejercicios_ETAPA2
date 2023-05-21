package g09ej05_fechasdepersona;

import Servicios.PersonaServicios;
import Entidades.Persona;

public class G09Ej05_fechasDePersona {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        Persona nueva = ps.crearPersona();
        int edad = 30;
        
        ps.calcularEdad(nueva);
        ps.mostrarPersona(nueva);
        System.out.println("tiene menos de " + edad + " años? " + ps.menorQue(nueva, edad));
        
    }

}
