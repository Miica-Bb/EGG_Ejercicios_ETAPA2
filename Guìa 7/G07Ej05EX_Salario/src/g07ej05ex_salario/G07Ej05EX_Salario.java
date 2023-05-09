package g07ej05ex_salario;
import Servicios.EmpleadoServicios;
import Entidad.Empleado;

public class G07Ej05EX_Salario {

    public static void main(String[] args) {
        EmpleadoServicios metodosEmpleado = new EmpleadoServicios();
        
        Empleado a = metodosEmpleado.crearEmpleado();
        metodosEmpleado.aumentarSalario(a);
        System.out.println(a.toString());
        
        Empleado b = metodosEmpleado.crearEmpleado();
        metodosEmpleado.aumentarSalario(b);
        System.out.println(b.toString());
    }

}
