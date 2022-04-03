import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner giris=new Scanner(System.in);

        System.out.print("Yıl bilgisini giriniz :");
        yil=giris.nextInt();
        if (yil%100==0){
            if (yil%400==0){
                System.out.printf(yil + " Artik yil");
            }
            else{
                System.out.printf(yil + " Artik yil değil");
            }
        }else if(yil%4==0){
            System.out.printf(yil + " Artik yil");
        }else{
            System.out.printf(yil + " Artik yil değil");
        }

    }
}
