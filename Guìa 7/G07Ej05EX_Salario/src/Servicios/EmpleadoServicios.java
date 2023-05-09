package Servicios;

import java.util.Scanner;
import Entidad.Empleado;

public class EmpleadoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Empleado crearEmpleado() {
        Empleado nuevo = new Empleado();
        
        System.out.println("Ingresar nombre del empleado");
        nuevo.setNombre(leer.next());
        System.out.println("Ingresar la edad del empleado");
        nuevo.setEdad(leer.nextByte());
        System.out.println("Ingresar el salario actual del empleado");
        nuevo.setSalario(leer.nextInt());
        
        return nuevo;
    }
    
    public double calcularAumento (Empleado nuevo) {
        //aumenta 10% para empleados mayores a 30 años
        //aumenta 5% para empleados menores a 30 años (incluido)
        double aumentoSalario = 0;
        
        if (nuevo.getEdad() <= 30) {
            aumentoSalario = (nuevo.getSalario() * 0.05);
        } else if (nuevo.getEdad() > 30) {
            aumentoSalario = (nuevo.getSalario() * 0.1);
        }
        
        return aumentoSalario;
    }
    
    public Empleado aumentarSalario (Empleado nuevo) {
        double aumento = calcularAumento(nuevo);
        
        nuevo.setSalario(nuevo.getSalario() + aumento);
        
        return nuevo;
    }
}
