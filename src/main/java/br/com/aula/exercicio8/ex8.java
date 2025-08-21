package br.com.aula.exercicio8;

public class ex8 {
    private String nome;
    private double peso;
    private double altura;

    public ex8(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularIMC() {
        if (this.altura > 0) {
            return this.peso / (this.altura * this.altura);
        }
        return 0;
    }

    public String calcularFaixaDePeso() {
        double imc = calcularIMC();
        if (imc < 20) {
            return "Abaixo do peso ideal";
        } else if (imc <= 25) {
            return "Peso normal";
        } else if (imc <= 30) {
            return "Excesso de peso";
        } else if (imc <= 35) {
            return "Obesidade";
        } else {
            return "Obesidade mórbida";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}