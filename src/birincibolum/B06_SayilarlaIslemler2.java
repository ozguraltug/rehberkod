package birincibolum;

public class B06_SayilarlaIslemler2 {
    /*  Soru 2:

        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
        */

    public static void main(String[] args) {
        int gallon=100;
        double litre=gallon*3.785;
        String sonuc1=gallon+" gallon değeri  "+litre+" litreye eşittir.";
        System.out.println(sonuc1);

        int l=1000;
        double g=l/3.785;
        String sonuc2=l+" litre değeri "+g+" gallona eşittir.";
        System.out.println(sonuc2);

        double f=100;
        double c=(f-32)*5/9;
        System.out.println(f+" fahrenayt "+c+" santigrat dereceye eşittir.");
    }

}
