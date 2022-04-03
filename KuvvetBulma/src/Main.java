import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazın
        int deger;
        Scanner giris=new Scanner(System.in);

        System.out.print("Bir değer giriniz : ");
        deger=giris.nextInt();
        for (int i=0;i<=deger;i++){
            if ( i%4==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
