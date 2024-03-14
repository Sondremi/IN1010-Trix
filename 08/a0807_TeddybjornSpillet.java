public class a0807_TeddybjornSpillet {
    public static void main(String[] args) {
        System.out.println("Du vinner spillet med 250: " + teddy(250));
        System.out.println("Du vinner spillet med 84: " + teddy(84));
        System.out.println("Du vinner spillet med 42: " + teddy(42));
        System.out.println("Du vinner spillet med 53: " + teddy(53));
        System.out.println("Du vinner spillet med 41: " + teddy(41));
    }

    static boolean teddy(int n) {
        return teddyRekursiv(n, "");
    }

    static boolean teddyRekursiv(int n, String path) {
        if (n == 42) {
            return true;
        }
        if (n <= 0 || path.contains(""+n)) {
            return false;
        }
        if (n%5 != 0 && n%2 != 0 && n%3 != 0 && n%4 != 0) {
            return false;
        } 

        boolean loypeEn = true;
        boolean loypeTo = true;
        boolean loypeTre = true;

        if (n%5 == 0) {
            loypeEn = teddyRekursiv(n-42, path += " " + (n-42));
        }
        if (n%2 == 0) {
            loypeTo = teddyRekursiv(n/2, path += " " + (n/2));
        }
        if (n%3 == 0 || n%4 == 0) {
            int nyttTall = (n%10) * ((n*100)/10);
            loypeTre = teddyRekursiv(nyttTall, path += " " + nyttTall);
        }
        return loypeEn || loypeTo || loypeTre;
    }
}
