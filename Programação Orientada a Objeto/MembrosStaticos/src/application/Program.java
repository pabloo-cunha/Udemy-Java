package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
//        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi value: %.6f", Calculator.PI);

        scan.close();

    }


}
