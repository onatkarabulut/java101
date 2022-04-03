import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, islem;
        Scanner giris=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        x=giris.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        y=giris.nextInt();

        System.out.print("İşleminiz (1: Topla | 2: Cikarma | 3: Çarpma | 4: Bölme) : ");
        islem=giris.nextInt();
        switch (islem){
            case 1:
                System.out.printf("%d + %d = %d",x,y,x+y);
                break;
            case 2:
                System.out.printf("%d - %d = %d",x,y,x-y);
                break;
            case 3:
                System.out.printf("%d * %d = %d",x,y,x*y);
                break;
            case 4:
                if (y==0){
                    System.out.printf("Sıfıra bölünemez. ");
                }else {
                    System.out.printf("%d / %d = %d", x, y, x / y);
                }
                break;
        }



    }
}
