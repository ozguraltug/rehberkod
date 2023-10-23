package birincibolum;

public class B16_StringManupilations06 {
    public static void main(String[] args) {
        //replace() methodu
        //Verilen string ifadedeki istenen değerleri istenen değerlerle değiştiriyor
        String str="Java öğrenmek çok kolay";
        System.out.println(str.replace("a","x"));
        System.out.println(str.replace("Java","X"));
        System.out.println(str.replace("a","xxx"));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace('J','X'));
        System.out.println(str);
    }

}
