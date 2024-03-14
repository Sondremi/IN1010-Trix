import java.util.Scanner;

public class a0126_Produkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi et tall: ");
        int x = scanner.nextInt();

        System.out.print("Oppgi et nytt tall: ");
        int y = scanner.nextInt();

        scanner.close();
        
        System.out.println("Produktet av " + x + " og " + y + " er " + (x * y));
    }
}
