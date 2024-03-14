import java.util.ArrayList;

class SortertArrayList<T extends Comparable<T>> {
    ArrayList<T> liste = new ArrayList<>();

    public void settInn(T data) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).compareTo(data) > 0) {
                liste.add(i, data);
                return;
            }
        }
        liste.add(data);
    }
    public T hentUtFørste() {
        return liste.remove(0);
    }
}

class TestSortert {
    public static void main(String[] args) {
        SortertArrayList<Katt> katteListe = new SortertArrayList<>();
        katteListe.settInn(new Katt("Petter", 10));
        katteListe.settInn(new Katt("Guro", 3));
        katteListe.settInn(new Katt("Sondre", 1));
        katteListe.settInn(new Katt("Mats", 7));

        for (int i = 0; i < 4; i++) {
            System.out.println(katteListe.hentUtFørste());

        }
    }
}