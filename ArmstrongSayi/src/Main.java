import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
            Scanner giris= new Scanner(System.in);
            System.out.println("Bir değer giriniz : ");
            int deger=giris.nextInt();
            giris.close();
            int uzunluk= String.valueOf(deger).length();
            double toplam=0;
            int gecici=deger;
            giris.close();
            while(deger!=0){
                toplam=toplam+Math.pow(deger%10, uzunluk);
                deger=deger/10;
            }
            if(toplam==gecici){
                System.out.println(gecici+" Armstrong sayıdır...");
            }else{
                System.out.println(gecici+" Armstrong sayı değildir...");
            }

    }
}
