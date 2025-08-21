package br.com.aula.exercicio2;

public class ex2 {
    private double base;
    private double altura;

    public ex2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularVolume() {
        return (1.0 / 3.0) * this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}