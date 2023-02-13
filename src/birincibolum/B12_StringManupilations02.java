package birincibolum;

public class B12_StringManupilations02 {
    public static void main(String[] args) {

        String isim1="Rehber";
        String isim2="Kod";
        String isim3="Rehber Kod";
        String isim4=isim1+" "+isim2;
        String isim5="rehber kod";
        System.out.println(isim3.equals(isim4));
        System.out.println(isim3==isim4);
        System.out.println(isim3.equalsIgnoreCase(isim5));
    }
}
