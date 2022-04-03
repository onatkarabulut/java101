import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, topla=0, adet=5;
        float ort;
        Scanner giris=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        matematik=giris.nextInt();
        topla+=(matematik>=0 && matematik<=100)?matematik:0;
        adet=(matematik>=0 && matematik<=100)?adet:adet-1;

        System.out.print("fizik notunu giriniz : ");
        fizik=giris.nextInt();
        topla+=(fizik>=0 && fizik<=100)?fizik:0;
        adet=(fizik>=0 && fizik<=100)?adet:adet-1;

        System.out.print("turkce notunu giriniz : ");
        turkce=giris.nextInt();
        topla+=(turkce>=0 && turkce<=100)?turkce:0;
        adet=(turkce>=0 && turkce<=100)?adet:adet-1;

        System.out.print("kimya notunu giriniz : ");
        kimya=giris.nextInt();
        topla+=(kimya>=0 && kimya<=100)?kimya:0;
        adet=(kimya>=0 && kimya<=100)?adet:adet-1;;

        System.out.print("muzik notunu giriniz : ");
        muzik=giris.nextInt();
        topla+=(muzik>=0 && muzik<=100)?matematik:0;
        adet=(muzik>=0 && muzik<=100)?adet:adet-1;

        ort=topla/adet;
        System.out.println("Ortalama : " + ort);
        if (ort<65){
            System.out.printf("Kaldınız");
        }else{
            System.out.printf("Geçtiniz");
        }

    }
}
