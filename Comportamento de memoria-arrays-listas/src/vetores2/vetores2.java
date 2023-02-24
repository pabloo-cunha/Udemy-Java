package vetores2;

import entities.ProductVetores2;

import java.util.Locale;
import java.util.Scanner;

public class vetores2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductVetores2[] vect = new ProductVetores2[n];

        for (int i=0; i< vect.length ; i++){
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();

            vect[i] = new ProductVetores2(name, price);
        }

        double sum = 0d;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Average Price = %.2f%n", avg);

        sc.close();
    }
}
