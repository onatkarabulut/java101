import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, min, max, ebob = 0, ekok = 0;
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        sayi1 = giris.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        sayi2 = giris.nextInt();
        min = (sayi1 > sayi2) ? sayi2 : sayi1;
        max = (sayi1 > sayi2) ? sayi1 : sayi2;
        while (true) {
            if (sayi1 % min == 0 && sayi2 % min == 0) {
                ebob = min;
                break;
            } else {
                min -= 1;
            }
        }
        while (true) {
            if (max % sayi1 == 0 && max % sayi2 == 0) {
                ekok = max;
                break;
            } else {
                max += 1;
            }
        }
        System.out.printf("Ekok : %d\nEbob : %d", ekok, ebob);
        giris.close();
    }
}
