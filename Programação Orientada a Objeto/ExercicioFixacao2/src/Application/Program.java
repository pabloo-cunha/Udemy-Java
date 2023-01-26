package Application;

import entities.Funcionario;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Enter name: ");
        funcionario.name = scan.nextLine();

        System.out.print("Gross Salary: ");
        funcionario.grossSalary = scan.nextDouble();

        System.out.print("Enter with the tax: ");
        funcionario.tax = scan.nextDouble();
        funcionario.netSalary();

        System.out.println("\nPercentagem increase: ");
        double percentagem = scan.nextDouble();
        funcionario.increaseSalary(percentagem);

        System.out.println(funcionario);





    }
}
