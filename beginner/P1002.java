import java.util.*;
public class P1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14159;
        double r = scan.nextDouble();
        double area = PI * r * r;
        System.out.printf("A=%.4f\n", area);
    }
}
