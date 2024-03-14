import java.util.Iterator;

class EnkelArrayListe implements Iterable<String> {
    private String[] array;
    private int maxStoerrelse;
    private int stoerrelse = 0;

    public EnkelArrayListe(int ms) {
        this.maxStoerrelse = ms;
        array = new String[maxStoerrelse];
    }

    public void leggTil(String linje) {
        if (stoerrelse >= maxStoerrelse) {
            throw new IllegalStateException("Ikke plass til flere.");
        }
        array[stoerrelse] = linje;
        stoerrelse++;
    }

    @Override
    public Iterator<String> iterator() {
        return new ListeIterator();
    }

    private class ListeIterator implements Iterator<String> {
        private int gjeldendeIndex = 0;

        public String next() {
            return array[gjeldendeIndex++];
        }
        public boolean hasNext() {
            return gjeldendeIndex < stoerrelse;
        }
    }
}

class TestIterable {
    public static void main(String[] args) {
        EnkelArrayListe eal = new EnkelArrayListe(4);

        eal.leggTil("Sondre");
        eal.leggTil("Lagde");
        eal.leggTil("denne");
        eal.leggTil("koden");

        Iterator<String> iterator = eal.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
