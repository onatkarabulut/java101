import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi, indirim = 0;
        double tutar, birimUcret = 0.10;

        Scanner giris = new Scanner(System.in);

        System.out.print("Mesafe değerini giriniz (km) : ");
        km = giris.nextInt();
        if (km < 0) {
            System.out.printf("Negatif değer giremzsiniz ");
            System.exit(0);
        }

        System.out.print("Yaşınızı giriniz : ");
        yas = giris.nextInt();
        if (yas < 0) {
            System.out.printf("Negatif değer giremzsiniz ");
            System.exit(0);
        }

        System.out.print("Yolculuk tipini giriniz (1 yada 2 ) : ");
        yolculukTipi = giris.nextInt();
        if (!(yolculukTipi == 1 || yolculukTipi == 2)) {
            System.out.printf("1 yada 2 değerini girmelisiniz ");
            System.exit(0);
        }

        if (yas < 12) {
            indirim = 50;
        } else if (yas >= 12 && yas < 24) {
            indirim = 10;
        } else if (yas >= 12 && yas < 24) {
            indirim = 30;
        }

        if (yolculukTipi == 1) {
            tutar = km * birimUcret * (1- indirim/100.0);
        }else{
            tutar = km * birimUcret * (1 - (indirim / 100.0))*2*0.8f;
        }
        System.out.printf("Tutar : "+tutar);
        giris.close();
    }
}
