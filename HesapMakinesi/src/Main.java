import java.util.*;
public class Main {

    //---------------------------------------------------------------------------------------------
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        int secim;
        String menü="Yapmak istediğiniz işlem?" +
                "\t\n(1)Toplama" +
                "\t\n(2)Çıkarma" +
                "\t\n(3)Çarpma" +
                "\t\n(4)Bölme" +
                "\t\n(5)Üslü Sayı" +
                "\t\n(6)Faktoriyel" +
                "\t\n(7)Mod Alma" +
                "\t\n(8)Dikdörtgen Alan ve Çevre" +
                "\t\n(9)Çıkış Yap";



        do {
            System.out.println(menü);
            secim =in.nextInt();
            switch (secim){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    areaAndEnvironment();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    break;
            }
        }while(secim != 9);

    }

    private static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.println(i++ + " .sayı : ");
            number = scan.nextInt();

            if (number == 0)
                break;
            result += number;
        }

        System.out.println(" Sonuc :" + result);

    }

    private static void areaAndEnvironment() {
        Scanner scan = new Scanner(System.in);
        int shortEdge, longEdge, result = 0, i = 1;

        System.out.println(" Kısa kenarı giriniz :");
        shortEdge = scan.nextInt();

        System.out.println(" Uzun kenarı giriniz :");
        longEdge = scan.nextInt();

        System.out.println("Çevre: " + 2 * (shortEdge + longEdge));
        System.out.println("Alan : " + (shortEdge * longEdge));

    }

    private static void modding() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number :");
        int num = scan.nextInt();

        System.out.print("Please enter mod :");
        int mod = scan.nextInt();

        System.out.println("Result:" + num % mod);
    }
   
}
