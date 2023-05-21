package Entidades;

import java.util.Arrays;

public class Ahorcado {
    private String[] palabra, avance, letrasUsadas;
    private int letrasEncontradas;
    private int intentosPosibles;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] avance, String[] letrasUsadas, int letrasEncontradas, int intentosPosibles) {
        this.palabra = palabra;
        this.avance = avance;
        this.letrasUsadas = letrasUsadas;
        this.letrasEncontradas = letrasEncontradas;
        this.intentosPosibles = intentosPosibles;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getAvance() {
        return avance;
    }

    public void setAvance(String[] avance) {
        this.avance = avance;
    }

    public String[] getLetrasUsadas() {
        return letrasUsadas;
    }

    public void setLetrasUsadas(String[] letrasUsadas) {
        this.letrasUsadas = letrasUsadas;
    }
    
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosPosibles() {
        return intentosPosibles;
    }

    public void setIntentosPosibles(int intentosPosibles) {
        this.intentosPosibles = intentosPosibles;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", avance=" + avance + ", letrasUsadas=" + letrasUsadas + ", letrasEncontradas=" + letrasEncontradas + ", intentosPosibles=" + intentosPosibles + '}';
    }
}
