package model.impl;
import model.Funcionario;

public class Engenheiro extends Funcionario {
    public Engenheiro(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcSalario() {
        return this.salarioBase * 1.2; // Exemplo de regra: +20%
    }

    @Override
    public double comissao() {
        return 500.0;
    }
}
