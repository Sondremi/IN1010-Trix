import java.io.File;
import java.util.Scanner;

public class a0202_Gruppetime {
    private String[] navn = new String[14];
    private boolean[] oppmoete = new boolean[14];
    private int antallStudenter = 0;

    
    public void lesFraFil() throws Exception {
        Scanner s = new Scanner(new File("gruppeliste.txt"));

        while (s.hasNextLine() && antallStudenter < navn.length) {
            navn[antallStudenter] = s.nextLine();
            antallStudenter++;
        }
        s.close();
    }
    public void sjekkOppmote(String student) {
        for (int i = 0; i < antallStudenter; i++) {
            if (navn[i].equals(student)) {
                oppmoete[i] = true;
            }
        }
    }
    public void opprop() {
        for (int i = 0; i < navn.length; i++) {
            if (oppmoete[i] != true) {
                System.out.println(navn[i] + " har ikke møtt opp.");
            } else {
                System.out.println(navn[i] + " har møtt opp.");
            }
        }
    }
}

class a0202_GruppetimeTest {
    public static void main(String[] args) throws Exception {
        a0202_Gruppetime opprop = new a0202_Gruppetime();

        opprop.lesFraFil();
        
        opprop.sjekkOppmote("Nille");
        opprop.sjekkOppmote("Gunnar");
        opprop.sjekkOppmote("Linda");

        opprop.opprop();
    }
}
