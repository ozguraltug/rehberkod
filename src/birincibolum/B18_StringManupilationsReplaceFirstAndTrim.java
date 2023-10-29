package birincibolum;

public class B18_StringManupilationsReplaceFirstAndTrim {
        /*
replaceFirst()
Verilen String’deki istenen karakter(ler)in ilkini, istenen yeni karakter(ler) ile degistirir

trim()
Istedigimiz String’in basinda veya sonunda var olan bosluk / “space” leri temizler
     */
        public static void main(String[] args) {
//            String str1="Java'da rakamlar 1234567890";
//            System.out.println(str1.replaceFirst("a","*"));
//            System.out.println(str1.replaceFirst("lar","*"));
//            System.out.println(str1.replaceFirst("\\s","*"));
//            System.out.println(str1.replaceFirst("\\D","*"));

            String str2=" Java öğrenmek çok güzel.   ";
            System.out.println(str2);
            System.out.println(str2.length());
            System.out.println(str2.trim());
            System.out.println(str2.trim().length());
        }
}
