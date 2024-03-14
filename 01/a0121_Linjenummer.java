import java.util.Scanner;
import java.io.File;

public class a0121_Linjenummer {
    public static void main(String[] args) throws Exception {
        Scanner fil = new Scanner(new File("tekst_linjenummer.txt"));
        int linjeNr = 0;
        while (fil.hasNextLine()) {
            System.out.println("# " + linjeNr + ": " + fil.nextLine());
            linjeNr++;
        }
        fil.close();
    }
}
