class a0109_Baat {
    public static int antProd = 0;
    private int prodnr;
    private String merke;

    public a0109_Baat(String mrk) {
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }

    public String hentInfo() {
        return "Produksjonsnummer: " + prodnr + ", merke: " + merke;
    }
}

class a0109_Baathus {
    private a0109_Baat[] baathus;

    public a0109_Baathus(int antallPlasser) {
        baathus = new a0109_Baat[antallPlasser];
    }

    public void settInn(a0109_Baat enBaat) {

        boolean sattInn = false;
        int teller = 0;

        while (teller < baathus.length && sattInn == false) {
            if (baathus[teller] == null) {
                baathus[teller] = enBaat;
                sattInn = true;
            }

            teller++;
        }

        if (sattInn != true) {
            System.out.println("Det er ikke plass til flere baater!");
        }

    }

    public void skrivBaater() {
        for (int i = 0; i < baathus.length; i++) {
            if (baathus[i] != null){
                System.out.println(baathus[i].hentInfo());
            }
        }
    }
}

class a0109_Baattest {
    public static void main(String[] args) {
        a0109_Baathus baathus = new a0109_Baathus(3);

        baathus.settInn(new a0109_Baat("merke 1"));
        baathus.settInn(new a0109_Baat("merke 2"));
        baathus.settInn(new a0109_Baat("merke 3"));
        baathus.settInn(new a0109_Baat("merke 4"));

        baathus.skrivBaater();
    }
}
