import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz :");
        int adet=tara.nextInt();
        int deger1=0;
        int deger2=1;
        System.out.print(deger1+" "+deger2);
        for (int i=0;i<= adet;i++){
            int deger3=deger1+deger2;
            System.out.print(" "+deger3);
            deger1=deger2;
            deger2=deger3;
        }
    }
}
