import java.util.*;
public class P1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = scan.nextInt();
        int averageSpeed = scan.nextInt();

        double litersNeeded = hours * averageSpeed / 12.0;
        System.out.printf("%.3f\n", litersNeeded);
    }
}
