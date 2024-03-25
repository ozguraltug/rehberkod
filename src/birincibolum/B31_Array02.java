package birincibolum;

public class B31_Array02 {
    //  Örnek 1-a Bir int array olusturun ve elemanlarını yazdırın
    //  Örnek 1-b Bu dizinin 50 den büyük notlarını yazdırın
    public static void main(String[] args) {
        int [] notlar={25,50,60,45,75,95,35,80};

        System.out.println("Tüm notlar : ");
        for(int i:notlar){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("50 den büyük notlar : ");
        for(int i:notlar){
            if(i>50){
                System.out.print(i+" ");
            }
        }
        //Örnek 2 Verilen bir dizide maksnotu method kullanrak yazdırın
        System.out.println();
        System.out.print("Maksimum not : ");
        maksNotuYazdir(notlar);
    }

    public static void maksNotuYazdir(int [] dizi){ //{25,50,60,45,75,95,35,80}
        int maksNotu=dizi[0];
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>maksNotu){
                maksNotu=dizi[i];
            }
        }
        System.out.println(maksNotu);
    }


}
