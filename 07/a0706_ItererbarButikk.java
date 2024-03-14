import java.util.Iterator;

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

public class a0706_ItererbarButikk implements Iterable<Person> {
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

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }


    class PersonIterator implements Iterator<Person> {
        private Person denne;

        public PersonIterator() {
            denne = foerste;
        }

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public Person next() {
            Person tmp = denne;
            denne = denne.hentNeste();
            return tmp;
        }
    }
}

class TestIterableButikk {
    public static void main(String[] args) {
        a0706_ItererbarButikk butikk = new a0706_ItererbarButikk();

        butikk.entreButikk(new Person("Sondre", "Bacon"));
        butikk.entreButikk(new Person("Mats", "Egg"));
        butikk.entreButikk(new Person("Petter", "Pizza"));
        butikk.entreButikk(new Person("Niklas", "Melk og brød"));

        for (Person kunde : butikk) {
            System.out.println(kunde);
        }

    }
}