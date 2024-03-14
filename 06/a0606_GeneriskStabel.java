class GeneriskStabel<E> {
    private Node start;

    public void leggPaa(E x){
        if (x == null) {
            throw new IllegalArgumentException("Nullverdi ikke tillatt");
        }
        if (erTom()){
            start = new Node(x);
        } else {
            Node midl = start;
            start = new Node(x);
            start.neste = midl;
        }
    }
  
    public E taAv(){
        if (erTom()){
            return null;
        }
        Node midl = start;
        start = start.neste;
        return midl.data;
    }
  
    public boolean erTom(){
        return start == null;
    }

    private class Node {
        private E data;
        private Node neste;

        private Node(E data) {
            this.data = data;
        } 
    }
}

class TestGeneriskStabel {
    public static void main(String[] args) {
        GeneriskStabel<String> stabel = new GeneriskStabel<String>();
        stabel.leggPaa("foobar");
        stabel.leggPaa("bazar");
        stabel.leggPaa("baz");
        stabel.leggPaa("bar");
        stabel.leggPaa("Foo");
        String resultat = "";
        while (!stabel.erTom())
            resultat += stabel.taAv() + " ";
        System.out.printf("Resultatet er: '%s'\n", resultat);

        GeneriskStabel<Kvadrat> kStabel = new GeneriskStabel<>();
        kStabel.leggPaa(new Kvadrat(10));
        kStabel.leggPaa(new Kvadrat(2));
        int sumAreal = 0;
        while (!kStabel.erTom()) {
            Kvadrat ut = kStabel.taAv();
            sumAreal += ut.areal();
        }
        System.out.println("Arealet til kvadratene er: " + sumAreal);

        GeneriskStabel<Person> pStabel = new GeneriskStabel<>();
        pStabel.leggPaa(new Person("Sondre", "Klær"));
        pStabel.leggPaa(new Person("Petter", "Bananer"));
        while (!pStabel.erTom()) {
            System.out.println(pStabel.taAv());
        }
    } 
}