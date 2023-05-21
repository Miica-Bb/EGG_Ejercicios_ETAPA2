package g09ej03_arreglosaleatorios;

import Servicios.ArregloServicios;

public class G09Ej03_ArreglosAleatorios {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        
        ArregloServicios as = new ArregloServicios();
        
        as.menu(A, B);
        
//        as.inicializarA(A);
//        as.mostrar(A);
//        System.out.println("");
//        as.ordenar(A);
//        as.mostrar(A);
//        as.inicializarB(B, A);
    }

}
