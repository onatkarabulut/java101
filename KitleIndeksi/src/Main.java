import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, VKI;
        Scanner giris=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = giris.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = giris.nextDouble();

        VKI=kilo/(boy*boy);
        System.out.printf("Vücut Kitle İndeksiniz :"+ VKI);

    }
}
