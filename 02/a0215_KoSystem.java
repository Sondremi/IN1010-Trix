import java.util.ArrayList;

public class a0215_KoSystem{
    private ArrayList<a0215_KoLapp> KoLapper = new ArrayList<>();
    private int nummer = 0;

    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.     
    public void trekkKoLapp(){
        KoLapper.add(new a0215_KoLapp(nummer));
        System.out.println("Du har fått tilfelt billetnr " + nummer);
        System.out.println("Det står " + (KoLapper.size() - 1) + " personer foran deg.");
        nummer++;
    }

    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){
        if (KoLapper.get(0) != null) {
            a0215_KoLapp foersteLapp = KoLapper.get(0);
            System.out.println("Kunde med billettnr. " + foersteLapp.hentNummer() + " er betjent.");
            KoLapper.remove(foersteLapp);
        } else {
            System.out.println("Det er ingen i køen");
        }
    }

    //Returnerer antall kunder som er i ko.
    public int antKunder(){
        return KoLapper.size();
    }

    //Printer alle kunder i ko
    public void printKunderIKo(){
        for (a0215_KoLapp denneLapp : KoLapper) {
            System.out.println(denneLapp);
        }
    }

}