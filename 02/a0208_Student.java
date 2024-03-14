import java.util.ArrayList;

public class a0208_Student {
    String navn;
    ArrayList<a0208_Fag> fag = new ArrayList<>();

    public a0208_Student(String navn) {
        this.navn = navn;
    }
    public String toString() {
        return this.navn;
    }
    public int antFag() {
        return fag.size();
    }
    public void skrivFag() {
        for (a0208_Fag detteFaget : fag) {
            System.out.println(detteFaget.toString());
        }
    }
    public void leggTilFag(a0208_Fag nyttFag) {
        if(fag.contains(nyttFag)) {
            System.out.println("Faget finnes allerede.");
        } else {
            fag.add(nyttFag);
            System.out.println("Lagt til fag.");
        }
    }
    public void fjernFag(a0208_Fag valgtFag) {
        if (fag.contains(valgtFag)) {
            fag.remove(valgtFag);
        } else {
            System.out.println("Faget kan ikke slettes, fordi det finnes ikke.");
        }
    }
}