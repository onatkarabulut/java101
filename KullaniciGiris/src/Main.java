import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // patika java123
        String kullaniciAdi,sifre,yeniSifre;
        int onay;
        Scanner giris=new Scanner(System.in);

        System.out.print("Kullanici adini giriniz :");
        kullaniciAdi=giris.nextLine();

        System.out.print("Sifrenizi giriniz :");
        sifre=giris.nextLine();

        if (kullaniciAdi.equals("patika")){
            if (sifre.equals("java")){
                System.out.println("Başarılı giriş yapıldı.");
            }else{
                System.out.println("Kullanıcı adı veya şifre hatalı. Şifre sıfırlamak ister misiniz?");
                System.out.println("0: HAYIR | 1 : EVET");
                onay=giris.nextInt();
                if (onay==1){
                    System.out.println("Yeni Sifrenizi giriniz :");
                    Scanner sc =new Scanner(System.in);
                    yeniSifre=sc.nextLine();
                    if (yeniSifre.equals("java")){
                        System.out.println("Şifre değiştirelemedi. Yeni şifre giriniz.");
                    }else{
                        System.out.println("Şifre başarılı bir şekilde değiştirildi.");
                    }

                }
            }
        }

    }
}
