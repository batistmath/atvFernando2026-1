package model.impl;
import model.Funcionario;
import auth.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
    public Diretor(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcSalario() {
        return this.salarioBase * 2.0;
    }

    @Override
    public double comissao() {
        return 1000.0;
    }

    @Override
    public boolean login(String senha) {
        return "diretor123".equals(senha);
    }
}
