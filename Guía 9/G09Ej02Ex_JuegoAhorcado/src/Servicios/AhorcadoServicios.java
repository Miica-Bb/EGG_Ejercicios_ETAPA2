package Servicios;

import java.util.Scanner;
import Entidades.Ahorcado;
import java.util.Arrays;

public class AhorcadoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego() {
        System.out.print("Ingrese la palabra a adivinar: ");
        String palabraIngresada = leer.next();
        System.out.print("Ingrese la cantidad de intentos que se tendrá para adivinarla: ");
        int intentos = leer.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        String[] palabraAdivinar = new String[palabraIngresada.length()];
        String[] avance = new String[palabraIngresada.length()];
        String[] letrasUsadas = new String[palabraIngresada.length() + intentos];
        
        for (int i = 0; i < palabraAdivinar.length; i++) {
            palabraAdivinar[i] = palabraIngresada.substring(i, i+1);
            avance[i] = "_";
        }
        
        Arrays.fill(letrasUsadas, "");
        
        return (new Ahorcado(palabraAdivinar, avance, letrasUsadas, 0, intentos));
    }
    
    public void mostrarLongitud(Ahorcado juego) {
        System.out.println("__________________________________________________");
        System.out.println("La palabra tiene " + juego.getPalabra().length + " letras");
    }
    
    public void mostrarIntentosRestantes(Ahorcado juego) {
        System.out.println("Te quedan " + juego.getIntentosPosibles() + " intentos para adivinar");
        System.out.println("__________________________________________________");
        System.out.println(" ");
    }
    
    public String preguntarLetra(Ahorcado juego) {
        String[] letrasUsadas = juego.getLetrasUsadas();
        boolean usada = false;
        String letra;
        
        do {
            System.out.print("Ingrese una letra: ");
            letra = leer.next();
            
            for (int i = 0; i < letrasUsadas.length; i++) {
                if (letra.equalsIgnoreCase(letrasUsadas[i])) {
                    System.out.println("Letra repetida, ingresá otra");
                    break;
                } else if ("".equals(letrasUsadas[i])) {
                    letrasUsadas[i] = letra;
                    juego.setLetrasUsadas(letrasUsadas);
                    usada = true;
                    break;
                }
            }
        } while (usada == false);
        
        
        return letra;
    }
    
    public void buscarLetra(Ahorcado juego) {
        String[] palabra = juego.getPalabra();
        String letra = preguntarLetra(juego);
        
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                System.out.println("La letra '" + letra + "' se encuentra en la palabra");
                infoAvance(juego, letra);
                encontradas(juego, letra);
                break;
            } else if (i == palabra.length - 1) {
                System.out.println("La letra '" + letra + "' NO se encuentra en la palabra");
                infoAvance(juego, letra);
                encontradas(juego, letra);
                juego.setIntentosPosibles(juego.getIntentosPosibles() - 1);
            }
        }
    }
    
    public void encontradas(Ahorcado juego, String letra) {
        String[] palabra = juego.getPalabra();
        int contadorEncontradas = juego.getLetrasEncontradas();
        int contadorRestantes = juego.getPalabra().length;
        
        for (String indice : palabra) {
            if (indice.equalsIgnoreCase(letra)) {
                contadorEncontradas++;
                juego.setLetrasEncontradas(contadorEncontradas);
            }
        }
        
        contadorRestantes -= contadorEncontradas;
        System.out.println("Letras encontradas: " + contadorEncontradas + "; letras restantes: " + contadorRestantes);
        System.out.println("");
    }
    
    public void infoAvance(Ahorcado juego1, String letra) {
        String[] avance = juego1.getAvance();
        String[] palabra = juego1.getPalabra();
        
        for (int i = 0; i < avance.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                avance[i] = letra;
                juego1.setAvance(avance);
            }
            System.out.print(avance[i] + " ");
        }
        System.out.println("");
        
    }
    
    public void jugar() {
        Ahorcado juego1 = crearJuego();
        boolean terminado = false;
        String[] palabra = juego1.getPalabra();
        
        do {
            mostrarLongitud(juego1);
            mostrarIntentosRestantes(juego1);
            buscarLetra(juego1);
            
            if (juego1.getIntentosPosibles() < 1) {
                System.out.println("GAME OVER. Suerte a la próxima");
                System.out.print("La palabra era ");
                
                for (String palabra1 : palabra) {
                    System.out.print(palabra1);
                }
                System.out.println("");
                terminado = true;
            }
            
            if (juego1.getLetrasEncontradas() == juego1.getPalabra().length) {
                System.out.println("FELICITACIONES. Adivinaste la palabra");
                terminado = true;
            }
        } while (terminado == false);
    }
}
