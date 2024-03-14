import java.util.ArrayList;
import java.util.HashMap;

public class a0214_Person {
    private String navn;
    private String telefonnummer;
    private String adresse;

    public a0214_Person(String navn, String telefonnummer, String adresse) {
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
    }

    public void skrivInfo() {
        System.out.println("Navn: " + navn);
        System.out.println("Telefonnummer: " + telefonnummer);
        System.out.println("Adresse: " + adresse + "\n");
    }

    public String hentNavn() {
        return navn;
    }
    
}

class Telefonbok {
    public static void main(String[] args) {
        a0214_Person p1 = new a0214_Person("Sondre", "12345678", "Kolbotn");
        a0214_Person p2 = new a0214_Person("Mats", "34567891", "Bjølsen");
        a0214_Person p3 = new a0214_Person("Jonas", "98765432", "Frogner");

        
        a0214_Person[] personer = new a0214_Person[10];
        personer[0] = p1;
        personer[1] = p2;
        personer[2] = p3;

        for (int i = 0; i < personer.length; i++) {
            if (personer[i] != null) {
                personer[i].skrivInfo();
            }
        }
        

        ArrayList<a0214_Person> personer2 = new ArrayList<>();
        personer2.add(p1);
        personer2.add(p2);
        personer2.add(p3);
        
        for (a0214_Person person : personer2) {
            person.skrivInfo();
        }
        

        HashMap<String, a0214_Person> personer3 = new HashMap<>();
        personer3.put(p1.hentNavn(), p1);
        personer3.put(p2.hentNavn(), p2);
        personer3.put(p3.hentNavn(), p3);

        for (a0214_Person person : personer3.values()) {
            person.skrivInfo();
        }

    }
}