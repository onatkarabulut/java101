import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, topla=0;
        Scanner giris=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi=giris.nextInt();

        for (int i =1 ; i<=sayi/2;i++){
            if (sayi%i==0) topla+=i;
        }
        if (topla==sayi){
            System.out.printf(sayi + " Mükemmel sayıdır.");
        }else{
            System.out.printf(sayi + " Mükemmel sayı değildir.");
        }

    }
}
