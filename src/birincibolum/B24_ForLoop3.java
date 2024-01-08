package birincibolum;

import java.util.Scanner;

public class B24_ForLoop3 {
    //Soru 1: Kullanıcıdan bir string ifade isteyin ve bunu tersten yazdırın
    //Soru 2: Verilen bir stringin palindrom olup olmadığını kontrol ediniz
    //Soru 3: Verilen bir string ifade de küçük harfleri ekrana yazdırın

    public static void main(String[] args) {
        String str="";
        Scanner scan=new Scanner(System.in);

     /*   System.out.println("Lütfen tersini görmek istediğiniz ifadeyi giriniz...");
        String tersKelime=scan.nextLine();

        for(int i=tersKelime.length()-1;i>=0;i--){
            str=str+tersKelime.substring(i,i+1);
        }
        System.out.println(tersKelime+" ifadesinin tersi: "+str);


        System.out.println("Lütfen palindrom olup olmadığını test etmek istediğiniz ifadeyi giriniz...");
        String palindromKelime=scan.nextLine();
        for(int i=palindromKelime.length()-1;i>=0;i--){
            str=str+palindromKelime.substring(i,i+1);
        }
        if(palindromKelime.equals(str)){
            System.out.println(palindromKelime+" ifadesi palindromdur...");
        }
        else{
            System.out.println(palindromKelime+" ifadesi palindrom değildir...");
        }
        */
        System.out.println("Lütfen küçük harfle leyazılmasını istediğiniz ifadeyi giriniz...");
        String kucukHarfler=scan.nextLine();
        for(int i=0;i<=kucukHarfler.length()-1;i++){
            char ch=kucukHarfler.charAt(i);
            if(ch>='a' && ch<='z'){
                str=str+ch;
            }

        }
        System.out.println(str);
    }
}
