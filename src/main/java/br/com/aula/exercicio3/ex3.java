package br.com.aula.exercicio3;

public class ex3 {
    private double raio;

    public ex3(double raio) {
        this.setRaio(raio);
    }

    public double calcularArea() {
        return 4 * 3.1415 * Math.pow(this.raio, 2);
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * 3.1415 * Math.pow(this.raio, 3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            this.raio = 0;
        }
    }
}