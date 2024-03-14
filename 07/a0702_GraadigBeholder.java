class GraadigBeholder<E extends Comparable<E>> {
    private E element;
    
    public E settInn(E x) {
        if (element == null) {
            element = x;
            return null;
        } else if (element.compareTo(x) <= 0) {
            E tmp = element;
            element = x;
            return tmp;
        } else {
            return null;
        }
    }

    public E hent() {
        return this.element;
    }

}

class TestBeholder {
    public static void main(String[] args) {
        GraadigBeholder<Katt> kattebeholder = new GraadigBeholder<>();

        System.out.println(kattebeholder.settInn(new Katt("Sondre", 5)));
        System.out.println(kattebeholder.settInn(new Katt("Petter", 6)));
        System.out.println(kattebeholder.settInn(new Katt("Mats", 10)));

        System.out.println(kattebeholder.hent());

    }
}
