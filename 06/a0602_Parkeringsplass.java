class Bil {
    private String regNr;
    private int antSeter;
    public Bil(String r, int a) {
        regNr = r;
        antSeter = a;
    }
    public String toString() {
        return "Registreringsnr: " + regNr + ", antall seter: " + antSeter;
    }
}
class Motorsykkel {
    private String regNr;
    private int motorStr;
    public Motorsykkel(String r, int m) {
        regNr = r;
        motorStr = m;
    }
    public String toString() {
        return "Registreringsnr: " + regNr + ", motorstørrelse: " + motorStr + " kubikk";
    }
}

class Parkeringsplass<E> {
    private E kjoretoy;

    public void kjorInn(E x) {
        this.kjoretoy = x;
    }
    public E kjorUt() {
        E element = kjoretoy;
        kjoretoy = null;
        return element;
    }
}

public class a0602_Parkeringsplass {
    public static void main(String[] args) {
        Parkeringsplass<Bil> pBil = new Parkeringsplass<>();
        Parkeringsplass<Motorsykkel> pMotorsykkel = new Parkeringsplass<>();

        pBil.kjorInn(new Bil("AB12345", 5));
        pMotorsykkel.kjorInn(new Motorsykkel("AC1234", 1000));

        System.out.println(pBil.kjorUt());
        System.out.println(pMotorsykkel.kjorUt());

        // pMotorsykkel.kjorInn(new Bil("AD23456", 5)); Ikke lov
    }
}
