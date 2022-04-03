import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner giris=new Scanner(System.in);

        System.out.printf("Birinci sayıyı giriniz :");
        a=giris.nextInt();
        System.out.printf("İkinci sayıyı giriniz :");
        b=giris.nextInt();
        System.out.printf("Ücüncü sayıyı giriniz :");
        c=giris.nextInt();

        if (b<a && b<c){
            if (a<c){
                System.out.printf(" Sirala  : %d < %d < %d",b,a,c);
            }else{
                System.out.printf(" Sirala  : %d < %d < %d",b,c,a);
            }
        }else if(c<a && c<b){
            if (a<b){
                System.out.printf(" Sirala  : %d < %d < %d",c,a,b);
            }else{
                System.out.printf(" Sirala  : %d < %d < %d",c,b,a);
            }
        }else{
            if (b<c){
                System.out.printf(" Sirala  : %d < %d < %d",a,b,c);
            }else{
                System.out.printf(" Sirala  : %d < %d < %d",a,c,b);
            }
        }

    }
}
