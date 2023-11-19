package birincibolum;

public class B20_MethodCreation01 {
    /*
    public static int myFirstMethod(){}
    public static void myFirstMethod(){}

    public Access Modifier Erişim düzenleyici
    public
    protected
    default
    private

    static

    int,void return type

    method ismi
    () parametreler
    {} body

     */

    public static void main(String[] args) {
        System.out.println(toplamBul(5,3));

        toplamiYazdir(5,6);

        dersSonu();

    }

    private static void dersSonu() {
        System.out.println("Dersimiz bitmiştir. Bol bol alıştırma yapınız");
    }

    private static void toplamiYazdir(int sayi1, int sayi2) {
        System.out.println(sayi1+sayi2);
    }

    public static int toplamBul(int sayi1, int sayi2){
        int toplam=sayi1+sayi2;
        return toplam;
    }
}
