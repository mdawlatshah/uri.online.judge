import java.util.*;
public class P1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14159;
        double r = scan.nextDouble();

        double volume = (4.0 / 3) * PI * Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
