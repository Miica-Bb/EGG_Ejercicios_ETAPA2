package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera() {    
        System.out.println("ingrese la capacidad máxima de la cafetera (ml)");
        int capMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera (ml)");
        int cantActual = leer.nextInt();
        
        return (new Cafetera(capMax, cantActual));
    }
    
    public Cafetera llenarCafetera (Cafetera nuevaCaf) {
        nuevaCaf.setCantidadActual(nuevaCaf.getCapacidadMaxima());
        return nuevaCaf;
    }
    
    public Cafetera servirTaza (Cafetera nuevaCaf) {
        System.out.println("Indicar el tamaño de la taza a servir (ml)");
        int tamTaza = leer.nextInt();
        
        if ((tamTaza > (nuevaCaf.getCantidadActual())) && (nuevaCaf.getCantidadActual() > 0)) {
            System.out.println("No alcanza la cantidad de café actual para llenar esa taza");
            System.out.println("Se puede llenar " + (nuevaCaf.getCantidadActual()) + "ml de la taza indicada");
        } else if (((nuevaCaf.getCantidadActual()) == 0) && ((tamTaza > (nuevaCaf.getCantidadActual())))) {
            System.out.println("La cafetera está vacía");
        } else {
            nuevaCaf.setCantidadActual(nuevaCaf.getCantidadActual() - tamTaza);
            System.out.println("La taza se llenó completamente");
            System.out.println("En la cafetera queda " + (nuevaCaf.getCantidadActual()) + "ml de café");
        }
        return nuevaCaf;
    }
    
    public Cafetera vaciarCafetera (Cafetera nuevaCaf) {
        nuevaCaf.setCantidadActual(0);
        return nuevaCaf;
    }
    
    public Cafetera agregarCafe (Cafetera nuevaCaf) {
        System.out.println("¿Cuánto café desea agregar? (ml)");
        int agregar = leer.nextInt();
        int resto = (nuevaCaf.getCapacidadMaxima()) - (nuevaCaf.getCantidadActual());
        int sobra = 0;
        
        if (agregar > resto) {
            System.out.println("La cantidad ingresada sobrepasa la capacidad máxima");
            System.out.println("Solo podrá agregar " + resto + "ml");
            
        } else if (agregar <= resto) {
            System.out.println("Agregando café...");
            nuevaCaf.setCantidadActual((nuevaCaf.getCantidadActual()) + agregar);
            sobra = (nuevaCaf.getCapacidadMaxima()) - (nuevaCaf.getCantidadActual());
            System.out.println("Espacio restante en la cafetera: " + sobra + "ml");
        }
        return nuevaCaf;
    }
    
}
