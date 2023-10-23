package birincibolum;

public class B17_StringManupilations07ReplaceAll {
        /*
    replace() methodu ile benzer olarak verilen String’deki istenene karakter(ler)i istenen
yeni karakter(ler) ile degistirir. Aralarindaki farklar
- replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz
- replaceAll() methodunda Regular Expressions kullanilabilir
\\s : bosluk(space)
\\S : bosluk disindaki tum karakterler
\\w : harfler ve rakamlar (a-z , A-Z, 0-9)
\\W : harfler ve rakamlar disindaki tum karakterler
\\d : rakamlar (0-9)
\\D : rakamlar disindaki tum karakterler

     */
        public static void main(String[] args) {
            String str="Java'da rakamlar 1234567890";
            System.out.println(str.replaceAll("a","*"));
            System.out.println(str.replaceAll("\\s","*"));
            System.out.println(str.replaceAll("\\S","*"));
            System.out.println(str.replaceAll("\\w","*"));
            System.out.println(str.replaceAll("\\W","*"));
            System.out.println(str.replaceAll("\\d","*"));
            System.out.println(str.replaceAll("\\D","*"));
        }
}
