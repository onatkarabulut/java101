import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        int n ;
        double cevap=0.0;
        Scanner giris=new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n= giris.nextInt();

        for(int i=1 ; i<=n; i++){
            cevap=cevap + 1.0/i;
        }
        System.out.printf("Sonuc : "+ cevap);

        giris.close();
    }
}
