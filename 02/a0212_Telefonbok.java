import java.util.HashMap;
import java.util.Scanner;

public class a0212_Telefonbok {
    private HashMap<String, String> telefonbok = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void leggTil() {
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");
    }

    public void ordrelokke() {
        String inp = "s";

        while (!inp.equals("a")) {
            System.out.print("Oppgi navn, (Avslutt = a): ");
            inp = scanner.nextLine();

            if (telefonbok.containsKey(inp)) {
                System.out.println("Telefonnummer til personen: " + telefonbok.get(inp));
            } else if (!inp.equals("a")) {
                System.out.println("Personen finnes ikke.");
            }
        }

        for (String person : telefonbok.keySet()) {
            System.out.println("Navn: " + person + ", tlf: " + telefonbok.get(person));
        }
    }
    
}

class TestTelefonbok {
    public static void main(String[] args) {
        a0212_Telefonbok tbok = new a0212_Telefonbok();

        tbok.leggTil();
        tbok.ordrelokke();
    }
}
