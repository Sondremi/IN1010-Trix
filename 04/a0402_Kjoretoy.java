import java.util.ArrayList;
import java.util.Scanner;

abstract class Kjoretoy {
    protected String regNr;
    protected String merke;
    protected String eier;

    public Kjoretoy(String r, String m, String e) {
        this.regNr = r;
        this.merke = m;
        this.eier = e;
    }

    public abstract void skrivInfo();
    public abstract double aarsavgift();

    public String hentRegNr() {
        return this.regNr;
    }
    public String hentEier() {
        return this.eier;
    }
}

class Buss extends Kjoretoy {
    private int antSitteplasser;

    public Buss(String r, String m, String e, int s) {
        super(r, m, e);
        this.antSitteplasser = s;
    }
    @Override
    public void skrivInfo() {
        System.out.println("\nRegistreringsnr: " + regNr + ", merke: " + merke + "\nEier: " + eier + ", antall sitteplasser: " + antSitteplasser);
    }
    public double aarsavgift() {
        return 0;
    }
}

class Personbil extends Kjoretoy {
    private int antSitteplasser;

    public Personbil(String r, String m, String e, int s) {
        super(r, m, e);
        this.antSitteplasser = s;
    }
    @Override
    public void skrivInfo() {
        System.out.println("\nRegistreringsnr: " + regNr + ", merke: " + merke + "\nEier: " + eier + ", antall sitteplasser: " + antSitteplasser);
    }
    public double aarsavgift() {
        return 3000;
    }
}

class Varebil extends Kjoretoy {
    private final double MAXlastevekt;

    public Varebil(String r, String m, String e, double v) {
        super(r, m, e);
        this.MAXlastevekt = v;
    }
    @Override
    public void skrivInfo() {
        System.out.println("\nRegistreringsnr: " + regNr + ", merke: " + merke + "\nEier: " + eier + ", max lastevekt: " + MAXlastevekt);
        System.out.println("Årsavgift: " + aarsavgift());
    }
    public double aarsavgift() {
        return MAXlastevekt*4;
    }
}

class TestKjoretoy {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int inp = -1;

        ArrayList<Kjoretoy> kjoretoy = new ArrayList<>();

        while (inp != 4) {
            if (inp == 1) {
                System.out.print("\nHvilken type kjoretoy vil du registrere? (Personbil, buss, varebil) ");
                String type = tastatur.next();
                boolean lagtTil = true;

                System.out.print("\nOppgi registreringsnummer: ");
                String regNr = tastatur.next();

                System.out.print("Oppgi merke: ");
                String merke = tastatur.next();

                System.out.print("Oppgi eier av kjoretoy: ");
                String eier = tastatur.next();

                if (type.toLowerCase().equals("personbil")) {
                    System.out.print("Oppgi antall sitteplasser: ");
                    int antS = tastatur.nextInt();
                    kjoretoy.add(new Personbil(regNr, merke, eier, antS));
                } else if (type.toLowerCase().equals("buss")) {
                    System.out.print("Oppgi antall sitteplasser: ");
                    int antS = tastatur.nextInt();
                    kjoretoy.add(new Buss(regNr, merke, eier, antS));
                } else if (type.toLowerCase().equals("varebil")) {
                    System.out.print("Oppgi max lastevekt: ");
                    double mv = tastatur.nextDouble();
                    kjoretoy.add(new Varebil(regNr, merke, eier, mv));
                } else {
                    System.out.println("Ikke gyldig type.");
                    lagtTil = false;
                }
                if (lagtTil) {
                    System.out.println("Kjoretoy lagt til.");
                }
            } else if (inp == 2) {
                System.out.print("\nOppgi registreringsnummer: ");
                String regNr = tastatur.next();
                boolean funnet = false;
                for (Kjoretoy kjoretoyet : kjoretoy) {
                    if (kjoretoyet.hentRegNr().equals(regNr)) {
                        kjoretoyet.skrivInfo();
                        funnet = true;
                    } 
                }
                if (!funnet) {
                    System.out.println("Registreringsnummeret finnes ikke.");
                }
            } else if (inp == 3) {
                System.out.print("\nOppgi navn: ");
                String navn = tastatur.next();
                double aarsavgift = 0;
                boolean funnet = false;

                for (Kjoretoy kjoretoyet : kjoretoy) {
                    if (kjoretoyet.hentEier().toLowerCase().equals(navn.toLowerCase())) {
                        aarsavgift += kjoretoyet.aarsavgift();
                        funnet = true;
                    }
                }
                if (funnet) {
                    System.out.println("Aarsavgift for kjoretoy på eieren er: " + aarsavgift);
                } else {
                    System.out.println("Personen finnes ikke.");
                }
            }

            System.out.println("\n----- MENY -----");
            System.out.println("1. Registrer kjoretoy");
            System.out.println("2. Skriv ut info om kjoretoy");
            System.out.println("3. Summer aarsavgift for kjoretoy på et navn");
            System.out.println("4. Avslutt");

            inp = tastatur.nextInt();
        }
        tastatur.close();
    }
}