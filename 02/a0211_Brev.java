import java.util.ArrayList;

public class a0211_Brev {
    private String avsender;
    private String mottaker;
    private ArrayList<String> linjer = new ArrayList<>();

    public a0211_Brev(String avsender, String mottaker) {
        this.avsender = avsender;
        this.mottaker = mottaker;
    }
    public void skrivLinje(String linje) {
        linjer.add(linje);
    }
    public void lesBrev() {
        System.out.println("Hei, " + this.mottaker + "\n");
        for (String linje : linjer) {
            System.out.println(linje);
        }
        System.out.println("\nHilsen fra, \n" + this.avsender);
    }
}

class Hovedprogram {
    public static void main(String[] args) {
        a0211_Brev brev = new a0211_Brev("Per Askeladd", "Espen Askeladd");
        brev.skrivLinje("Hvodan har du det?");
        brev.skrivLinje("Jeg har det bare bra");
        brev.lesBrev();
    }
}
