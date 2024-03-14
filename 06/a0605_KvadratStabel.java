class Kvadrat {
    int lengde;

    public Kvadrat(int l) {
        this.lengde = l;
    }
  
    public int areal(){
        return lengde*lengde;
    }
  
    public int omkrets(){
        return 4*lengde;
    }
}

class KvadratStabel{
    private Node start;
  
    public void leggPaa(Kvadrat k){
        if (k == null) {
            throw new IllegalArgumentException("Nullverdi ikke tillatt");
        }
        if (erTom()){
            start = new Node(k);
        } else {
            Node midl = start;
            start = new Node(k);
            start.neste = midl;
        }
    }
  
    public Kvadrat taAv(){
        if (erTom()){
            return null;
        }
        Node midl = start;
        start = start.neste;
        return midl.data;
    }
  
    public boolean erTom(){
        return start == null;
    }
  
    private class Node{
        private Kvadrat data;
        private Node neste;
  
        private Node(Kvadrat data){
            this.data = data;
        }
    }
}

public class a0605_KvadratStabel {
    public static void main(String[] args) {
        KvadratStabel stabel = new KvadratStabel();

        stabel.leggPaa(new Kvadrat(10));
        stabel.leggPaa(new Kvadrat(20));
        stabel.leggPaa(new Kvadrat(30));
        stabel.leggPaa(new Kvadrat(40));
        stabel.leggPaa(new Kvadrat(50));
        stabel.leggPaa(new Kvadrat(60));
        int sum = 0, siste = 0;
        while (!stabel.erTom()){
            Kvadrat k = stabel.taAv();
            sum += k.areal();
            siste = k.areal();
        }
        System.out.println("Summen av kvadratenes areal er " + sum);
        System.out.println("Det siste kvadratet i stabelen har areal: " + siste);
    }
}
