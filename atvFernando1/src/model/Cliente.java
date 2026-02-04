package model;
import auth.Autenticavel;

public class Cliente extends Pessoa implements Autenticavel {
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean login(String senha) {
        return "cliente123".equals(senha);
    }
}