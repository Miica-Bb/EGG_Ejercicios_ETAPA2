package Servicio;

import Entidad.Persona;

public class PersonaServicio {
    public Persona crearPersona() {
        Persona individuo = new Persona();
        return individuo;
    }
    
    public void mostrarAtributos (Persona creacion) {
        System.out.println("Se mostrarán los atributos de la pernosa creada");
        System.out.println("Nombre: " + creacion.getNombre());
        System.out.println("Edad: " + creacion.getEdad() + " años");
    }
}
