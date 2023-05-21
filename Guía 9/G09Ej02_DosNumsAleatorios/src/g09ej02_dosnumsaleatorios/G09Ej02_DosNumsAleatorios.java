package g09ej02_dosnumsaleatorios;

import Servicios.ParDeNumerosServicios;
import Entidades.ParDeNumeros;

public class G09Ej02_DosNumsAleatorios {

    public static void main(String[] args) {
        ParDeNumerosServicios metodosNums = new ParDeNumerosServicios();
        ParDeNumeros nums = new ParDeNumeros();
        
        metodosNums.mostrarValores(nums);
        System.out.println("");
        System.out.println("Mayor número: " + metodosNums.devolverMayor(nums));
        System.out.println("Menor número: " + metodosNums.devolverMenor(nums));
        System.out.println("");
        System.out.println("Mayor elevado a la potencia del menor: " + metodosNums.calcularPotencia(nums));
        System.out.println("Raíz cuadrada del menor: " + metodosNums.calcularRaiz(nums));
    }

}
