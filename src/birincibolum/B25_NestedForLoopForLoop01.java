package birincibolum;

import java.util.Scanner;

public class B25_NestedForLoopForLoop01 {
    public static void main(String[] args) {
              /*Örnek 1 Ekrana aşaüıdak çıktıyı yazdırınız
                  (1,1),(1,2),(1,3,)(1,4),
                  (2,1),(2,2),(2,3),(2,4),
                  (3,1),(3,2),(3,3),(3,4),
                  (4,1),(4,2),(4,3),(4,4)

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=4 ; j++) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();

        }
        */

           /*
    Örnek 2
            Asagida gordugunuz sekli istenen satır ve sütunda ekran yazdırın

              * * * *
              * * * *
              * * * *
              * * * *

        System.out.println("--------2.Örnek----------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz şeklin satır sayısını giriniz");
        int satirSayisi=scan.nextInt();
        System.out.println("Lütfen oluşturmak istediğiniz şeklin sütun sayısını giriniz");
        int sutunSayisi=scan.nextInt();
        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
*/
                /*
        Örnek 3 Aşağıdaki şekli konsola yazzdırınız
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        System.out.println("----------3.Örnek-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}
