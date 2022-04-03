import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,us, sonuc=1;
        Scanner giris=new Scanner(System.in);

        System.out.print("Taban degerini giriniz :");
        taban=giris.nextInt();

        System.out.print("Us degerini giriniz :");
        us=giris.nextInt();

        for (int i=1; i<=us;i++){
            sonuc*=taban;
        }
        System.out.print("Sonuc : " + sonuc);
        giris.close();
    }
}
