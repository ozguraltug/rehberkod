package birincibolum;

import java.util.Scanner;

public class B09_IfStatement02 {
         /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int not=scan.nextInt();

        if(not>=90 && not<=100){
            System.out.println("Notunuz : A");
        }
        else if(not>=80 && not<90){
            System.out.println("Notunuz B");
        }
        else if(not>=70 && not<80){
            System.out.println("Notunuz C");
        }
        else if(not>=60 && not<70){
            System.out.println("Notunuz D");
        }
        else if(not>=0 && not<60){
            System.out.println("Notunuz : F");
        }else{
            System.out.println("Lütfen geçerli bir not giriniz");
        }
    }
}
