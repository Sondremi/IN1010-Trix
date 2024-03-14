class Beholder<E> {
    private E element;

    public void settInn(E element) {
        this.element = element;
    }

    public E taUt() {
        return this.element;
    }
}
class Sirkel {}
class Kvadrat1 {}

class TestBeholder {
    public static void main(String[] args) {
        Beholder<Sirkel> beholder = new Beholder<>();
        
        Sirkel sirkel = new Sirkel();
        Kvadrat1 kvadrat = new Kvadrat1();
        
        System.out.println(kvadrat); // Fjerner gul strek bare

        beholder.settInn(sirkel);
        // beholder.settInn(kvadrat); Ikke lov
 
    }
}