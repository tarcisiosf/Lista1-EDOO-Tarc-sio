package br.com.aula.exercicio1;
public class ex1 {
    private String nome;
    private double peso;
    private double altura;
    private char sexo;

    public ex1(String nome, double peso, double altura, char sexo) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double calcularIMC() {
        if (this.altura > 0) {
            return this.peso / (this.altura * this.altura);
        }
        return 0;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}