import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, satir, kontrol=0;
        Scanner giris = new Scanner(System.in);
        System.out.printf("Satir sayısını giriniz : ");
        satir = giris.nextInt();
        if (satir % 2 == 0) satir -= 1;

        for (i = 1; i <= satir; i++) {
            int yıldız=2*i-1 - 4*(i- (satir+1)/2 )*kontrol;

            for (int j = 1; j <= (satir - yıldız)/2; j++) System.out.print(" ");
            for (int j = 1; j <= yıldız; j++) System.out.print("*");
            for (int j = 1; j <= (satir - yıldız)/2; j++) System.out.print(" ");
            System.out.print("\n");
            if ((satir+1)/2==i) kontrol=1;
        }

        giris.close();
    }
}
