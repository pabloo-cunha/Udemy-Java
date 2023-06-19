package exercicio2;

import exercicio2.entities.ImportedProduct;
import exercicio2.entities.Product;
import exercicio2.entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the Number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Product #" + i + " data:");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String data = sc.nextLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(data, dtf);

                products.add(new UsedProduct(name, price, date));
            }
            else if(ch == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
            else
                products.add(new Product(name, price));
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product pdc: products){
            System.out.println(pdc.priceTag());
        }
    }
}
