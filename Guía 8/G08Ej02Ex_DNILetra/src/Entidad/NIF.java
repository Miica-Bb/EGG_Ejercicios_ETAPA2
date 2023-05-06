package Entidad;

public class NIF {
    private long numeroDNI;
    private char letra;

    public NIF() {
    }

    public NIF(long numeroDNI, char letra) {
        this.numeroDNI = numeroDNI;
        this.letra = letra;
    }

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
}
