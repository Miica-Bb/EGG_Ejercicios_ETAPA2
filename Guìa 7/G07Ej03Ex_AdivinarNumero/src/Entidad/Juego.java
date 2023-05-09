package Entidad;

public class Juego {
    public String jugadorUno, jugadorDos;
    public short intentos, numero, victoriaJugadorUno, victoriaJugadorDos;

    public Juego() {
    }

    public Juego(String jugadorUno, String jugadorDos, short intentos, short numero, short victoriaJugadorUno, short victoriaJugadorDos) {
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        this.intentos = intentos;
        this.numero = numero;
        this.victoriaJugadorUno = victoriaJugadorUno;
        this.victoriaJugadorDos = victoriaJugadorDos;
    }

    @Override
    public String toString() {
        return "jugadorUno = " + jugadorUno + ", jugadorDos = " + jugadorDos + ", intentos = " + intentos + ", numero = " + numero + ", victoriaJugadorUno = " + victoriaJugadorUno + ", victoriaJugadorDos = " + victoriaJugadorDos;
    }
    
    
}
