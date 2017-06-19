import java.util.*;
public class P1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double delta = (b * b) - (4 * a * c);

        if (a != 0 && delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n", root1);
            System.out.printf("R2 = %.5f\n", root2);
        }
        else {
            System.out.println("Impossivel calcular");
        }
    }
}
