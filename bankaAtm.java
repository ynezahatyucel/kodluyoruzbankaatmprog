package Giris;
import java.util.Scanner;

public class bankaAtm {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String kullaniciAdi,parola;
        int ghakki=3,secim,bakiye=1500,pMiktari;

        while (ghakki>0){

        System.out.println("Kullanıcı adını giriniz : ");
        kullaniciAdi=input.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        parola=input.nextLine();

        if (kullaniciAdi.equals("yesim") && parola.equals("1345y")) {
            System.out.println("Sisteme giriş yaptınız.");
            do {
                System.out.println("Yapmak istediğiniz işlemi seçiniz :" +
                        "\n1-Para yatırma" +
                        "\n2-Para çekme " +
                        "\n3-Bakiye Sorgulama" +
                        "\n4-Çıkış");
                secim = input.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz :");
                        pMiktari = input.nextInt();
                        System.out.println("İşleminiz başarıyla gerçekleşti");
                        bakiye += pMiktari;
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiz tutarı giriniz : ");
                        pMiktari = input.nextInt();
                        if (pMiktari > bakiye) {
                            System.out.println("Yanlış Tutar girdiniz.");

                        } else {
                            System.out.println( "İşleminiz başarıyla gerçekleşmiştir");
                            bakiye -= pMiktari;
                            break;
                        }

                    case 3:
                        System.out.print(bakiye + "Bakiyeniz");
                        break;
                }
            }while (secim != 4);
            System.out.println("Tekrsr görüşmek üzere.");
                    break;
                }else {
            ghakki--;
            System.out.println("Yanlış giriş yaptınız.");
            System.out.println("Tekrar deneyiniz.Kalan hakkınız"+ ghakki);
        }
        }
        if (ghakki==0){
            System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz.");
        }else {
            System.out.println("kalan hakkınız "+ghakki);
        }
}}
