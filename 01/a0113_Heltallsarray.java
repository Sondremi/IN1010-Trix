public class a0113_Heltallsarray {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        System.out.println(""+a+b+c+d+e);

        int[] intarray = new int[5];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = i;
        }

        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
    }
}
