import java.util.*;
public class P1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        int amount = scan.nextInt();

        double total = 0;
        switch(code) {
            case 1:
                total = 4 * amount;
                break;
            case 2:
                total = 4.50 * amount;
                break;
            case 3:
                total = 5 * amount;
                break;
            case 4:
                total = 2 * amount;
                break;
            case 5:
                total = 1.50 * amount;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
