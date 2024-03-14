import java.util.Scanner;

public class a0115_Handletur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pris = 0;
 
        System.out.println("Hei! Velkommen til IFI-butikken.");

        System.out.println("Hvor mange brød vil du ha? ");
        int antBroed = scanner.nextInt();

        System.out.println("Hvor mange kartonger melk vil du ha? ");
        int antMelk = scanner.nextInt();

        System.out.println("Hvor mange ost vil du ha? ");
        int antOst = scanner.nextInt();

        System.out.println("Hvor mange yoghurt vil du ha? ");
        int antYoghurt = scanner.nextInt();

        pris = antBroed*20 + antMelk*15 + antOst*40 + antYoghurt*12;
        System.out.println("Du må betale: " + pris + "kr.");

        scanner.close();
    }
}
