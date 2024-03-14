import java.util.Scanner;

public class a0104_SkattIRuritania {
    public static void main(String[] args) {
        double inntekt = 0.0;
        double skatt = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Oppgi inntekt: ");
        inntekt = scanner.nextDouble();

        if (inntekt < 10000) {
            skatt = inntekt * 0.1;
        } else {
            skatt = (inntekt - 10000) * 0.3 + (10000 * 0.1);
        }

        System.out.println("Du må betale " + skatt + "kr i skatt.");
        scanner.close();
    }
}
