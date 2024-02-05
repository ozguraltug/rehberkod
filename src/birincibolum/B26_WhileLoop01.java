package birincibolum;

import java.util.Scanner;

public class B26_WhileLoop01 {
    public static void main(String[] args) {
        //while loop syntax
        // while(condition){  çalışmasını istediğimiz kodlar }
        //Örnek 1: 5 den 25 e kadar olan tek sayıları ekrana yazdırınız.
        System.out.println("-----Örnek 1-----------");
        int sayi=5;
        while(sayi<=25){
            if(sayi%2==1){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
        //Ornek 2:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.
        //      3 ==> 3x1=3
        //            3x2=6
        //            3x3=9
        //            3x4=12 …
        //            3x10=30*/

     /*   System.out.println();
        System.out.println("---------Örnek 2 Çarpım Tablosu-----------");
        Scanner scan=new Scanner(System.in);
        int sayi1=scan.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(sayi1+" x "+i+" = "+sayi1*i);
            i++;
        }
*/
        //Örnek 3 Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin
        System.out.println();
        System.out.println("-------Örnek 3--------");
        System.out.println("Lütfen pozitif tam bölenlerini öğrenmek istediğiniz sayıyı giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi2= scan.nextInt();
        int toplamBolenSayisi=0;
        int bolen=1;
        System.out.println(sayi2+ " sayısının tam bölenleri : ");
        System.out.println();
        while(bolen<=sayi2){
            if(sayi2%bolen==0){
                System.out.print(bolen+" ");
                toplamBolenSayisi++;
            }
            bolen++;
        }
        System.out.println();
        System.out.println(sayi2+" sayısının pozitif tam bölen sayısı : "+toplamBolenSayisi);
    }
}
