import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, u, alan;
        Scanner giris= new Scanner(System.in);

        System.out.print("1. kenar uzunluğunu giriniz : ");
        a= giris.nextFloat();

        System.out.print("2. kenar uzunluğunu giriniz : ");
        b= giris.nextFloat();

        c=Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs uzunluğu : " + c);

        u=(a+b+c)/2;

        System.out.println("Çevre Uzunluğu : " + u*2);
        alan=u*(u-a)*(u-b)*(u-c);

        alan=Math.sqrt(alan);
        System.out.println("Alan : " + alan);


    }
}
