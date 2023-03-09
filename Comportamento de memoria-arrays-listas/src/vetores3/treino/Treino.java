package vetores3.treino;

import java.util.Locale;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Posições: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++){

            System.out.println("Numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (vetor[i] < 0)
                System.out.println(vetor[i]);
        }


        sc.close();
    }
}
