package birincibolum;

import java.util.Scanner;

public class B22_ForLoop {
    /*
    Javada for döngüsü, belirli bir koşul sağlandığında bir dizi işlemin yürütülmesini sağlar

    syntax:
    for(başlangıç değeri;koşul;artış değeri){
    döngü içinde yapılması gereken işlemler}
     */
    public static void main(String[] args) {
//        Soru 1 ) Ekrana 10 kez “Java güzeldir.” yazdirin
//        Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
//        Soru 3) 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin
//        Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
//        kati olan sayilari yazdirin.
//        Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
//        veya 5”in kati olan sayilari yazdirin

 /*       for(int i=1;i<=10;i++){
            System.out.println("Java güzeldir.");
        }

        for(int i=10;i<=30;i++){
            System.out.print(i);
            if(i<30){
                System.out.print(",");
            }
        }



        for(int i=100;i>=50;i--){
            System.out.print(i);
            if(i>50){
                System.out.print(",");
            }
        }


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 100 den küçük bir tam sayı giriniz...");
        int sayi=scan.nextInt();
        for(int i=1;i<=sayi/3;i++){
            System.out.print(i*3);
            if(i<sayi/3){
                System.out.print("-");
            }
        }

  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 100 den küçük bir tam sayı giriniz...");
        int sayi=scan.nextInt();
        for(int i=1;i<=sayi;i++){
            if(i % 3==0 || i % 5==0){
                System.out.print(i+" ");
            }
        }
    }
}
