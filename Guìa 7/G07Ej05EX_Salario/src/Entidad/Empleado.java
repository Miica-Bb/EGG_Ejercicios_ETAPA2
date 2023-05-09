package Entidad;

public class Empleado {
    private String nombre;
    private byte edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, byte edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + "nombre = " + nombre + ", edad = " + edad + ", salario = " + salario + "\n\n\n";
    }
    
    
}
