import java.util.*;
public class P1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (0 < n && n < 1000000) {
            int note = n;

            int hundreds = n / 100;
            n = n % 100;

            int fifties = n / 50;
            n = n % 50;

            int twenties = n / 20;
            n = n % 20;

            int tens = n / 10;
            n = n % 10;

            int fives = n / 5;
            n = n % 5;

            int twos = n / 2;
            n = n % 2;

            int ones = n / 1;
            n = n % 1;

            System.out.println(note);
            System.out.println(hundreds + " nota(s) de R$ 100,00");
            System.out.println(fifties +" nota(s) de R$ 50,00");
            System.out.println(twenties + " nota(s) de R$ 20,00");
            System.out.println(tens + " nota(s) de R$ 10,00");
            System.out.println(fives + " nota(s) de R$ 5,00");
            System.out.println(twos + " nota(s) de R$ 2,00");
            System.out.println(ones + " nota(s) de R$ 1,00");
        }
    }
}
