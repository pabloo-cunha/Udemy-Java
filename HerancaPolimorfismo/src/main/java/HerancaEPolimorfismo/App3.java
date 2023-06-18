package HerancaEPolimorfismo;

import HerancaEPolimorfismo.entities.Account;
import HerancaEPolimorfismo.entities.SavingsAccount;

import java.math.BigDecimal;

public class App3 {

    public static void main(String[] args) {
        Account x = new Account(1001, "Pablo", BigDecimal.valueOf(1000.00));
        Account y = new SavingsAccount(1002, "Pablo", BigDecimal.valueOf(1000.00), 0.01);

        x.withdraw(BigDecimal.valueOf(50.0));
        y.withdraw(BigDecimal.valueOf(50.0));

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
