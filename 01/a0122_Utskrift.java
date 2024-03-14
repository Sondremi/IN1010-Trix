public class a0122_Utskrift {
    public static void main(String[] args) {
        String tekst = "Dette er en tekst";
        int tall1 = 4;
        int tall2 = 6;

        utskrift(tekst);
        utskrift(tall1, tall2);
    }
    public static void utskrift(String tekst) {
        System.out.println(tekst);
    }
    public static void utskrift(int tall1, int tall2) {
        System.out.println(tall1 + tall2);
    }
}
