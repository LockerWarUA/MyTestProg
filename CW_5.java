package CW_V6;
import java.util.Scanner;
public class CW_5 {
    public static void main(String[] args) {
        int mie = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("wpisz dzień");
        int dzienu = sc.nextInt();
        System.out.println("wpisz miesianc");
        int miesiancu = sc.nextInt();
        //ille dni
        int[] miesianc = {0, 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        System.out.println(miesiancu);
    for (i = 1; i > miesiancu; ++i) mie = mie + miesianc[i];
    System.out.println(i);
        System.out.println(mie);
        System.out.println(miesiancu);
        System.out.println(miesianc[miesiancu]);
        int ille = mie+dzienu;
        System.out.println(ille);

    }
}
