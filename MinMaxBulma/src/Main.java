import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adet,sayi, min=0, max=0;
        Scanner giris=new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        adet=giris.nextInt();

        for (int i=1; i<=adet;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            sayi=giris.nextInt();
            if( min==0  ) min=sayi;
            if( max==0 ) max=sayi;
            min=(min>sayi)?sayi:min;
            max=(max<sayi)?sayi:max;
        }
        System.out.printf("Minimum değer : %d\nMaximum Değer : %d",min,max);


        giris.close();
    }
}
