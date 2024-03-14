interface Figur {
    public abstract double beregnAreal();
    public abstract double beregnOmkrets();
}

class Rektangel implements Figur {
    private double lengde;
    private double bredde;
    public Rektangel(double lengde, double bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }
    public double beregnAreal() {
        return lengde*bredde;
    }
    public double beregnOmkrets() {
        return 2*lengde+2*bredde;
    }
}

class Sirkel implements Figur {
    private double radius;
    public Sirkel(double radius) {
        this.radius = radius;
    }
    public double beregnAreal() {
        return Math.PI* Math.pow(radius, radius);
    }
    public double beregnOmkrets() {
        return 2 * Math.PI * radius;
    }
}

class Test {
    public static void main(String[] args) {
        Rektangel r = new Rektangel(10,15);
        Sirkel s = new Sirkel(20);
      
        System.out.println(r.beregnAreal());  
        System.out.println(r.beregnOmkrets());
        
        System.out.println(s.beregnAreal());
        System.out.println(s.beregnOmkrets());
    }
}