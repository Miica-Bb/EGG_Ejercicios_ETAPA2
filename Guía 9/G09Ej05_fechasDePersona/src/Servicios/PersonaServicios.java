package Servicios;

import Entidades.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        try {
            System.out.println("Indique su nombre");
            String nombre = leer.next();
            System.out.println("Indique su fecha de nacimiento (aaaa-mm-dd)");
            String nacimiento = leer.next();
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = format.parse(nacimiento);
            Persona nueva = new Persona(nombre, fechaNacimiento, 0);
            return nueva;
            
        } catch (ParseException ex) {
            System.out.println("No se pudo ingresar la fecha de nacimiento");
            return (new Persona());
        }
    }
    
    public Persona calcularEdad(Persona nueva) {
        int edad = 0;
        Date fechaNacimiento = nueva.getFechaNacimiento();
        Date fechaActual = new Date();
        
        if (fechaNacimiento.getMonth() < fechaActual.getMonth()) {
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
        } else if ((fechaNacimiento.getDay() <= fechaActual.getDay()) && (fechaNacimiento.getMonth() <= fechaActual.getMonth())) {
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
        } else {
            edad = fechaActual.getYear() - fechaNacimiento.getYear() - 1;
        }
        
        nueva.setEdad(edad);
        return nueva;
    }
    
    public boolean menorQue(Persona nueva, int edad) {
        return (nueva.getEdad() < edad);
    }
    
    public void mostrarPersona(Persona nueva) {
        System.out.println("Nombre: " + nueva.getNombre());
        System.out.println("Fecha de nacimiento: " + nueva.getFechaNacimiento() + " (" + nueva.getEdad() + " años)");
    }
    
}
