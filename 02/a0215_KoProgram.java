import java.util.Scanner;

public class a0215_KoProgram {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        a0215_KoSystem system = new a0215_KoSystem();

        int inp = -1;
        while (inp != 4) {
            System.out.println("\n**MENY FOR BILLETTSYSTEM**");
            System.out.println("1 - Trekk ny kolapp.");
            System.out.println("2 - Betjen kunde.");
            System.out.println("3 - Print antall kunder i kø.");
            System.out.println("4 - Avslutt.");

            System.out.print("Valg: ");
            inp = tastatur.nextInt();
            System.out.println("");
            
            if (inp == 1) {
                system.trekkKoLapp();
            } else if (inp == 2) {
                system.betjenKunde();
            } else if (inp == 3) {
                System.out.println("Det står " + system.antKunder() + " personer i kø.");;
            }
        }
        tastatur.close();
    }
}
