public class a0107_BoolskeVerdier {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Verdien til a er: " + a);

        if (a != b) {
            System.out.println("A er ikke lik B");
        } else {
            System.out.println("Noe gikk feil");
        }
        if (a == b) {
            System.out.println("Noe gikk feil");
        } else {
            System.out.println("Andre test traff");
        }
    }
}