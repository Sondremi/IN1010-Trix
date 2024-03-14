import java.util.Scanner;

public class a0125_Differanse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi et tall: ");
        int x = scanner.nextInt();

        System.out.print("Oppgi et nytt tall: ");
        int y = scanner.nextInt();

        scanner.close();
        
        differanse(x, y);
    }
    public static void differanse(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
            System.out.println("Differansen mellom " + x + " og " + y + " er: " + diff);
        } else {
            diff = y - x;
            System.out.println("Differansen mellom " + y + " og " + x + " er: " + diff);

        }
    }
}
