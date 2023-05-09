package g07ej04ex_cuenta;

import Entidad.Cuenta;
import Servicios.CuentaServicios;

public class G07Ej04Ex_Cuenta {

    public static void main(String[] args) {
        CuentaServicios metodosCuenta = new CuentaServicios();
        Cuenta usuario = metodosCuenta.crearCuenta();
        
        metodosCuenta.retirarDinero(usuario);
    }

}
