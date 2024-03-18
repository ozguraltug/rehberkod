package birincibolum;

import java.util.Arrays;

public class B30_Array01 {
    /*
    1-Çoklu data saklamaya izin veren yapılardır.
    2-Array ler non-primitive data türündedir
    3-Array içine tek bir data type i depolanır
    4-Array oluşturmak için
        i)Data type ii)Data sayısı
    5- Array ler diğer collectionlardan hızlıdır çünkü boyutları sabittir
     */

    public static void main(String[] args) {
        //Array oluşturalım
        String[] ogrenciAdlari = new String[4];
        // System.out.println(ogrenciAdlari); //@1b0375b3 bellekteki adresi yazdırdı
        // System.out.println(Arrays.toString(ogrenciAdlari));
        ogrenciAdlari[0] = "Red Kit";
        ogrenciAdlari[1] = "Dül Dül";
        ogrenciAdlari[2] = "Rin Tin Tin";
        System.out.println(Arrays.toString(ogrenciAdlari));

        int [] notlar = {50,80,90,100};
        System.out.println(Arrays.toString(notlar));
        System.out.println(notlar[2]);

    }
}
