import java.util.Arrays;

public class Main {
    static boolean isFind(int [] arr, int value){
        for (int i:arr){
            if(i==value) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list ={3,7,3,2,2,4,5,6,8,70,4,5,6,8,10,1,0};
        int [] sonuc=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if ((i!=j) && (list[i]==list[j]) && (list[i]%2==0) && !isFind(sonuc, list[i])){
                    sonuc[startIndex++]= list[i];
                 }
            }
        }
        System.out.println(Arrays.toString(sonuc));
    }

}
