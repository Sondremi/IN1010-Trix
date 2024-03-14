public class a0206_Espressomaskin {
    private int vannmengde = 0;
    private final int MAXvannmengde = 1000;

    public void lagEspresso() {
        if (vannmengde >= 40) {
            System.out.println("Lager Espresso");
            vannmengde -= 40;
        } else {
            System.out.println("Ikke nok vann til å lage Espresso");
        }
    }
    public void lagLungo() {
        if (vannmengde >= 110) {
            System.out.println("Lager Lungo");
            vannmengde -= 110;
        } else {
            System.out.println("Ikke nok vann til å lage Lungo");
        }
    }
    public void fyllVann(int mlVann) {
        if ((this.vannmengde + mlVann) <= MAXvannmengde) {
            this.vannmengde += mlVann;
            System.out.println("Fylte på " + mlVann + "ml vann i tenken.");
        } else {
            System.out.println("Det er ikke nok plass i tanken til å fylle på " + mlVann + "ml vann.");
        }
    }
    public int hentVannmengde() {
        return this.vannmengde;
    }
}

class TestEspressoMaskin {
    public static void main(String[] args) {
        a0206_Espressomaskin em = new a0206_Espressomaskin();

        em.fyllVann(300);
        em.lagLungo();
        em.lagEspresso();
        em.lagLungo();
        em.lagLungo();
        em.fyllVann(100);
        em.lagLungo();
    }
}