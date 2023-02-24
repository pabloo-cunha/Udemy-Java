package vetores1;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0 ; i<n ; i++){
            vect[i] = sc.nextDouble();
        }
        double sum = 0d;
        for (int j=0; j<n; j++){
            sum += vect[j];
        }
        double avg = sum / n;

        System.out.printf("Average Height = %.2f", avg);
    }
}
