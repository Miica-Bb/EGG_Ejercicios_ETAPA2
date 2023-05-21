package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int longitudFrase = frase.length();
        
        Cadena c1 = new Cadena(frase);
        c1.setLongitud(longitudFrase);
        
        return c1;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void mostrarFrase(Cadena nueva) {
        System.out.println("Frase ingresada: ");
        
        for (int i = 0; i < nueva.getLongitud(); i++) {
            System.out.print(nueva.getFrase().charAt(i));
        }
        
        System.out.println("");
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void mostrarVocales(Cadena nueva) {
        int contador = 0;
        
        for (int i = 0; i < nueva.getLongitud(); i++) {
            if ((nueva.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) || (nueva.getFrase().substring(i, i + 1).equalsIgnoreCase("e"))
               || (nueva.getFrase().substring(i, i + 1).equalsIgnoreCase("i")) || (nueva.getFrase().substring(i, i + 1).equalsIgnoreCase("o")) 
               || (nueva.getFrase().substring(i, i + 1).equalsIgnoreCase("u"))) {
                
                contador++;
            }
        }
        
        System.out.println("La frase ingresada tiene " + contador + " vocales" + "\n");
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void invertirFrase(Cadena nueva) {
        System.out.println("Frase invertida: ");
        
        for (int i = (nueva.getLongitud() - 1); i >= 0; i--) {
            System.out.print(nueva.getFrase().charAt(i));
        }
        
        System.out.println("");
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void vecesRepetido(Cadena nueva) {
        String letra = String.valueOf(pedirCaracter());
        int contador = 0;
        
        for (int i = 0; i < nueva.getLongitud(); i++) {
            
            if (nueva.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        
        if (contador == 1) {
            System.out.println("El caracter '" + letra + "' se repite " + contador + " vez");
        } else {
            System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
        }   
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public char pedirCaracter() {
        System.out.println("Ingrese un caracter");
        String letra = leer.next();
        
        return letra.charAt(0);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void unirFrases(String frase2, Cadena nueva) {
        String fraseNueva = nueva.getFrase().concat(" ").concat(frase2);
        System.out.println(fraseNueva);
        
        System.out.println("Desea reemplazar la frase original con esta? (S/N)");
        String confirmaNuevaFrase = leer.next();
        
        if (confirmaNuevaFrase.equalsIgnoreCase("S")) {
            nueva.setFrase(fraseNueva);
            nueva.setLongitud(fraseNueva.length());
        }
    }
    
    public void pedirNuevaFrase(Cadena nueva) {
        System.out.println("Ingrese una nueva frase, se unirá a la anterior");
        String frase2 = leer.next();
        unirFrases(frase2, nueva);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void reemplazar(Cadena nueva) {
        char letra = pedirCaracter();
        
        System.out.println(nueva.getFrase().replace('a', letra));
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void contiene(Cadena nueva) {
        String letra = String.valueOf(pedirCaracter());
        boolean condicion = nueva.getFrase().contains(letra);
        
        System.out.println(condicion);
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void menu(Cadena nueva) {
        int opcion = 0;
        
        do {
            System.out.println("1. Mostrar frase");
            System.out.println("2. Mostrar frase invertida");
            System.out.println("3. Mostrar cantidad de vocales que contiene");
            System.out.println("4. Muestra 'true' o 'false' si contiene un caracter específico");
            System.out.println("5. Mostrar cantidad de veces que contiene un caracter específico");
            System.out.println("6. Mostrar la frase con sus caracteres 'a' reemplazados por un caracter específico");
            System.out.println("7. Añadir otra frase continuando la primer frase");
            System.out.println("8. salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarFrase(nueva);
                    System.out.println("\n");
                    continue;
                case 2:
                    invertirFrase(nueva);
                    System.out.println("\n");
                    continue;
                case 3:
                    mostrarVocales(nueva);
                    System.out.println("\n");
                    continue;
                case 4:
                    contiene(nueva);
                    System.out.println("\n");
                    continue;
                case 5:
                    vecesRepetido(nueva);
                    System.out.println("\n");
                    continue;
                case 6:
                    reemplazar(nueva);
                    System.out.println("\n");
                    continue;
                case 7:
                    pedirNuevaFrase(nueva);
                    System.out.println("\n");
                    continue;
                case 8:
                    System.out.println("Hasta la próxima");
                default:
                    System.out.println("Programa finalizado");
            }
        } while (opcion < 8 && opcion > 0);
        
    }
}
