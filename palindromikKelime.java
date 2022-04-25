import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        System.out.println("Kelimeyi giriniz: ");
        Scanner input=new Scanner(System.in);
        String kelime=input.nextLine();
        int length=kelime.length();
        String kelimenintersi="";
        int i=length-1;
        String[] harfler=kelime.split("");
        while(i>=0){
            kelimenintersi=kelimenintersi+harfler[i];
            i--;
        }
        if (kelime.equals(kelimenintersi))
            System.out.println("Girdiğiniz kelime palindromiktir.");
        else
            System.out.println("Girdiğiniz kelime palindromik değildir.");
    }
