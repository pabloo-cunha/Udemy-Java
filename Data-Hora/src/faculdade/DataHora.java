package faculdade;

import java.time.Duration;
import java.util.Scanner;
public class DataHora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Faculdade fc = new Faculdade();

        System.out.println("inicio: ");
        String inicio = sc.nextLine();
        System.out.println("fim: ");
        String fim = sc.nextLine();

        Duration resultado = fc.calcularDuracao(inicio, fim);

        long hora = resultado.toHours();
        long minutos = resultado.toMinutesPart();
        System.out.println(hora + ":" + minutos);
    }
}

