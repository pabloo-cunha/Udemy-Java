package vetores3.treino;

import vetores3.entities.Alturas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Alturas[] pessoas = new Alturas[n];

        for (int i = 0; i < pessoas.length; i++) {

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Alturas(name, idade, altura);
        }

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16)
                System.out.println(pessoas[i].getIdade());
        }

        double sum = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println("nome: " + pessoas[i].getName() + "\nidade: " + pessoas[i].getIdade());
                sum++;
            }
        }

        sum = sum / pessoas.length * 100;
        System.out.println("A porcentagem de pessoas menores que 16 são: " + sum + "%");
    }
}
