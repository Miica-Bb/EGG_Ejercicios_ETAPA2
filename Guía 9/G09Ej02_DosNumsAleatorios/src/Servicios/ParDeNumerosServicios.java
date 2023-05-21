package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicios {
    public void mostrarValores(ParDeNumeros nums) {
        System.out.println("Número 1: " + nums.getNum1());
        System.out.println("Número 2: " + nums.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros nums) {
        double mayor = Math.max(nums.getNum1(), nums.getNum2());
        return mayor;
    }
    
    public double devolverMenor(ParDeNumeros nums) {
        double menor = Math.min(nums.getNum1(), nums.getNum2());
        return menor;
    }
    
    public double calcularPotencia(ParDeNumeros nums) {
        long mayor = Math.round(devolverMayor(nums));
        long menor = Math.round(devolverMenor(nums));
        
        double potencia = Math.pow(mayor, menor);
        return potencia;
    }
    
    public double calcularRaiz(ParDeNumeros nums) {
        double menor = Math.abs(devolverMenor(nums));
        
        double raiz = Math.sqrt(menor);
        return raiz;
    }
}
