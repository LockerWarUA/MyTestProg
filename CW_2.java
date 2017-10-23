package CW_V6;
import java.util.Scanner;
public class CW_2 {
    public static void main(String[] args) {
        boolean czyPada;
        boolean czySwieciSlonce;
        Scanner sc = new Scanner(System.in);
        System.out.println("czy pada deść?(true/false)");
        czyPada = sc.nextBoolean();
        System.out.println("czy świeci słońce?(true/false)");
        czySwieciSlonce = sc.nextBoolean();
        if (czyPada != false) {
            if (czySwieciSlonce != true) {
                System.out.println("plucha");
            } else {
                System.out.println("tęcza");
            }
        } else if (czyPada != true) {
            if (czySwieciSlonce != false) {
                System.out.println("słoneczne");
            } else {
                System.out.println("pochmurno");
            }
        }
    }
}
