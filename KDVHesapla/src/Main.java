import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutari,kdvliTutar, KDV = 0.18f;
        Scanner giris=new Scanner(System.in);

        System.out.println("Toplam tutarı giriniz : ");
        tutar=giris.nextFloat();

        KDV=(tutar<1000? 0.18f:0.8d);

        kdvTutari=tutar*KDV;
        kdvliTutar=kdvTutari+tutar;

        System.out.printf("Tutar : " + tutar + "\nKDV Oranı : "+ KDV + "\nKDV Tutari : "+kdvTutari+"\nToplam Tutar : "+kdvliTutar);



    }
}
