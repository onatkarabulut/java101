import java.util.Scanner;

public class Main {
    static int hesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        return taban * hesapla(taban, us - 1);

    }

    public static void main(String[] args) {
        int s1, s2;
        Scanner giris = new Scanner(System.in);

        System.out.printf("Taban değeri giriniz : ");
        s1 = giris.nextInt();
        System.out.printf("Üs değerini giriniz : ");
        s2 = giris.nextInt();
        System.out.println("Sonuc : " + hesapla(s1, s2));
    }
}
