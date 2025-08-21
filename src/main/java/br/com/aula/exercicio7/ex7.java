package br.com.aula.exercicio7;

public class ex7 {
    private double raio;
    private double altura;

    public ex7(double raio, double altura) {
        setRaio(raio);
        setAltura(altura);
    }

    public double calcularGeratriz() {
        return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.raio, 2));
    }

    public double calcularAreaLateral() {
        double geratriz = calcularGeratriz();
        return 3.1415 * this.raio * geratriz;
    }

    public double calcularAreaTotal() {
        double geratriz = calcularGeratriz();
        return 3.1415 * this.raio * (geratriz + this.raio);
    }

    public double calcularVolume() {
        return (1.0 / 3.0) * 3.1415 * Math.pow(this.raio, 2) * this.altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = Math.max(0, raio);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = Math.max(0, altura);
    }
}