import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class a0216_SkatteKart {
    private char[][] skattekart;
    private int hoyde;
    private int bredde;
    private boolean funnet = false;

    private a0216_SkatteKart(char[][] kart, int rader, int kolonner) {
        skattekart = kart;
        this.hoyde = rader;
        this.bredde = kolonner;
    }

    static a0216_SkatteKart lesInn(File f) throws FileNotFoundException {
        Scanner leser = new Scanner(f);

        String[] str = leser.nextLine().split(" ");
        int antRader = Integer.parseInt(str[0]);
        int antKolonner = Integer.parseInt(str[1]);

        char[][] kart = new char[antRader][antKolonner];

        for (int rad = 0; rad < antRader; rad++) {
            String linje = leser.nextLine();

            for (int kol = 0; kol < antKolonner; kol++) {
                kart[rad][kol] = linje.charAt(kol);
            }
        }
        leser.close();
        a0216_SkatteKart sk = new a0216_SkatteKart(kart, antRader, antKolonner);
        return sk;
    }

    public void skrivUt() {
        for (int i = 0; i < hoyde; i++) {
            for (int j = 0; j < bredde; j++) {
                if (funnet) {
                    System.out.print(skattekart[i][j]);
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public boolean sjekk(int rad, int kol) {
        if (skattekart[rad][kol] == 'X') {
            funnet = true;
        }
        return funnet;
    }
}
