package Application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dollar = scan.nextDouble();

        System.out.print("How many dollar will be bought: ");
        double qtdDollar = scan.nextDouble();

        double valueFinal = CurrencyConverter.realPaid(dollar, qtdDollar);

        System.out.printf("Amount to be paid in reais: R$%.2f", valueFinal);
    }
}
