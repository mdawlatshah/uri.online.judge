import java.util.*;
public class P1035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (c >= 0 && d >= 0 && a % 2 == 0 && b > c && d > a && c + d > a + b) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}
