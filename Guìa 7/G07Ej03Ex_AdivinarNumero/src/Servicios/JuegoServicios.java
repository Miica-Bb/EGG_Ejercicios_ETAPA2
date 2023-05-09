package Servicios;

import Entidad.Juego;
import java.util.Scanner;

public class JuegoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Juego iniciarJuego(Juego adivinanza) {
        
        
        System.out.println("Juego de adivinanza");
        System.out.println("Indique el nombre del jugagor 1");
        adivinanza.jugadorUno = leer.next();
        System.out.println("Indique el nombre del jugador 2");
        adivinanza.jugadorDos = leer.next();
        
        return adivinanza;
    }
    
    public Juego jugar(Juego adivinanza) {
        short aux; //va a almacenar el valor que el jugador 2 cree que es el número que indicó el jugador 1
        
        System.out.println("JUGADOR 1: indique el número a adivinar (que sea dentro de un rango conocido por el jugador 2)");
        adivinanza.numero = leer.nextShort();
        System.out.println("Indique cuántos intentos tendrá el jugador 2 para adivinar el número");
        adivinanza.intentos = leer.nextShort();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        for (int i = 0; i < adivinanza.intentos; i++) {
            System.out.println("JUGADOR 2: ¿Qué número ingresó el jugador 1?");
            aux = leer.nextShort();
            
            if (aux == adivinanza.numero) {
                System.out.println("Felicidades! adivinaste el número");
                adivinanza.victoriaJugadorDos = (short) (adivinanza.victoriaJugadorDos + 1);
                break;
            } else {
                System.out.println("Número incorrecto, te quedan " + ((adivinanza.intentos - 1)  - i) + " intentos");
                System.out.println("");
                
                if (aux > adivinanza.numero) {
                    System.out.println("El número es más bajo");
                } else if (aux < adivinanza.numero) {
                    System.out.println("El número es más alto");
                }
                System.out.println("");
            }
            
            if (i == (adivinanza.intentos - 1)) {
                System.out.println("El jugador 2 no pudo adivinar el número");
                adivinanza.victoriaJugadorUno = (short) (adivinanza.victoriaJugadorUno + 1);
            } 
        }
        
        System.out.println(adivinanza.toString());
        
        return adivinanza;
    }
    
    public void JugarEnBucle() {
        Juego adivinanza = new Juego();
        String rejugar;
        iniciarJuego(adivinanza);
        
        do {
            jugar(adivinanza);

            System.out.println("Desean seguir jugando? (S/N)");
            rejugar = leer.next();
        } while (rejugar.equals("S") || rejugar.equals("s"));
    }
}
