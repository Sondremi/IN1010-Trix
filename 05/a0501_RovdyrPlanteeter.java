interface Rovdyr {
    abstract void jakt();
}

interface Planteeter {
    abstract void beskytt();
}

class Bjorn implements Rovdyr {
    public void jakt() {
        System.out.println("Jaktet");
    }
}

class Ulv implements Rovdyr {
    public void jakt() {
        System.out.println("Jaktet");
    }
}

class Elg implements Planteeter {
    public void beskytt() {
        System.out.println("Beskytt");
    }
}

class Sau implements Planteeter {
    public void beskytt() {
        System.out.println("Beskytt");
    }
}

public class a0501_RovdyrPlanteeter {
    public static void main(String[] args) {
        Rovdyr[] rovdyr = new Rovdyr[2];
        Planteeter[] planteeter = new Planteeter[2];

        Bjorn bjorn = new Bjorn();
        Ulv ulv = new Ulv();
        Elg elg = new Elg();
        Sau sau = new Sau();

        rovdyr[0] = bjorn;
        rovdyr[1] = ulv;
        planteeter[0] = elg;
        planteeter[1] = sau;

        for (Rovdyr rovdyret : rovdyr) {
            rovdyret.jakt();
        }
        for (Planteeter planteeteret : planteeter) {
            planteeteret.beskytt();
        }
    }
}

/*
Tegning av sammenhengen mellom klassene

    /Rovdyr/  /Planteeter/
     ^   ^      ^     ^
|Bjørn| |Ulv| |Elg| |Sau|

*/