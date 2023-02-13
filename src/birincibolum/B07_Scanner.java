package birincibolum;


import java.util.Scanner;

public class B07_Scanner {




    public static void main(String[] args) {
               /*
    Soru 1.kullaniciya ad, su anki konumu, yas, boy soran bir program olusturun,
    ve yasadiklari yeri seviyorlar mı sorusunu sorup aldığınız
    bu bilgileri ekrana yazdirin
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adınızı giriniz ");
        String isim=scan.nextLine();
        System.out.println("Şuan neredesiniz ? ");
        String konum=scan.nextLine();
        System.out.println("Lutfen yaşınızı giriniz ");
        int yas=scan.nextInt();
        System.out.println("Boyunuzu giriniz ");
        double boy=scan.nextDouble();
        System.out.println("Yaşadığınız yeri seviyor musunuz true/false");
        boolean seviyorMu=scan.nextBoolean();
        System.out.println("Adınız : "+isim+
                "\n konumunuz : "+konum+
                "\n yaşınız : "+yas+
                "\n boyunuz : "+boy+
                "\n seviyor mu :"+seviyorMu);

            /*Soru 2.
     kullanicidan 2 tam sayi alin ve bu tam sayilarin toplayip, sonucu ekrana yazdirin
     */
        System.out.println("Lutfen birinci sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz ");
        int sayi2= scan.nextInt();
        System.out.println("Girdiğiniz sayıların toplamı :"+(sayi1+sayi2));
    }
}
