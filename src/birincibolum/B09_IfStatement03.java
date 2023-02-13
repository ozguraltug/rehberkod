package birincibolum;

import java.util.Scanner;

public class B09_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen ünvanınızı giriniz");
            String JobTitle=scan.nextLine().toLowerCase();
         /*   if(JobTitle.equals("qa")){
                System.out.println("İşiniz Quality Analyst");
            }
            else if(JobTitle.equals("dev")){
                System.out.println("İşiniz developer");
            }
            else if(JobTitle.equals("ba")){
                System.out.println("İşiniz Business Analyst");
            }
            else if(JobTitle.equals("pm")){
                System.out.println("İşiniz Project Manager");
            }
            else {
                System.out.println("Lütfen geçerli bir ünvan giriniz");
            }
*/
            switch(JobTitle){
                case "qa":
                    System.out.println("İşiniz Quality Analyst");
                    break;

                case "dev":
                    System.out.println("İşiniz  developer");
                    break;
                case "ba":
                    System.out.println("İşiniz Business Analyst");
                    break;
                case "pm":
                    System.out.println("İşiniz Project Manager");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir ünvan giriniz");
                    break;

            }
        }

}
