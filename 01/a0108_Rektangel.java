public class a0108_Rektangel {
    
    double lengde;
    double bredde;

    public a0108_Rektangel (double l, double b) {
        lengde = l;
        bredde = b;
    }

    public void oekLengde (int okning) {
        lengde += okning;
    }

    public void oekBredde (int okning) {
        bredde += okning;
    }

    public double areal () { // Beregn areal
        return bredde * lengde;
    }

    public double omkrets () { // Beregn omkrets
        return lengde*2 + bredde*2;
    }
}

class RektangelHovedprogram {
    public static void main(String[] args) {
        a0108_Rektangel en = new a0108_Rektangel(10, 20);
        a0108_Rektangel to = new a0108_Rektangel(5, 8);

        System.out.println("Areal: " + en.areal());
        System.out.println("Areal: " + to.areal());

        en.oekBredde(5);
        to.oekLengde(7);

        System.out.println("Omkrets: " + en.omkrets());
        System.out.println("Omkrets: " + to.omkrets());
    }
}