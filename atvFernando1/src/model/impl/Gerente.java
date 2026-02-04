package model.impl;
import model.Funcionario;
import auth.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    public Gerente(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcSalario() {
        return this.salarioBase * 1.5;
    }

    @Override
    public double comissao() {
        return 800.0;
    }

    @Override
    public boolean login(String senha) {
        return "gerente123".equals(senha);
    }
}
