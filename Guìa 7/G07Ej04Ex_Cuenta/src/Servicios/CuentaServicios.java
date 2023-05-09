package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta() {
        System.out.println("Ingrese el nombre del titular de la cuenta");
        String titular = leer.next();
        System.out.println("Ingrese la cantidad de efectivo que posee la cuenta");
        double efectivo = leer.nextDouble();
        
        return (new Cuenta(titular, efectivo));
    }
    
    public void retirarDinero(Cuenta usuario) {
        System.out.println(usuario.toString());
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        double retiro = leer.nextDouble();
        
        if (retiro <= usuario.getSaldo()) {
            usuario.setSaldo((usuario.getSaldo()) - retiro);
            System.out.println("Retiro exitoso");
            System.out.println("Saldo actual: $" + usuario.getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Ingrese otro monto menor");
            System.out.println("En la cuenta quedan $" + usuario.getSaldo());
        }
        
        repetirExtraccion(usuario);
    }
    
    public void repetirExtraccion (Cuenta usuario) {
        System.out.println("Desea realizar otra extracción? (S/N)");
        String respuesta = leer.next();
        
        if ((respuesta.equals("S")) || (respuesta.equals("s"))) {
            retirarDinero(usuario);
        } else {
            System.out.println("Operación finalizada");
        }
    }
}
