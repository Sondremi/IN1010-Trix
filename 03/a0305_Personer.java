abstract class a0305_Personer {
    String navn;
    int alder;

    public a0305_Personer(String n, int a) {
        this.navn = n;
        this.alder = a;
    }
    public abstract void skrivInfo();
}

abstract class Studenter extends a0305_Personer {
    String kurs;
    String laerested;

    public Studenter(String n, int a, String k, String l) {
        super(n, a);
        this.kurs = k;
        this.laerested = l;
    }
    public abstract boolean harTilgang();
}

class BachelorStudent extends Studenter {
    public BachelorStudent(String n, int a, String k, String l) {
        super(n, a, k, l);
    }
    @Override
    public void skrivInfo() {
        System.out.println("Bachelorstudent: " + navn + " - Alder: " + alder + "\nKurs: " + kurs + " - Lærested: " + laerested);
    }
    @Override
    public boolean harTilgang() {
        return false;
    }
}

class MasterStudent extends Studenter {
    public MasterStudent(String n, int a, String k, String l) {
        super(n, a, k, l);
    }
    @Override
    public void skrivInfo() {
        System.out.println("Bachelorstudent: " + navn + " - Alder: " + alder + "\nKurs: " + kurs + " - Lærested: " + laerested);
    }
    @Override
    public boolean harTilgang() {
        return true;
    }
}

abstract class Ansatte extends a0305_Personer {
    double timelonn;

    public Ansatte(String n, int a, double t) {
        super(n, a);
        this.timelonn = t;
    }
}

class Forsker extends Ansatte {
    String fagomraade;

    public Forsker(String n, int a, double t, String f) {
        super(n, a, t);
        this.fagomraade = f;
    }
    @Override
    public void skrivInfo() {
        System.out.println("Forsker: " + navn + " - Alder: " + alder + "\nTimelønn: " + timelonn + " - Fagområde: " + fagomraade);
    }
}

class Professor extends Forsker {
    String kurs;

    public Professor(String n, int a, double t, String f, String k) {
        super(n, a, t, f);
        this.kurs = k;
    }
    @Override
    public void skrivInfo() {
        System.out.println("Forsker: " + navn + " - Alder: " + alder + "\nTimelønn: " + timelonn + " - Fagområde: " + fagomraade + "Underviser i " + kurs);
    }
}

class TestUniversitetssystem {
    public static void main(String[] args) {
        BachelorStudent bs = new BachelorStudent("Sondre", 20, "Prosa", "IT-bygget");
        MasterStudent ms = new MasterStudent("Niklas", 23, "AI", "IT-bygget");
        Forsker f = new Forsker("Arne", 67, 500, "Nettverk");
        Professor p = new Professor("Omid", 35, 600, "Hardware", "IN1020");

        a0305_Personer[] personer = new a0305_Personer[4];
        personer[0] = bs;
        personer[1] = ms;
        personer[2] = f;
        personer[3] = p;

        for (int i = 0; i < personer.length; i++) {
            personer[i].skrivInfo();
        }

        System.out.println("Bachelorstudent har tilgang: " + bs.harTilgang());
        System.out.println("BMasterstudent har tilgang: " + ms.harTilgang());

    }
}