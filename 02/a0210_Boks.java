public class a0210_Boks {
    private int lengde;
    private int bredde;
    private int hoyde;

    public a0210_Boks(int lengde, int bredde, int hoyde) {
        this.lengde = lengde;
        this.bredde = bredde;
        this.hoyde = hoyde;
    }

    public int beregnAreal() {
        return (lengde * bredde * 2) + (bredde * hoyde * 2) + (hoyde * lengde * 2);
    }

    public int beregnVolum() {
        return lengde * bredde * hoyde;
    } 
}

class TestBoks {
    private static int teller = 1;
    public static void main(String[] args) {
        a0210_Boks boks1 = new a0210_Boks(10, 10, 10);
        a0210_Boks boks2 = new a0210_Boks(10, 10, 0);
    
        System.out.println("Tester boks1:");
        intTest(boks1.beregnAreal(), 600);
        intTest(boks1.beregnVolum(), 1000);

        System.out.println("\nTester boks2:");
        intTest(boks2.beregnAreal(), 200);
        intTest(boks2.beregnVolum(), 0);
    }

    public static boolean intTest(int faktiskResultat, int forventetResultat) {
        if (faktiskResultat == forventetResultat) {
            System.out.println("Test " + teller + ": Riktig");
        } else {
            System.out.println("Test " + teller + ": Feil");
        }
        teller ++;
        return faktiskResultat == forventetResultat;
    }
}