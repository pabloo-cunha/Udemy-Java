package Application;

import entities.Retangule;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Retangule retangule = new Retangule();

        System.out.println("Enter Width: ");
        retangule.width = scan.nextDouble();

        System.out.println("Enter Height: ");
        retangule.height = scan.nextDouble();

        System.out.println(retangule);

        scan.close();


    }
}