import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,N, R,nF=1,rF=1, nrF=1;
        Scanner giris=new Scanner(System.in);

        System.out.print("N değerini giriniz : ");
        N=giris.nextInt();

        System.out.print("r değerini giriniz : ");
        R=giris.nextInt();

        for(i=1;i<=N;i++){
            nF*=i;
        }
        for(i=1;i<=R;i++){
            rF*=i;
        }
        for(i=1;i<=(N-R);i++){
            nrF*=i;
        }
        System.out.printf("Kombinasyon = "+ nF / ( rF * nrF));
        giris.close();
    }
}
