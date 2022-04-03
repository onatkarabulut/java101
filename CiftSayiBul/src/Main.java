import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,topla=0,say=0;
        System.out.printf("Bir sayı giriniz : ");
        Scanner giris=new Scanner(System.in);
        sayi=giris.nextInt();
        for(int i=0 ; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                topla+=i;
                say+=1;
            }
        }
        System.out.printf("Ortalama : " + topla/say);
    }
}
