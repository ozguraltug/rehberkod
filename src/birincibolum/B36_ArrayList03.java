package birincibolum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class B36_ArrayList03 {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */
    public static void main(String[] args) {
        List<String>listSirinler=new ArrayList<>();
        listSirinler.add("Şirin Baba");
        listSirinler.add("Şirine");
        listSirinler.add("Şakacı Şirin");
        listSirinler.add("Gözlüklü Şirin");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanılan kullanıcı isimleri : "+listSirinler);
        System.out.println("Yeni bir kullanıcı girmek istiyor musunuz E/H");
        Character cevap=scan.nextLine().toLowerCase().charAt(0);
        while(cevap=='e'){
            System.out.println("Kullanmak istediğiniz kullanıcı adını giriniz");
            String userName=scan.nextLine().trim();
            boolean userNameVarmi=listSirinler.contains(userName);
            if(userNameVarmi){
                System.out.println("İstediğiniz kullanıcı adı kullanımda ");
                int randomSayi=new Random().nextInt(100);
                userName=userName+randomSayi;
                System.out.println(userName+" olarak kullanıcı adını kullanmak ister misiniz? E/H");
                cevap=scan.nextLine().toLowerCase().charAt(0);
                if(cevap=='e'){
                    listSirinler.add(userName);
                    System.out.println("Kullanıcı adınız eklendi. Tüm kullanıcılar : "+listSirinler);
                }

            }
            else{
                System.out.println("İstediğiniz kullanıcı adı müsait. Listeye eklendi");
                listSirinler.add(userName);
            }
            System.out.println("Tüm kullanıcılar "+listSirinler);
            System.out.println("Yeni bir kullanıcı ismi eklemek ister misiniz? E/H");
            cevap=scan.nextLine().toLowerCase().charAt(0);
        }
    }
}
