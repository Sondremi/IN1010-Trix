public class a0801_RekursivUtskrift {
    public static void main(String[] args) {
        rekursivUtskrift(1);        
    }

    public static void rekursivUtskrift(int i) {
        if (i <= 10) {
            System.out.println(i++);
            rekursivUtskrift(i);
        }
    }
}
