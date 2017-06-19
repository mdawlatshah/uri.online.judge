import java.util.*;
public class P1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sec = n % 60;
        int min = n / 60 ;
        int hour = min / 60 ;
        min = min % 60;

        System.out.println(hour + ":" + min + ":"  + sec);
    }
}
