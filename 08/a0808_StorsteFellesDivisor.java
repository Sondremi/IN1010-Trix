public class a0808_StorsteFellesDivisor {
    public static void main(String[] args) {
        System.out.println("Største GCD i 12 og 10 er: " + gcd(12, 10));
        System.out.println("Riktig? " + (gcd(12, 10) == 2));

        System.out.println("Største GCD i 32 og 28 er: " + gcd(32, 28));
        System.out.println("Riktig? " + (gcd(32, 28) == 4));

        System.out.println("Største GCD i 45 og 40 er: " + gcdIterativ(45, 40));
        System.out.println("Riktig? " + (gcdIterativ(45, 40) == 5));

        System.out.println("Største GCD i 16 og 12 er: " + gcdIterativ(16, 12));
        System.out.println("Riktig? " + (gcdIterativ(16, 12) == 4));
    }

    static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            b = a;
            a = tmp;
        }

        int c = a%b;

        if (c == 0) {
            return b;
        } else {
            a = b;
            b = c;
            return gcd(a, b);
        }
    }

    static int gcdIterativ(int a, int b) {
        if (a < b) {
            int tmp = a;
            b = a;
            a = tmp;
        }

        int c = a%b;

        while (c != 0) {
            a = b;
            b = c;

            c = a%b;
        }

        return b;
    }
}
