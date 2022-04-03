import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        Scanner giris=new Scanner(System.in);

        System.out.printf("Doğduğunuz ay : ");
        ay=giris.nextInt();

        System.out.printf("Doğduğunuz gün : ");
        gun=giris.nextInt();

        switch (ay){
            case 1:
                if (gun>21){
                    System.out.printf("KOVA");
                }else{
                    System.out.printf("OĞLAK");
                }
                break;
            case 2:
                if (gun>19){
                    System.out.printf("BALIK");
                }else{
                    System.out.printf("KOVA");
                }
                break;
            case 3:
                if (gun>20){
                    System.out.printf("KOÇ");
                }else{
                    System.out.printf("BALIK");
                }
                break;
            case 4:
                if (gun>20){
                    System.out.printf("BOĞA");
                }else{
                    System.out.printf("KOÇ");
                }
                break;
            case 5:
                if (gun>21){
                    System.out.printf("İKİZLER");
                }else{
                    System.out.printf("BOĞA");
                }
                break;
            case 6:
                if (gun>22){
                    System.out.printf("YENGEÇ");
                }else{
                    System.out.printf("İKİZLER");
                }
                break;
            case 7:
                if (gun>22){
                    System.out.printf("ASLAN");
                }else{
                    System.out.printf("YENGEÇ");
                }
                break;
            case 8:
                if (gun>22){
                    System.out.printf("BAŞAK");
                }else{
                    System.out.printf("ASLAN");
                }
                break;
            case 9:
                if (gun>22){
                    System.out.printf("TERAZİ");
                }else{
                    System.out.printf("BAŞAK");
                }
                break;
            case 10:
                if (gun>22){
                    System.out.printf("AKREP");
                }else{
                    System.out.printf("TERAZİ");
                }
                break;
            case 11:
                if (gun>21){
                    System.out.printf("YAY");
                }else{
                    System.out.printf("AKREP");
                }
                break;
            case 12:
                if (gun>21){
                    System.out.printf("Oğlak");
                }else{
                    System.out.printf("Yay");
                }
                break;
        }
    }
}
