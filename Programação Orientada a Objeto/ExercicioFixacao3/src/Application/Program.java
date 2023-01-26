package Application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student std = new Student();

        System.out.println("Name: ");
        std.name = scan.nextLine();


        System.out.print("Nota 1: ");
        std.nota1 = scan.nextDouble();

        System.out.print("Nota 2: ");
        std.nota2 = scan.nextDouble();

        System.out.print("Nota 3: ");
        std.nota3 = scan.nextDouble();


        System.out.println(std);

        scan.close();
    }
}
