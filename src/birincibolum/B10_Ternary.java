package birincibolum;
/*
sart ? dodruIseYapilacaklar :  yanlisIseYapilacaklar;

Ornek 1. Ternary kullanarak verilen saat 18 den once ise Iyi gunler,
sonra ise iyi aksamlar diyen bir program yaziniz

Ornek 2. Ternary kullanarak verilen saat 12 den once ise günaydin,
12-18 arasi ise iyi gunler, 18 den sonra ise iyi aksamlar diyen bir program yaziniz.

 */
public class B10_Ternary {
    public static void main(String[] args) {

        int time=21;
      /*  String message= time<18 ? "İyi günler" : "İyi akşamlar";
        System.out.println(message);
       */
       String message= (time<12) ? "Günaydın":(time<18) ? "İyi günler" : "İyi akşamlar";
        System.out.println(message);

    }

}
