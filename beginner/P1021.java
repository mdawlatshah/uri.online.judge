import java.util.*;
public class P1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        if (0 <= n && n <= 1000000.00) {
            double hundreds = n / 100;
            double fifties = n % 100 / 50;
            double twenties = n % 100 % 50 / 20;
            double tens = n % 100 % 50 % 20 / 10;
            double fives = n % 100 % 50 % 20 % 10 / 5;
            double twos = n % 100 % 50 % 20 % 10 % 5 / 2;
            double ones = n % 100 % 50 % 20 % 10 % 5 % 2 / 1;

            double cent50s = (n * 100 % 100) / 50;
            double cent25s = (n * 100 % 100) % 50 / 25;
            double cent10s = (n * 100 % 100) % 50 % 25 / 10;
            double cent5s = (n * 100 % 100) % 50 % 25 % 10 / 5;
            double cent1s = (n * 100 % 100) % 50 % 25 % 10 % 5 / 1;

            System.out.println("NOTAS:");
            System.out.println((int)hundreds + " nota(s) de R$ 100.00");
            System.out.println((int)fifties + " nota(s) de R$ 50.00");
            System.out.println((int)twenties + " nota(s) de R$ 20.00");
            System.out.println((int)tens + " nota(s) de R$ 10.00");
            System.out.println((int)fives + " nota(s) de R$ 5.00");
            System.out.println((int)twos + " nota(s) de R$ 2.00");

            System.out.println("MOEDAS:");
            System.out.println((int)ones + " moeda(s) de R$ 1.00");
            System.out.println((int)cent50s + " moeda(s) de R$ 0.50");
            System.out.println((int)cent25s + " moeda(s) de R$ 0.25");
            System.out.println((int)cent10s + " moeda(s) de R$ 0.10");
            System.out.println((int)cent5s + " moeda(s) de R$ 0.05");
            System.out.println((int)cent1s + " moeda(s) de R$ 0.01");
        }
    }
}
