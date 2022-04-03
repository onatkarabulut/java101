import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double alan, cevre, olcu, cap;
        Scanner giris=new Scanner(System.in);

        System.out.printf("Dairenin yarı çapını giriniz : ");
        cap=giris.nextDouble();

        cevre = 2*(Math.PI*cap);
        System.out.println("Cevresi : "+cevre);
        alan = Math.PI*(cap*cap);
        System.out.println("Alan : "+alan);
        
        System.out.printf("Daire dilimin merkez açı ölçüsünü giriniz : ");
        olcu=giris.nextDouble();

        alan = Math.PI*(cap*cap)*olcu/360;
        System.out.println("Daire dilimin alanı : "+alan);

    }
}
