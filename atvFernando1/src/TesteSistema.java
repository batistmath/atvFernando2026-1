import model.*;
import model.impl.*;
import auth.Autenticavel;

public class TesteSistema {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO ===");
        
        Gerente g = new Gerente("Ricardo", "111.222.333-44", 5000.0);
        
        System.out.println("Gerente: " + g.getClass().getSimpleName());
        System.out.println("Salario: " + g.calcSalario());
        System.out.println("Login: " + g.login("gerente123"));

        Cliente c = new Cliente("Maria", "555.666.777-88");
        System.out.println("Login Cliente: " + c.login("1234"));
    }
}