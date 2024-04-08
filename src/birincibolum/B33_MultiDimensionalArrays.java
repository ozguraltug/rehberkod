package birincibolum;

import java.util.Arrays;

public class B33_MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] sayilar={{0},{1,2,3},{4,5},{6,7,8,9}};
        //int [][] dizi=new int [4][2];

        System.out.println(sayilar[1]);//[I@1b0375b3
        System.out.println(Arrays.toString(sayilar[1]));//[1, 2, 3]
        System.out.println(sayilar[1][0]);
        System.out.println(Arrays.toString(sayilar));//[[I@2f7c7260, [I@1b0375b3, [I@2d209079, [I@6bdf28bb]
        System.out.println(Arrays.deepToString(sayilar));//[[0], [1, 2, 3], [4, 5], [6, 7, 8, 9]]

        //verilen dizinin tüm elemanlarını yazdıran bir method yazalım
        elemanlariYazdir(sayilar);

        //bu dizinin elemanlarından çift olanların toplamını yazınız
        System.out.println();
        int toplam=0;
        for(int i=0;i<sayilar.length;i++){
            for(int j=0;j<sayilar[i].length;j++){
                if(sayilar[i][j]%2==0){
                    toplam+=sayilar[i][j];
                }
            }
        }
        System.out.println("Dizideki çift sayıların toplamı : "+toplam);
    }

public static void elemanlariYazdir(int [][] dizi){
        for(int i=0;i<dizi.length;i++){ //i 0,1,2,3
            for(int j=0;j<dizi[i].length;j++){ //inner arraylerin uzunluğunu aldık
                System.out.print(dizi[i][j]+" ");
            }

        }
}
}
