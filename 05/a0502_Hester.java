abstract class Hest {
    String navn;
    int alder;

    public Hest(String n, int a) {
        navn = n;
        alder = a;
    }

    public void skritt() {
        System.out.println(navn + " gaar fremover.");
    }

    public void trav() {
        System.out.println(navn + " 'jogger' med hoyre fremben og venstre bakben, deretter motsatt.");
    }

    public void galopp() {
        System.out.println(navn + " beveger seg raskt med beina i tretakt.");
    }
}

class EngelskFullblodsHest extends Hest {
    public EngelskFullblodsHest(String n, int a) {
        super(n, a);
    }
}
interface KanToelte {
    abstract public void toelt();
}
interface KanPasse {
    abstract public void pass();
}

class PasoFino extends Hest implements KanToelte {
    public PasoFino(String n, int a) {
        super(n, a);
    }
    public void toelt() {
        System.out.println("Toelter");
    }
}

class IslandsHest extends Hest implements KanPasse, KanToelte {
    public IslandsHest(String n, int a) {
        super(n, a);
    }
    public void toelt() {
        System.out.println("Toelter");
    }
    public void pass() {
        System.out.println("Passer");
    }
}

class TestHest {
    public static void main(String[] args) {
        EngelskFullblodsHest engelskFullblodsHest = new EngelskFullblodsHest("Sondre", 20);
        PasoFino pasofino = new PasoFino("Zack", 10);
        IslandsHest islandshest = new IslandsHest("Petter", 4);

        engelskFullblodsHest.skritt();
        
        pasofino.toelt();

        islandshest.toelt();
        islandshest.pass();
    }
}