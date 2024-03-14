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

@SuppressWarnings({"rawtypes", "unchecked"})
class Parkeringshus {
    static Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    static Parkeringsplass[] etasje2 = new Parkeringsplass[10];

    public static void main(String[] args) {
        Bil bil2 = new Bil("AB12345", 2);
        Bil bil1 = new Bil("AC23456", 5);
        Bil bil3 = new Bil("AD34567", 7);

        Motorsykkel m1 = new Motorsykkel("AB1234", 125);
        Motorsykkel m2 = new Motorsykkel("AC2345", 500);
        Motorsykkel m3 = new Motorsykkel("AD3456", 1000);

        etasje1[0] = new Parkeringsplass();
        etasje1[0].kjorInn(bil1);

        etasje1[1] = new Parkeringsplass();
        etasje1[1].kjorInn(m1);

        etasje1[6] = new Parkeringsplass();
        etasje1[6].kjorInn(m2);

        etasje2[2] = new Parkeringsplass();
        etasje2[2].kjorInn(m3);

        etasje2[9] = new Parkeringsplass();
        etasje2[9].kjorInn(bil2);

        etasje2[3] = new Parkeringsplass();
        etasje2[3].kjorInn(bil3);

        for (int i = 0; i < etasje1.length; i++) {
            if (etasje1[i] != null) {
                System.out.println(etasje1[i].kjorUt());
                etasje1[i] = null;
            }
            if (etasje2[i] != null) {
                System.out.println(etasje2[i].kjorUt());
                etasje2[i] = null;
            }
        }
    }
}
