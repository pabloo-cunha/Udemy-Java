package HerancaEPolimorfismo;

import HerancaEPolimorfismo.entities.Account;
import HerancaEPolimorfismo.entities.BusinessAccount;
import HerancaEPolimorfismo.entities.SavingsAccount;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Pablo", BigDecimal.valueOf(0.00));
        BusinessAccount bacc = new BusinessAccount(1002, "Joana", BigDecimal.valueOf(0.00), BigDecimal.valueOf(500.0));

        //  UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "João", BigDecimal.valueOf(0.00), BigDecimal.valueOf(200.0));
        Account acc3 = new SavingsAccount(1004, "Ana", BigDecimal.valueOf(0.00), 0.01);

        //  DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(BigDecimal.valueOf(100.00));

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(BigDecimal.valueOf(200.00));
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update! ");
        }
    }
}
