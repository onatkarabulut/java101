import java.security.Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float armut, elma, domates, muz, patlican;
        float armutFiyat=2.14f, elmaFiyat=3.67f, domatesFiyat=1.11f, muzFiyat=0.95f, patlicanFiyat=5.0f;
        Scanner giris=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut=giris.nextFloat();

        System.out.print("Elma Kaç Kilo ? : ");
        elma=giris.nextFloat();

        System.out.print("Domates Kaç Kilo ? : ");
        domates=giris.nextFloat();

        System.out.print("muz Kaç Kilo ? : ");
        muz=giris.nextFloat();

        System.out.print("patlican Kaç Kilo ? : ");
        patlican=giris.nextFloat();

        System.out.printf("%-25s%-10s%-10s%-10s\n", "Mazleme", "B. Fiyat", "Kilo","Total");
        System.out.printf("%-25s%-10f%-10f%-10f\n", "Armut", armutFiyat, armut, armut*armutFiyat);
        System.out.printf("%-25s%-10f%-10f%-10f\n", "Elma", elmaFiyat, elma, elma*elmaFiyat);
        System.out.printf("%-25s%-10f%-10f%-10f\n", "Domates", domatesFiyat, domates, domates*domatesFiyat);
        System.out.printf("%-25s%-10f%-10f%-10f\n", "Muz", muzFiyat, muz, muz*muzFiyat);
        System.out.printf("%-25s%-10f%-10f%-10f\n", "Patlican", patlicanFiyat, patlican, patlican*patlicanFiyat);


    }
}
