package desafio.application;

import desafio.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        System.out.print("Quanto alunos irão se hospedar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1 ; i <= n ; i++){
            System.out.println();
            System.out.println("Rent number #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Number room: ");
            int room = sc.nextInt();
            sc.nextLine();

            Rent rent = new Rent(name, email);

            vect[room] = rent;
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < vect.length; i++){
            if (vect[i] != null)
                System.out.println(i + ": " + vect[i]);
        }

        sc.close();
    }
}
