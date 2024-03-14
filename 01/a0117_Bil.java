public class a0117_Bil {
    private String merke;
    private String eier;

    public a0117_Bil(String merke, String eier) {
        this.merke = merke;
        this.eier = eier;
    }

    public void skrivUt() {
        System.out.println("Eier: " + this.eier + ", merke: " + this.merke);
    }
}

class a0117_Biltest {
    public static void main(String[] args) {
        a0117_Bil bil1 = new a0117_Bil("Volvo", "Sondre");
        a0117_Bil bil2 = new a0117_Bil("BMW", "Erik");

        bil1.skrivUt();
        bil2.skrivUt();
    }
}
