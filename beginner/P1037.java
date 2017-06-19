import java.util.*;
public class P1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        String interval = "";
        if(n < 0 || n > 100) {
            interval = "Fora de intervalo";
        }
        else if(n >= 0 && n <= 25) {
            interval = "Intervalo [0,25]";
        }
        else if(n > 25 && n <= 50) {
            interval = "Intervalo (25,50]";
        }
        else if(n > 50 && n <= 75) {
            interval = "Intervalo (50,75]";
        }
        else if(n > 75 && n <= 100) {
            interval = "Intervalo (75,100]";
        }

        System.out.println(interval);
    }
}
