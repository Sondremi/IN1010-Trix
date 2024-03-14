class Person {
    private String navn;
    private String handler;
    private Person neste;

    public Person(String n, String h) {
        this.navn = n;
        this.handler = h;
    }

    public void settNeste(Person p) {
        this.neste = p;
    }

    public Person hentNeste() {
        return this.neste;
    }

    public String toString() {
        return navn + " handler " + handler;
    }

}

class Butikk {
    private Person foerste;
    
    public void entreButikk(Person p) {
        if (foerste == null) {
            foerste = p;
        } else {
            Person tmp = foerste;
            while (tmp.hentNeste() != null) {
                tmp = tmp.hentNeste();
            }
            tmp.settNeste(p);
        }
    }

    public void kassa() {
        while (foerste != null) {
            System.out.println(foerste.toString());
            System.out.println("- Hade bra!");
            foerste = foerste.hentNeste();
        }
    }
}

class TestButikk {
    public static void main(String[] args) {
        Butikk butikk = new Butikk();

        Person p1 = new Person("Sondre", "Dorull");
        Person p2 = new Person("Niklas", "Tannbørste");
        Person p3 = new Person("Lennard", "Pasta");
        Person p4 = new Person("Jonas", "Ost og rømme");
        Person p5 = new Person("Mats", "Øl");

        butikk.entreButikk(p1);
        butikk.entreButikk(p2);
        butikk.entreButikk(p3);
        butikk.entreButikk(p4);
        butikk.entreButikk(p5);

        butikk.kassa();
    }
}