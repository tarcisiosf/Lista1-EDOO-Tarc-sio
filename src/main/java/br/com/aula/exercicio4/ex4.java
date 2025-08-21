public class ex4 {
    private double comprimento;
    private double largura;

    public ex4(double comprimento, double largura) {
        this.comprimento = Math.max(0, comprimento);
        this.largura = Math.max(0, largura);
    }

    public double calcularArea() {
        return this.largura * this.comprimento;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.comprimento);
    }

    public double getComprimento() {
        return comprimento;
    }



    public void setComprimento(double comprimento) {
        this.comprimento = Math.max(0, comprimento);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = Math.max(0, largura);
    }
}