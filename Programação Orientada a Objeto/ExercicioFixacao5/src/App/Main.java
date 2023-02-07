package App;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter accont number: ");
        int numberCount = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is ther an initial deposit(y/n)? ");
        char option = sc.next().charAt(0);


        if (option == 'y'){
            System.out.print("Enter a initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(numberCount, holder, initialDeposit);

        } else if(option=='n')
            account = new Account(numberCount, holder);
        else
            System.out.println("Opção invalida!");

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());


        System.out.println("---\tUpdate account!\t---");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println("---\tUpdate account!\t---");
        System.out.println();
        System.out.println(account);



        sc.close();
    }
}
