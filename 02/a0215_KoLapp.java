public class a0215_KoLapp{
    private final int nummer;
    //Konstruktor
    public a0215_KoLapp(int nummer){
        this.nummer = nummer;
    }

    //Returnerer et tildelt nummer paa kolappen.    
    public int hentNummer(){
        return this.nummer;
    }

    public String toString() {
        return "Kø nummer " + nummer;
    }
}