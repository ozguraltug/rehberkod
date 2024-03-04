package birincibolum;

import java.util.Scanner;

public class B28_DoWhileLoop01 {
    /*
    syntax:
    do { code } while(condition)
     */
    public static void main(String[] args) {
//        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz
//        int i=5;
//        do {
//            System.out.println(i);
//            i--;
//        }
//        while(i>2);
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini
        //soyleyin.
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin
        //toplaminin kac oldugunu yazdirin
        Scanner scan=new Scanner(System.in);

        int toplamPozitifSayi=0;
        int pozitifSayiAdeti=0;
        System.out.println("Lütfen toplanmasını istediğiniz pozitif sayıları giriniz. (Çıkmak istediğinizde 0'a basınız");
        int girilenSayi;
        do{
            girilenSayi=scan.nextInt();

            if(girilenSayi > 0 ){
                toplamPozitifSayi+=girilenSayi;
                pozitifSayiAdeti++;
            }else if(girilenSayi < 0 ){
                System.out.println("Girilen sayı negatif bir sayı. Lütfen pozitif bir sayı giriniz. ");
            }
        } while(girilenSayi != 0);

        System.out.println("Girdiğiniz pozitif sayıların sayısı : "+pozitifSayiAdeti);
        System.out.println("Girdiğiniz sayıların toplamı : "+toplamPozitifSayi);
    }
}
