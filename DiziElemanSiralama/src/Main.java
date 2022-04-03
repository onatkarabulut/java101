import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void sirala(int [] arr, int indis){
        if(indis>0 && arr[indis]<arr[indis-1]){
                int temp=arr[indis-1];
                arr[indis-1]=arr[indis];
                arr[indis]=temp;
                sirala(arr, indis-1);
        }
    }

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        System.out.print("Eleman Sayısını giriniz : ");
        int elemanSayisi=giris.nextInt();

        int [] dizi=new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.printf("Dizinin %d. elemanını giriniz : ",i+1);
            dizi[i]=giris.nextInt();
            sirala(dizi, i);
        }
        System.out.println("Sıralı Dizi : "+ Arrays.toString(dizi));




    }
}
