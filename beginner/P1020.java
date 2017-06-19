import java.util.*;
public class P1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int year = n / 365;
        n = n % 365;

        int month = n / 30;
        n = n % 30;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(n + " dia(s)");
    }
}
