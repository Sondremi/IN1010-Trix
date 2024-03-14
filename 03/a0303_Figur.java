import java.util.ArrayList;

abstract class a0303_Figur {
    public abstract double areal();
}

class a0303_Kvadrat extends a0303_Figur {
    int sidelengde;

    public a0303_Kvadrat(int sidelengde) {
        this.sidelengde = sidelengde;
    }
    @Override
    public double areal() {
        return sidelengde*sidelengde;
    }
}

class a0303_Rektangel extends a0303_Figur {
    int bredde;
    int lengde;
    
    public a0303_Rektangel(int bredde, int lengde) {
        this.bredde = bredde;
        this.lengde = lengde;
    }
    @Override
    public double areal() {
        return bredde*lengde;
    }
}

class a0303_Sirkel extends a0303_Figur {
    int radius;

    public a0303_Sirkel(int radius) {
        this.radius = radius;
    }
    @Override
    public double areal() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class a0303_Trekant extends a0303_Figur {
    int hoyde;
    int grunnlinje;

    public a0303_Trekant(int hoyde, int grunnlinje) {
        this.hoyde = hoyde;
        this.grunnlinje = grunnlinje;
    }
    @Override
    public double areal() {
        return (grunnlinje * hoyde) / 2;
    }
}

class TestFigurer {
    public static void main(String[] args) {
        ArrayList<a0303_Figur> figurer = new ArrayList<>();
       
        figurer.add(new a0303_Trekant(2, 3));
        figurer.add(new a0303_Sirkel(3));
        figurer.add(new a0303_Rektangel(3, 7));
        figurer.add(new a0303_Kvadrat(4));

        double areal = 0;
        for (a0303_Figur figur : figurer) {
            areal += figur.areal();
        }

        System.out.println("Arealet av figurene er: " + areal);
    }
}