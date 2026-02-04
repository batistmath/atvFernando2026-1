import model.impl.*;
import model.Cliente;
import auth.Autenticavel;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Seu Nome", "000.000.000-00", 5000.0);
        System.out.println("Salário Gerente: " + g1.calcSalario());
        System.out.println("Login: " + g1.login("gerente123"));

        Cliente c1 = new Cliente("Fulano", "111.111.111-11");
        System.out.println("Login Cliente: " + c1.login("cliente123"));
    }
}