public class a0123_Parametere {
    public static void main(String[] args) {
        String a = "en tekst!";
        metodeEn(a);
        System.out.println(a);

        int b = 5;
        metodeTo(b);
        System.out.println(b);

        String c = "hei! ";
        String d = metodeTre(c);
        System.out.println(c);
        System.out.println(d);
    }
    public static void metodeEn(String a) {
        a = a + 12;
    }
    public static int metodeTo(int b) {
        b = b + 2;
        return b;
    }
    public static String metodeTre(String noe) {
        noe = noe + "og hallo!";
        return noe;
    }
}
