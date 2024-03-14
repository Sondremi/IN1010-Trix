import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class a0216_Hovedprogram {
    public static void main(String[] args) {
        a0216_SkatteKart skattekart = null;
        Scanner tastatur = new Scanner(System.in);

        try {
            File fil = new File("kart.txt");
            skattekart = a0216_SkatteKart.lesInn(fil);
        } catch (FileNotFoundException e) {
            System.out.println("Filen finnes ikke.");
        }

        skattekart.skrivUt();

        System.out.println("\nFinn skatten! Gjett koordinater paa formatet (rad kol) (a for aa avslutte): ");
        String inn = tastatur.nextLine();
        
        while (!inn.equals("a")) {
            String[] koordinater = inn.split(" ");

            try {
                int rad = Integer.parseInt(koordinater[0]);
                int kol = Integer.parseInt(koordinater[1]);

                if (skattekart.sjekk(rad, kol)) {
                    System.out.println("\nDu fant skatten!");
                    inn = "a";
                } else {
                    System.out.println("\nIngen skatt der! Gjett igjen: ");
                    inn = tastatur.nextLine();
                }

                skattekart.skrivUt();
            } catch (NumberFormatException e) {
                System.out.println("Ugyldige koordinater!");
            }
        }
        tastatur.close();
    }
}
