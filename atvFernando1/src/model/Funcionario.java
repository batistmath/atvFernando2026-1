package model;

public abstract class Funcionario extends Pessoa {
    protected double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    public abstract double calcSalario();
    public abstract double comissao();
}
