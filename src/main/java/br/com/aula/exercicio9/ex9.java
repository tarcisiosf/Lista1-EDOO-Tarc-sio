package br.com.aula.exercicio9;
import java.time.Year;

public class ex9 {
    private String nome;
    private int anoNascimento;

    public ex9(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String calcularTipoEleitor() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - this.anoNascimento;

        if (idade < 16) {
            return "Não Eleitor";
        } else if (idade >= 18 && idade <= 65) {
            return "Eleitor Obrigatório";
        } else {
            return "Eleitor Facultativo";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}