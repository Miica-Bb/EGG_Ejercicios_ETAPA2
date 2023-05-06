package Servicios;

import java.util.Scanner;
import Entidades.CuentaBancaria;

public class CuentaBancariaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Le pediremos unos datos para poder crearle una cuenta bancaria");
        System.out.println("Ingrese su número de DNI");
        long dni = leer.nextInt();
        System.out.println("Creando número de cuenta.....");
        int numeroCuenta = 1079120468;
        System.out.println("Su número de cuenta es: " + numeroCuenta);
        
        return (new CuentaBancaria(numeroCuenta, dni, 0));
    }
    
    public CuentaBancaria ingresarEfectivo (CuentaBancaria nuevaCuenta) {
        System.out.println("Indique la cantidad de efectivo que ingresará a su cuenta");
        double saldoTotal = (leer.nextDouble()) + nuevaCuenta.getSaldoActual();
        nuevaCuenta.setSaldoActual(saldoTotal);
        
        return nuevaCuenta;
    } 
    
    public CuentaBancaria retirarEfectivo (CuentaBancaria nuevaCuenta) {
        System.out.println("Indique la cantidad de efectivo que retirará de su cuenta");
        double retiro = leer.nextDouble();
        
        if (nuevaCuenta.getSaldoActual() < retiro) {
            System.out.println("Su cuenta tiene menos efectivo que el solicitado. Retirará" + nuevaCuenta.getSaldoActual());
            nuevaCuenta.setSaldoActual(0);
            return nuevaCuenta;
        } else {
            System.out.println("retirará " + retiro);
            double saldoTotal = (nuevaCuenta.getSaldoActual()) - retiro;
            nuevaCuenta.setSaldoActual(saldoTotal);
            return nuevaCuenta;
        }
    }
    
    public CuentaBancaria extraccionRapida (CuentaBancaria nuevaCuenta) {
        System.out.println("Puede retirar hasta un 20% de su saldo actual");
        System.out.println("¿Cuánto efectivo desea retirar?");
        double retiro = leer.nextDouble();
        
        if (nuevaCuenta.getSaldoActual()*0.2 < retiro) {
            System.out.println("Superó el valor máximo permitido de extracción");
            System.out.println("Solo retirará " + (nuevaCuenta.getSaldoActual()*0.2));
            nuevaCuenta.setSaldoActual((nuevaCuenta.getSaldoActual()) - (nuevaCuenta.getSaldoActual()*0.2));
            return nuevaCuenta;
        } else {
            System.out.println("Retirará " + retiro);
            nuevaCuenta.setSaldoActual(nuevaCuenta.getSaldoActual() - retiro);
            return nuevaCuenta;
        }
    }
    
    public void consultarSaldo (CuentaBancaria nuevaCuenta) {
        System.out.println("Su saldo actual es de: $" + nuevaCuenta.getSaldoActual());
    }
    
    public void menu(CuentaBancaria nuevaCuenta) {
        int opcion = 0;
        
        do {
        System.out.println("SELECCIONE:");
        System.out.println("1. Ingresar efectivo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Retiro express");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos");
        System.out.println("6. salir");
        opcion = leer.nextInt();

        

            switch (opcion) {
                case 1:
                    ingresarEfectivo(nuevaCuenta);
                    continue;
                case 2:
                    retirarEfectivo(nuevaCuenta);
                    continue;
                case 3:
                    extraccionRapida(nuevaCuenta);
                    continue;
                case 4:
                    consultarSaldo(nuevaCuenta);
                    continue;
                case 5:
                    System.out.println(nuevaCuenta.toString());
                    continue;
                case 6:
                    System.out.println("Que tenga buen día");
            }
        } while (opcion > 0 && opcion < 6);
    }
    
}
