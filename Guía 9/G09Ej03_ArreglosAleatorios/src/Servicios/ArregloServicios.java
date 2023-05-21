package Servicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArregloServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void inicializarA(double[] vectorA) {
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Math.random() * 20 + 1;
        }

    }
    
    public void mostrar(double[] vector) {
        for (double i: vector) {
            System.out.println(i + " ");
        }
        System.out.println("");
    }
    
    public void ordenar(double[] vector) {
        Arrays.sort(vector);
        int aux = vector.length - 1;
        double[] vectorAux = new double[vector.length];
        
        System.arraycopy(vector, 0, vectorAux, 0, vector.length);
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vectorAux[aux];
            aux--;
        }
    }
    
    public void inicializarB (double[] vectorB, double[] vectorA) {
        for (int i = 0; i < vectorB.length; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            } else {
                Arrays.fill(vectorB, 10, 20, 0.5);
                break;
            }
        }
    }
    
    public void menu(double[] vectorA, double[] vectorB) {
        int opcion = 0;
        int vector = 0;
        do {
            System.out.println("Hay un vector A de 50 números y un vector B de 20 números (en ambos casos, números reales)");
            System.out.println("1. inicializar A (con números aleatorios)");
            System.out.println("2. inicializar B (primeros 10 números igaules a A, el resto igual a 0.5");
            System.out.println("3. ordenar vector (en orden descendente)");
            System.out.println("4. mostrar vector");
            System.out.println("5. salir");
            opcion = leer.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    inicializarA(vectorA);
                    continue;
                case 2:
                    inicializarB(vectorB, vectorA);
                    continue;
                case 3:
                    System.out.println("Qué vector desea ordenar? (1 para el A; 2 para el B)");
                    vector = leer.nextInt();
                    
                    switch (vector) {
                        case 1:
                            ordenar(vectorA);
                            continue;
                        case 2:
                            ordenar(vectorB);
                    }
                    
                    continue;
                case 4:
                    System.out.println("Qué vector desea mostrar? (1 para el A; 2 para el B)");
                    vector = leer.nextInt();
                    
                    switch (vector) {
                        case 1:
                            mostrar(vectorA);
                            continue;
                        case 2:
                            mostrar(vectorB);
                    }
                    
                    continue;
                case 5:
                    System.out.println("programa finalizado");
            }
        } while (opcion < 5 && opcion > 0);
    }
}
