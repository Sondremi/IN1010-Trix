public class a0302_Skyskreaper extends a0302_Bygning {
    int antEtasjer;
    
    public a0302_Skyskreaper(double bruttoAreal, int antEtasjer) {
        super(bruttoAreal);
        this.antEtasjer = antEtasjer;
        System.out.println("Dette er en skyskraper");
    }

}

class testSkyskraper {
    public static void main(String[] args) {
        a0302_Skyskreaper s = new a0302_Skyskreaper(2000, 23);

        System.out.println(s);
    }
}

/*
a) Vi kaller implisitt på superklassens konstruktør og skriver derfor ut begge setninger.
b) Vi kaller eksplisitt på superklassens konstruktør og får samme resultat som i a.
c) Vi må kalle på super med bruttoAreal som parameter inne i Skyskraper sin konstruktør.
 */