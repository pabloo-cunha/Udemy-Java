package exercicio1;

import exercicio1.entities.Employee;
import exercicio1.entities.OutsourcedEmployee;

import java.util.*;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmploye = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberEmploye; i++){
            System.out.println("#Employee " + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (op == 'y') {
                System.out.print("Additional Charge: ");
                double addCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            }
            else
                employees.add(new Employee(name, hours, valuePerHour));
        }

        System.out.println("PAYMENTS: ");
        for (Employee emp: employees){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }


        sc.close();
    }
}
