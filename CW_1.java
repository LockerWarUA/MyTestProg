package CW_V6;
import java.util.Scanner;
public class CW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wrt = sc.nextInt();
        System.out.println((wrt <= 1 && wrt >= 0) ? "ABC":"NOT ABC");
        System.out.println((wrt > 1) ? "A":"NOT A");
        System.out.println((wrt < 0) ? "B":"NOT B");
        //(wrt <= 1 && wrt >= 0) ? : System.out.println("ABC") System.out.println("nie ABC")
        //(wrt > 1) ? : System.out.println("A") : System.out.println("nie A");
        //(wrt < 0) ? : System.out.println("B") : System.out.println("Nie B");
        //System.out.println(lan);
        System.out.println(wrt);
    }
}
