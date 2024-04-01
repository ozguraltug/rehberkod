package birincibolum;

import java.util.Arrays;
import java.util.Scanner;

public class B32_Array03 {
    public static void main(String[] args) {
        //length
        int[] notlar = {15, 25, 34, 67, 76, 80, 90, 100, 55, 65, 34};
        System.out.println(notlar.length);

        //Array in bir elemanının değiştirilmesi
        notlar[0] = 30;
        System.out.println(Arrays.toString(notlar));

        //Arrayin sıralanması-sort
        Arrays.sort(notlar);
        System.out.println(Arrays.toString(notlar));

        //eleman arama binary search
        System.out.println(Arrays.binarySearch(notlar, 90));
        System.out.println(Arrays.binarySearch(notlar, 99));

        //split
        String str = "Java ile herşey çok güzel.";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        //Kullanıcıdan alınan bilgilerle dizi oluşturun
        System.out.println("Lütfen kaç öğrenci gireceğinizi yazınız.");
        Scanner scan=new Scanner(System.in);
        int uzunluk=scan.nextInt();
        scan.nextLine();
        String [] ogrenciList=new String[uzunluk];
        for (int i=0;i<uzunluk;i++){
            System.out.println((i+1)+". öğrenci ismini giriniz");
            ogrenciList[i]=scan.nextLine();
        }

        System.out.println("Öğrenci Listeniz "+Arrays.toString(ogrenciList));
    }
}
