package g08ej01ex_ecuacion2grado;

import java.util.Scanner;
import Entidad.Raices;
import Servicios.RaicesServicios;

public class G08Ej01EX_Ecuacion2Grado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RaicesServicios metodosRaiz = new RaicesServicios();
        
        System.out.println("Indique el valor de a (entero)");
        int a = leer.nextInt();
        System.out.println("Indique el valor de b (entero)");
        int b = leer.nextInt();
        System.out.println("Indique el valor de c (entero)");
        int c = leer.nextInt();
        
        Raices ejercicio = new Raices(a, b, c);
        
        metodosRaiz.calcular((metodosRaiz.getDiscriminante(ejercicio)), ejercicio);
    }

}
