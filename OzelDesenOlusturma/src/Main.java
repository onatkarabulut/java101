import java.util.Scanner;

public class Main {
    static void desenYazdir(int sayi) {
        System.out.print(sayi + " ");
        if (sayi <= 0) return;
        desenYazdir(sayi - 5);
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.printf("Bir sayı giriniz : ");
        sayi = giris.nextInt();
        desenYazdir(sayi);
    }
}
