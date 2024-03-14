import java.util.HashMap;

class Katt implements Comparable<Katt> {
    String navn;
    int alder;

    public Katt(String n, int a) {
        this.navn = n;
        this.alder = a;
    }

    public String hentNavn() {
        return this.navn;
    }

    public String toString() {
        return "Katten heter " + this.navn + " og er " + this.alder + " år gammel.";
    }

    @Override
    public int compareTo(Katt x) {
        if (this.alder < x.alder) {
            return -1;
        } else if (this.alder > x.alder) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Hovedprogram {
    public static void main(String[] args) {
        HashMap<String, Katt> katter = new HashMap<>();

        Katt k1 = new Katt("Guro", 3);
        Katt k2 = new Katt("Fennik", 7);
        Katt k3 = new Katt("Petter", 13);

        katter.put(k1.hentNavn(), k1);
        katter.put(k2.hentNavn(), k2);    
        katter.put(k3.hentNavn(), k3);

        Katt eldst = null;
        for (Katt katt : katter.values()) {
            if (eldst == null) {
                eldst = katt;
            } else {
                if (katt.compareTo(eldst) > 0) {
                    eldst = katt;
                }
            }
        }
        System.out.println("Den eldste katten er: " + eldst.hentNavn());
    }
    
}