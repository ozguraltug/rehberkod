package birincibolum;

public class B11_StringManupilations01 {
    public static void main(String[] args) {

        String isim="Ali";
        String soyisim="Can";
        System.out.println(isim+" "+soyisim);
        System.out.println(isim.concat(soyisim));
        System.out.println(isim.concat(" ").concat(soyisim));

        System.out.println(isim.charAt(0));
        System.out.println(isim.charAt(2));

        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
    }

}
