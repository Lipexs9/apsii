package br.edu.unipe.apsii;

public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;
    protected String dataAdmissao;

    public Funcionario(String novoNome, int novaMatricula, double novoSalarioBase, String novaDataAdmissao) {
        this.nome = novoNome;
        this.matricula = novaMatricula;
        this.salarioBase = novoSalarioBase;
        this.dataAdmissao = novaDataAdmissao;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularDesconto() {
        return salarioBase * 0.08;
    }
}