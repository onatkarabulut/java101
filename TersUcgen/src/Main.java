import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, satir;
        Scanner giris = new Scanner(System.in);
        System.out.printf("Satir sayısını giriniz : ");
        satir = giris.nextInt();
        for (i = satir; i > 0; i--) {
            int yıldız = 2 * i - 1;
            for (int j = 1; j <= (2*satir - yıldız) / 2; j++) System.out.print(" ");
            for (int j = 1; j <= yıldız; j++) System.out.print("*");
            System.out.print("\n");
        }

        giris.close();
    }
}
