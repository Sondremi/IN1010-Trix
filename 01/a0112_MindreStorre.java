import java.util.Scanner;

public class a0112_MindreStorre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn et tall: ");
        int tall = scanner.nextInt(); 
        scanner.close();

        if (tall < 10) {
            System.out.println("Tallet er mindre enn 10");
        } else if (tall > 20) {
            System.out.println("Tallet er større enn 20");
        } else {
            System.out.println("Tallet er mellom 10 og 20");
        }
    }
}
