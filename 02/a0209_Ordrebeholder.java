import java.util.ArrayList;

public class a0209_Ordrebeholder {
    private ArrayList<String> ordbeholder = new ArrayList<>();

    public boolean settInn(String ord) {
        if (ordbeholder.contains(ord))
            return false;

        ordbeholder.add(ord);
        return true;
    }

    public int antallOrd() {
        return ordbeholder.size();
    }

    public String pop() {
        if (antallOrd() == 0)
            return null;

        return ordbeholder.remove(antallOrd() -1);
    }  
}

class TestOrdrebeholder {
    public static void main(String[] args) {
        a0209_Ordrebeholder o = new a0209_Ordrebeholder();

        if (o.pop() == null) {
            System.out.println("Test 1: Riktig");
        } else {
            System.out.println("Test 1: Feil");
        }

        if (o.settInn("NyttOrd")) {
            System.out.println("Test 2: Riktig");
        } else {
            System.out.println("Test 2: Feil");
        }

        if (!o.settInn("NyttOrd")) {
            System.out.println("Test 3: Riktig");
        } else {
            System.out.println("Test 3: Feil");
        }

        o.settInn("En");
        o.settInn("To");
        o.settInn("SisteOrd");
        if (o.antallOrd() == 4) {
            System.out.println("Test 4: Riktig");
        } else {
            System.out.println("Test 4: Feil");
        }

        if (o.pop().equals("SisteOrd")) {
            System.out.println("Test 5: Riktig");
        } else {
            System.out.println("Test 5: Feil");
        }

        if (o.antallOrd() == 3) {
            System.out.println("Test 6: Riktig");
        } else {
            System.out.println("Test 6: Feil");
        }
    }
}