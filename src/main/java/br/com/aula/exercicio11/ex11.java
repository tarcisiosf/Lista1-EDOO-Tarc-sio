package br.com.aula.exercicio11;

public class ex11 {
    private String nome;
    private double salarioDoMes;
    private int numeroDeFilhos;

    public ex11(String nome, double salarioDoMes, int numeroDeFilhos) {
        this.nome = nome;
        this.salarioDoMes = salarioDoMes;
        this.numeroDeFilhos = numeroDeFilhos;
    }
    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            this.salarioDoMes *= (1 + percentual / 100.0);
        }
    }

    public double calcularINSS() {
        if (this.salarioDoMes <= 2545.00) {
            return this.salarioDoMes * 0.06;
        } else {
            return this.salarioDoMes * 0.10;
        }
    }

    public double calcularParcelaIR() {
        double aliquota;
        if (this.salarioDoMes <= 1903.98) {
            aliquota = 0;
        } else if (this.salarioDoMes <= 2826.65) {
            aliquota = 7.5;
        } else if (this.salarioDoMes <= 3751.05) {
            aliquota = 15.0;
        } else if (this.salarioDoMes <= 4664.68) {
            aliquota = 22.5;
        } else {
            aliquota = 27.5;
        }
        return this.salarioDoMes * (aliquota / 100.0);
    }

    public double calcularIRPF() {
        double parcelaIR = calcularParcelaIR();
        double deducaoPorFilhos = this.numeroDeFilhos * 545.00;
        double irpfFinal = parcelaIR - deducaoPorFilhos;
        return Math.max(0, irpfFinal);
    }

    public static void main(String[] args) {

        ex11 func1 = new ex11("Tarcísio Santos", 17500.00, 2);

        System.out.println("--- Dados do Funcionário ---");
        System.out.println("Nome: " + func1.nome);
        System.out.println("Salário Bruto: R$" + String.format("%.2f", func1.salarioDoMes));
        System.out.println("Número de Filhos: " + func1.numeroDeFilhos);

        System.out.println("\n--- Cálculos ---");

        double inss = func1.calcularINSS();
        System.out.println("Desconto INSS: R$" + String.format("%.2f", inss));

        double irpf = func1.calcularIRPF();
        System.out.println("Desconto IRPF: R$" + String.format("%.2f", irpf));

        System.out.println("\n--- Aplicando Aumento de 10% ---");
        func1.aplicarAumento(10);
        System.out.println("Novo Salário: R$" + String.format("%.2f", func1.salarioDoMes));
    }
}