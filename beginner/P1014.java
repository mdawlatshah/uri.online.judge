import java.util.*;
public class P1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();

        double average = x / y;
        System.out.printf("%.3f km/l\n", average);
    }
}
