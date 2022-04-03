import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner giris = new Scanner(System.in);

        System.out.printf("Sicaklik giriniz : ");
        sicaklik = giris.nextInt();

        if (sicaklik < 5) {
            System.out.printf("Öneri : Kayak yap");
        } else if (sicaklik < 15) {
            System.out.printf("Öneri : Sineme git");
        } else if (sicaklik < 25) {
            System.out.printf("Öneri : Piknik yap");
        } else {
            System.out.printf("Öneri : Yüzmeye git");
        }

    }
}
