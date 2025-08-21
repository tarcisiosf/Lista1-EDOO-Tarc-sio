package br.com.aula.exercicio6;

public class ex6 {
    private double raio;
    private double altura;

    public ex6(double raio, double altura) {
        setRaio(raio);
        setAltura(altura);
    }

    public double calcularAreaLateral() {
        return 2 * 3.1415 * this.raio * this.altura;
    }

    public double calcularAreaTotal() {
        return 2 * 3.1415 * this.raio * (this.altura + this.raio);
    }

    public double calcularVolume() {
        return 3.1415 * Math.pow(this.raio, 2) * this.altura;
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