package birincibolum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B35_ArrayList02 {
    public static void main(String[] args) {
        //bir list oluşturalım
        List<String> ninjaTurtles=new ArrayList<>();
        ninjaTurtles.add("Donatello");
        ninjaTurtles.add("Leonardo");
        ninjaTurtles.add("Rafael");
        ninjaTurtles.add("Michelangelo");
        ninjaTurtles.add("usta");
        System.out.println(ninjaTurtles);

        //set methodu- bir elemanın yerine başka elemanı ayarlama
        //usta yerine Usta Splinter yazdıralım
       // ninjaTurtles.set(4,"Usta Splinter");

        //indexOf methodu
        int temp=ninjaTurtles.indexOf("usta");
        ninjaTurtles.set(temp,"Usta Splinter");
        System.out.println(ninjaTurtles);

        //remove
        System.out.println(ninjaTurtles.remove(4));
        System.out.println(ninjaTurtles.remove("Donatello")); //true
        System.out.println(ninjaTurtles);
        System.out.println(ninjaTurtles.remove("Donatello")); // false
        System.out.println(ninjaTurtles);
        //System.out.println(ninjaTurtles.remove(4)); //IndexOutOfBounsException

        //List sayılardan oluşursa indexOf sayıyı nasıl algılar
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);
        System.out.println(sayilar.remove(2));
        System.out.println(sayilar.remove("2"));
        System.out.println(sayilar);
        //bu şekilde silme eylemi gerçekleştirmek istiyorsak,
        Integer sil=2;
        sayilar.remove(sil);
        System.out.println(sayilar);

        //contains methodu
        System.out.println(ninjaTurtles.contains("Rafael"));//true
        System.out.println(ninjaTurtles.contains("Donatello"));//false
        ninjaTurtles.add("Donatello");
        List<String> ninjaTakim =new ArrayList<>();
        ninjaTakim.addAll(ninjaTurtles);
        ninjaTakim.add("Splinter");
        ninjaTakim.add("April");
        System.out.println(ninjaTakim.containsAll(ninjaTurtles));//true

        //sort methodu
        System.out.println(ninjaTakim);
        Collections.sort(ninjaTakim); //natural doğal sıralama yapar
        System.out.println(ninjaTakim);

        //equals
        System.out.println(ninjaTurtles);
        ninjaTakim.remove("April");
        ninjaTakim.remove("Splinter");
        System.out.println(ninjaTakim);
        System.out.println(ninjaTurtles.equals(ninjaTakim));//false
        Collections.sort(ninjaTurtles);
        System.out.println(ninjaTurtles.equals(ninjaTakim));

        //array den list yapma
        Integer [] arr={1,1,2,3,5,8,13,21,34,55,89};
        ArrayList<Integer> fib=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            fib.add(arr[i]);
        }
        System.out.println(fib);


    }
}
