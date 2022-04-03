import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner deger=new Scanner(System.in);
        System.out.println("Lütfen Baslangic degerini giriniz :");
        int baslama=deger.nextInt();
        System.out.println("Lütfen Bitis degerini giriniz :");
        int bitis=deger.nextInt();
        deger.close();
        System.out.println("\n\nAsal Sayılar :");
        if(baslama<2){
            baslama=2;
        }
        for(int i=baslama;i<=bitis;i++){
            int durum=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    durum=0;
                }
            }
            if(durum==1){
                System.out.print(i+" ");
            }
        }
    }
}
