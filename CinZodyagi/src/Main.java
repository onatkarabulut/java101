import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner giris = new Scanner(System.in);

        System.out.print("Doğun yılınızı giriniz : ");
        yil = giris.nextInt();

        switch (yil % 12) {
            case 0:
                System.out.print("Çin Zodyaği Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyaği Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyaği Burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyaği Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyaği Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyaği Burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyaği Burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyaği Burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyaği Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyaği Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyaği Burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyaği Burcunuz : Koyun");
                break;
        }

    }
}
