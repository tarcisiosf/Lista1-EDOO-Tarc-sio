package br.com.aula.exercicio5;

public class ex5 {
    private double altura;
    private double largura;
    private double comprimento;

    public ex5(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        return this.altura * this.comprimento * this.largura;
    }

    public double calcularArea() {
        return 2 * ( (this.altura * this.largura) +
                (this.altura * this.comprimento) +
                (this.largura * this.comprimento) );
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}