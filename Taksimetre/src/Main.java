import java.util.Scanner;
import java.util.prefs.NodeChangeEvent;
import java.util.prefs.NodeChangeListener;

public class Main {
    public static void main(String[] args) {
        float KM=0.0f, odenecekTutar=0.0f, minimumTutar=20.0f, acilis=10.0f, birimFiyat=2.20f;
        Scanner giris= new Scanner(System.in);

        System.out.println("Güncel Kilometre değerini giriniz : ");
        KM=giris.nextFloat();
        odenecekTutar=acilis+birimFiyat*KM;
        odenecekTutar=(odenecekTutar<minimumTutar)?minimumTutar: odenecekTutar;
        System.out.println("Ödeyeceğiniz Tutar : "+ odenecekTutar + " ₺");
    }
}
