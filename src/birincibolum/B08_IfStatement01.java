package birincibolum;

import java.util.Scanner;

public class B08_IfStatement01 {

    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Y/N seçeneklerinden birini seçiniz");
        char karakter=scan.next().charAt(0);
        if(karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        } else if(karakter=='N' || karakter=='n'){
            System.out.println("NO");
        }
        else {
            System.out.println("Yanlış seçim yaptınız. Y veya N den birini seçmeliydiniz.");
        }
    }
}
