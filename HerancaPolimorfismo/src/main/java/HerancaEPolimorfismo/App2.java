package HerancaEPolimorfismo;

import HerancaEPolimorfismo.entities.Account;
import HerancaEPolimorfismo.entities.BusinessAccount;
import HerancaEPolimorfismo.entities.SavingsAccount;

import java.math.BigDecimal;

public class App2 {

    public static void main(String[] args) {
        Account acc1 = new Account(1001, "João", BigDecimal.valueOf(1000.00));

        acc1.withdraw(BigDecimal.valueOf(200));

        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Pablo", BigDecimal.valueOf(1000.00), 0.01);
        acc2.withdraw(BigDecimal.valueOf(200.50));
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Alex", BigDecimal.valueOf(1000.00), BigDecimal.valueOf(500.00));
        acc3.withdraw(BigDecimal.valueOf(200.00));

        System.out.println(acc3.getBalance());
    }
}
