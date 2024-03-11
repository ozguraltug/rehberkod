package birincibolum;

import java.util.Random;
import java.util.Scanner;

public class B29_DoWhileLoop02 {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
        Scanner scan= new Scanner(System.in);
        Random random =new Random();

        //0 ile 100 arasında rastgele bir sayı üretelim
        int rastgeleSayi=random.nextInt(101);

        //Kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayaç oluşturalım
        int denemeSayisi=0;

        //Kullanıcının yaptığı tahmini değişken içinde saklayalım
        int tahminEdilen;

        //Kullanıcının tahmini doğrumu
        boolean tahminDogrumu=false;

        //Oyunun açıklamasını ekrana yazdıralım
        System.out.println("0 ile 100 arasında bir tam sayı seçtim.");

        //Doğru tahmin yapılıncaya kadar çalışacak döngü
        do {
            System.out.println("Sayıyı tahmin edin");
            tahminEdilen=scan.nextInt();
            //sayacı 1 arttıralım
            denemeSayisi++;
            if(tahminEdilen < rastgeleSayi){
                System.out.println("Seçtiğim sayı daha büyük.");
            }else if(tahminEdilen > rastgeleSayi){
                System.out.println("Seçtiğim sayı daha küçük.");
            } else {
                System.out.println("Tebrikler, Seçtiğim sayıyı bildiniz.");
                System.out.println("Deneme Sayısı : "+denemeSayisi);
                tahminDogrumu=true;
            }
        } while (!tahminDogrumu);
        //scanner objesini kapattık
        scan.close();
    }
}
