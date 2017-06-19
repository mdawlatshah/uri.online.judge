import java.util.*;
public class P1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int greater = ((num1 + num2 + Math.abs(num1 - num2)) / 2);
        int greatest = ((greater + num3 + Math.abs(greater - num3)) / 2);

        System.out.println(greatest + " eh o maior");
    }
}
