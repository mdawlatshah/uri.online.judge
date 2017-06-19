import java.util.*;
public class P1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        double salary = scan.nextDouble();
        double sale = scan.nextDouble();

        double total = sale * 15 / 100 + salary;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
