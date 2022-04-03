import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim;
        Scanner giris=new Scanner(System.in);
        System.out.println("Matemetik notunu giriniz : ");
        mat=giris.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fiz=giris.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kim=giris.nextInt();

        double ort=(fiz+kim+mat)/3;
        System.out.println("Not ortalaması : " + ort);

        System.out.println(ort > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
    }
}
