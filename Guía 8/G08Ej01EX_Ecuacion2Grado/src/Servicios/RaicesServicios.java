package Servicios;

import Entidad.Raices;
import static java.lang.Math.sqrt;

public class RaicesServicios {
    public double getDiscriminante(Raices nueva) {
        double discriminante = ((Math.pow(nueva.b, 2)) - 4 * nueva.a * nueva.c);
        return discriminante;
    }
    
    public boolean tieneRaices(double discriminante) {
        //si es true tiene dos soluciones
        return discriminante > 0;
    }
    
    public boolean tieneRaiz(double discriminante) {
        //si es true tiene una única solución
        return discriminante == 0;
    }
    
    public void obtenerRaices(double discriminante, Raices nueva) {
        double resultadoA = 0, resultadoB = 0;
        
        if (tieneRaices(discriminante)) {
            resultadoA = ((-(nueva.b) + (sqrt(discriminante))) / (2 * nueva.a));
            resultadoB = ((-(nueva.b) - (sqrt(discriminante))) / (2 * nueva.a));
            
            System.out.println("Solución 1: " + resultadoA);
            System.out.println("Solución 2: " + resultadoB);
        } else {
            System.out.println("Para los valores ingresados, la ecuación tiene 1 solo valor posible o ninguno");
        } 
    }
    
    public void obtenerRaiz(double discriminante, Raices nueva) {
        double resultado = 0;
        
        if (tieneRaiz(discriminante)) {
            resultado = ((-(nueva.b) + (sqrt(discriminante))) / 2 * nueva.a);
            System.out.println("La solución es: " + resultado);
        } else {
            System.out.println("Esta cuenta no tiene solución");
        }
    }
    
    public void calcular(double discriminante, Raices nueva) {
        if (tieneRaices(discriminante)) {
            obtenerRaices(discriminante, nueva);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(discriminante, nueva);
        } else {
            System.out.println("SIN SOLUCIÓN");
        }
    }
}
