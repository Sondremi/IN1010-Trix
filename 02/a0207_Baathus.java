class Baat {
    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk) {
        prodnr = antProd;
        merke = mrk;
        antProd++;
    }
    public String hentInfo() {
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

public class a0207_Baathus {
    private Baat[] baathus;

    public a0207_Baathus(int antallPlasser) {
        baathus = new Baat[antallPlasser];
    }

    public void settInn(Baat nyBaat) {
        int teller = 0;
        boolean sattInn = false;
        while (teller < baathus.length && sattInn == false) {
            if (baathus[teller] == null) {
                baathus[teller] = nyBaat;
                sattInn = true;
            }
            teller++;
        }
        if (sattInn != true) {
            System.out.println("Det er ikke plass til flere baater.");
        }
    }
    public void skrivBaater() {
        for (Baat denneBaaten : baathus) {
            if (denneBaaten != null) {
                System.out.println(denneBaaten.hentInfo());
            }
        }
    }
}

class TestBaatHus {
    public static void main(String[] args) {
        a0207_Baathus bh = new a0207_Baathus(3);
        Baat b1 = new Baat("Nordic");
        Baat b2 = new Baat("Seastar");
        Baat b3 = new Baat("Princess");
        Baat b4 = new Baat("Yacht");

        bh.settInn(b1);
        bh.settInn(b2);
        bh.settInn(b3);
        bh.settInn(b4);

        bh.skrivBaater();
    }
}
