package Entidades;

public class ParDeNumeros {
    private final double num1;
    private final double num2;

    public ParDeNumeros() {
        num1 = Math.random() * 30 + 1;
        num2 = Math.random() * 30 + 1;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
