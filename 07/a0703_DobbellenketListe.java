class DobbelLenke<T> {
    private Node foerste;

    private class Node {
        private T data;
        private Node forrje;
        private Node neste;

        private Node(T data) {
            this.data = data;
        }

        public T hentData(){
            return data;
        }

        public Node hentNeste() {
            return neste;
        }

        public void settNeste(Node neste) {
            this.neste = neste;
            neste.settForrje(this);
        }

        public void settForrje(Node forrje) {
            this.forrje = forrje;
        } 
    }

    public void settInn(T element) {
        if (foerste == null) {
            foerste = new Node(element);
        } else {
            Node node = foerste;
            while (node.hentNeste() != null) {
                node = node.hentNeste();
            }
            Node nyNode = new Node(element);
            node.settNeste(nyNode);
            nyNode.settForrje(node);

        }
    }

    public void skrivUt() {
        Node node = foerste;
        while (node != null) {
            System.out.println(node.hentData());
            node = node.neste;
        }
    }
}

class TestDobbelLenke {
    public static void main(String[] args) {
        DobbelLenke<Katt> katteLenke = new DobbelLenke<>();

        katteLenke.settInn(new Katt("Sondre", 2));
        katteLenke.settInn(new Katt("Petter", 5));
        katteLenke.settInn(new Katt("Guro", 10));

        katteLenke.skrivUt();
    }
}