import java.util.Arrays;

public class Main {
    static int frekansBul(int [] arr, int deger, int indis){
        if (indis>=0){
            if (arr[indis]==deger){
                return 1+frekansBul(arr , deger, indis-1);
            }else{
                return 0+frekansBul(arr , deger, indis-1);
            }
        }
        return  0;
    }
    static  boolean isVarmi(int [] arr, int deger, int indis){
        if (indis<0) return false;
        for (int i=0;i<=indis;i++){
            if (arr[i]==deger) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int [] dizi={10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları ");
        for (int i=0;i< dizi.length;i++){
            if (!isVarmi(dizi,dizi[i],i-1)){
                System.out.printf("%d sayısı %d kere tekrar edildi.\n", dizi[i],frekansBul(dizi,dizi[i],dizi.length-1));
            }
        }
    }
}
