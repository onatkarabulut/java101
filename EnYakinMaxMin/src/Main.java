import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner giris=new Scanner(System.in);

        int girilenSayi;
        System.out.print("Bir sayı Giriniz : ");
        girilenSayi=giris.nextInt();

        int kucukEnYakin=Integer.MIN_VALUE ;
        int buyukEnYakin=Integer.MAX_VALUE;
        for (int i : list){
            kucukEnYakin= ( i <girilenSayi && i>kucukEnYakin)?i:kucukEnYakin;
            buyukEnYakin= ( i >girilenSayi && i<buyukEnYakin)?i:buyukEnYakin;
        }
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : "+ girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);


    }
}
