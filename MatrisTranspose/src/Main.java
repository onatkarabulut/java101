import java.util.Arrays;

public class Main {
    public static void matrisYazdir(int [][] arr){
        for (int [] satir: arr){
            for (int sutun:satir){
                System.out.print(sutun + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int [][] matris= {{2,3,4},{5,6,4}};
        int [][] transpose=new int[3][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                transpose[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris");
        matrisYazdir(matris);
        System.out.println("Matris Transpose");
        matrisYazdir(transpose);


    }
}
