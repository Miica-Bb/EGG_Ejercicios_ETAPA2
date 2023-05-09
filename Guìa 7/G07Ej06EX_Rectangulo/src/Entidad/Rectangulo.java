package Entidad;

public class Rectangulo {
    public double lado1B, lado2A;

    public Rectangulo() {
    }

    public Rectangulo(double lado1B, double lado2A) {
        this.lado1B = lado1B;
        this.lado2A = lado2A;
    }
    
    public double calcularArea(Rectangulo nuevo) {
        double area = lado1B * lado2A;
        return area;
    } 
}
