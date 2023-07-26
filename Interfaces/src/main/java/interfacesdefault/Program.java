package interfacesdefault;

import interfacesdefault.entities.BrazilInterestService;
import interfacesdefault.entities.UsaInterestService;
import interfacesdefault.service.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        InterestService iss = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);
        double payment2 = iss.payment(amount, months);
        System.out.println("Payment after: " + months + " Months: ");
        System.out.printf("%.2f", payment);
        System.out.println();
        System.out.println("Payment after: " + months + " Months: ");
        System.out.printf("%.2f", payment2);


        sc.close();
    }
}
