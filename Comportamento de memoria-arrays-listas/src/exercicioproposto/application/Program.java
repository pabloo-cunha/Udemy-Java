package exercicioproposto.application;

import exercicioproposto.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        Employee empl = new Employee();



        System.out.print("How many employess will be registred: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.println("Enter the Employee id that will have salary increase: ");
        int idSalary = sc.nextInt();



        sc.close();
    }

    public Integer position(List<Employee> list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
