package model.impl;
import model.Funcionario;

public class Secretario extends Funcionario {
    public Secretario(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcSalario() {
        return this.salarioBase;
    }

    @Override
    public double comissao() {
        return 0;
    }
}