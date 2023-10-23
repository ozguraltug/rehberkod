package birincibolum;

import java.util.Scanner;

public class B15_StringManipulations05 {
    //contains methodu
    //endsWith methodu
/*    Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
    icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email adresiniz
    kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

 */
    public static void main(String[] args) {
//        System.out.println("Lütfen mail adresinizi giriniz");
        System.out.println("Lütfen bir cümle giriniz");
        Scanner scan=new Scanner(System.in);
//        String mail=scan.nextLine();
//        if(!mail.contains("@gmail.com")){
//            System.out.println("Lütfen gmail adresinizi giriniz");
//        }
//        else if(mail.endsWith("@gmail.com")){
//            System.out.println("Email adresiniz kaydedildi");
//        }
//        else {
//            System.out.println("Lütfen mailinizi tekrar kontrol ediniz");
//        }

        /*  Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
    cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
    yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
    yazdirin.

   */
        String cumle=scan.nextLine();
        if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }
        else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }
        else {
            System.out.println("Cumle kucuk ya da buyuk kelimesi içermiyor");
        }
    }

}
