import java.util.*;
public class P1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14159;

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double triangulo = 1.0 / 2 * a * c ;
        double circulo = PI * c * c;
        double trapezio = 1.0 / 2 * (a + b) * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
