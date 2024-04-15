package birincibolum;

import java.util.ArrayList;
import java.util.List;

public class B34_ArrayList01 {
    /*
    Arraylist length i esnek olan bir arraydir
    ArrayListe niçin ihtiyaç duyulmuştur
    Arraylerin ekstraları nelerdir
    -belirli eleman sayısına sahip datalarda kullanırız
    -daha hızlı çalışır
    memory de daha az yer kaplar
*/
    public static void main(String[] args) {
        //arraylist nasıl declare edilir
        ArrayList<String>list1=new ArrayList<>();
        List<String>list2 =new ArrayList<>();//çoğunlukla tercih edilir
        // ArrayList<String>list3=new List<>(); sağ tarafta mutlaka ArrayList olmalı
        System.out.println(list1);
        //arrayliste eleman ekleme
        list1.add("Janali Süleymanov");
        list1.add("Aldemir Paşa"); //her eklenen sona eklenmiş olur
        list1.add(1,"rehberkod"); //indis verilirse o indise ekleme yapışabilir
        System.out.println(list1);
        list2.add("Red Kit");
        list2.add("Dül Dül");
        list2.add("Rin Tin Tin");
        System.out.println(list2);
        list1.addAll(1,list2);
        System.out.println(list1);
        System.out.println(list2.addAll(list1)); //true döner
        System.out.println(list2);
        //get methodu
        System.out.println(list1.get(0));
    }
}
