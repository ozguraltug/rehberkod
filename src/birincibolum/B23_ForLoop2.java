package birincibolum;

import java.util.Scanner;

public class B23_ForLoop2 {
        /*  Soru 1 : Kullanıcıdan bir tam sayı girmesini isteyin ve 1 den o sayıya kadar
    sayıların toplamını bulunuz

    Soru 2 : Kullanıcıdan bir tam sayı girmesini isteyin 1 den o sayıya kadar tek
    sayıların toplamını bulunuz.

    Soru 3: Kullanıcıdan bir sayı girmesini isteyin ve o sayının faktoriyelini hesaplayınız
      */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir tam sayı giriniz...");
            int sayi = scan.nextInt();
            int toplam = 0;
            long faktoriyel=1;
//            for(int i=1;i<=sayi;i++){
//                toplam+=i;
//            }
//            System.out.println("Girdiğiniz sayıya kadar olan sayıların toplamı : "+toplam);
//

//            for(int i=1;i<=sayi;i++){
//                if(i%2==1){
//                    toplam+=i;
//                }
//            }
//            System.out.println("Girdiğiniz sayıya kadar tek sayıların toplamı : "+toplam);
            for(int i=1;i<=sayi;i++){
                faktoriyel*=i;
            }
            System.out.println("Girdiğiniz sayının faktoriyeli : "+faktoriyel);
        }


}
