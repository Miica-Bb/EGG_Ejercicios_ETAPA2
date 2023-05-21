package Entidades;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + ", edad = " + edad + " años";
    }

    

    
}
