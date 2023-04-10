package birincibolum;

public class B14_StringManupilations04 {
    public static void main(String[] args) {
        //length()
String str1="Merhaba Java";
String str2="";
String str3=null;
        //System.out.println(str1+" kelimesindeki karakter sayısı "+str1.length());
       // System.out.println("str2 deki karakter sayısı "+str2.length());
        //System.out.println(str3.length());

        //indexOf()
        String str="Çalışırsak Java Öğrenmek çok kolay";
        //char olarak index sorgulama
        //System.out.println(str.indexOf('a'));
        //karakter olarak index sorgulama
        //System.out.println(str.indexOf("l"));
        //olmayan karakter sorgulanırsa
        //System.out.println(str.indexOf("i"));
        //kelime olarak sorgulama
        //System.out.println(str.indexOf("Java"));
        //belli bir indexten sonrası için sorgulama
        //System.out.println(str.indexOf("a",11));

        //lastIndexOf()
        //char olarak index sorgulama
        //System.out.println(str.lastIndexOf('a'));
        //karakter olarak index sorgulama
        //System.out.println(str.lastIndexOf("y"));
        //olmayan karakter sorgulanırsa
        //System.out.println(str.lastIndexOf("i"));
        //kelime olarak sorgulama
        //System.out.println(str.lastIndexOf("kolay"));
        //belli bir indexten sonrası için sorgulama
        System.out.println(str.lastIndexOf("a",29));

    }
}
