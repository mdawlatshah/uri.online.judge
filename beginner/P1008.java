import java.util.*;
public class P1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int hoursWorked = scan.nextInt();
        double amount = scan.nextDouble();

        double salary = hoursWorked * amount;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}