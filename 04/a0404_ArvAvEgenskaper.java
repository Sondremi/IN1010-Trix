public class a0404_ArvAvEgenskaper {
    public static void main(String[] args) {
        A peker1 = new B();
        B peker2 = new B();

        peker1.skrivUt();
        peker2.skrivUt();
    }
}

class A {
    public void skrivUt() {
        System.out.println("Klasse A");
    }
}

class B extends A{
    public void skrivUt() {
        System.out.println("Klasse B");
    }

}

/*
 * Hvis jeg kommenterer ut utskriftsmetoden i A vil peker1 få en feilmelding
 * siden peker1 peker på A og A ikke lenger har metoden.
 * Men hvis jeg kommenterer ut metoden i B så går det fint, siden B arver metoden fra A
 */