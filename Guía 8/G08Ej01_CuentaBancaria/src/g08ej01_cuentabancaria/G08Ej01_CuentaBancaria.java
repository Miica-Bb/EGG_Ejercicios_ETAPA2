package g08ej01_cuentabancaria;

import Servicios.CuentaBancariaServicios;
import Entidades.CuentaBancaria;

public class G08Ej01_CuentaBancaria {

    public static void main(String[] args) {
        CuentaBancariaServicios metodosCB = new CuentaBancariaServicios();
        CuentaBancaria nuevaCuenta = metodosCB.crearCuentaBancaria();
        
        metodosCB.menu(nuevaCuenta);
    }
}
