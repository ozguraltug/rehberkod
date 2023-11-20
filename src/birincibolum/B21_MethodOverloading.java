package birincibolum;

public class B21_MethodOverloading {
    /*
    Overloading nedir :Eğer bir class ta aynı isimde fakat parametre sayısı veya tipleri
    farklı metot oluşturmaya overloading denir.
     */
    public static void main(String[] args) {
        System.out.println("Toplam 1 : "+topla(5,10));
        System.out.println("Toplam 2 : "+topla(5,10,15));
        System.out.println("Toplam 3 : "+topla(2.5,3.5));
        System.out.println("Toplam 4 : "+topla(2.5,3.5,3));
    }
    public static int topla(int a, int b){
        return a+b;
    }

    public static int topla(int a, int b, int c){
        return a+b+c;
    }

    public static double topla(double a, double b){
        return a+b;
    }

    public static double topla(double a, double b, double c){
        return a+b+c;
    }
}
