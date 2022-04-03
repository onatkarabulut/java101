import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = (int) (Math.random() * 100);
        int hak=5;
        int cevap;
        Scanner giris=new Scanner(System.in);
        while(hak>0){
            System.out.print("Tahmininiz : ");
            cevap=giris.nextInt();
            if (cevap==sayi){
                System.out.println("Tebrikler bildiniz ... Sayi : " + sayi);
            }else{
                hak-=1;
                System.out.println("Yanlış cevap... Kalan hakkınız : " + hak);
                if (cevap>sayi){
                    System.out.println("Aşağıya in... Girilen sayi : "+ cevap);
                }else{
                    System.out.println("Yukarıya çık ... Girilen sayi : "+ cevap);
                }
            }
        }


    }
}
