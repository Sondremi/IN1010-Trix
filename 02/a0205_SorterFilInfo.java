import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class a0205_Hund {
    String navn;

    public a0205_Hund(String navn) {
        this.navn = navn;
    }
    public String hentNavn() {
        return this.navn;
    }
}

class a0205_Person {
    String navn;
    
    public a0205_Person(String navn) {
        this.navn = navn;
    }
    public String hentNavn() {
        return this.navn;
    }
}

public class a0205_SorterFilInfo {
    public static void main(String[] args) {
        File fil = new File("navn.txt");

        Scanner filleser = null;
        try {
            filleser = new Scanner(fil);
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen!");
        }

        ArrayList<a0205_Hund> hunder = new ArrayList<>();
        ArrayList<a0205_Person> personer = new ArrayList<>();

        String linje = "";
        while (filleser.hasNextLine()) {
            linje = filleser.nextLine();
            
            String[] delt = linje.split(" ");

            if (delt[0].equals("H")) {
                a0205_Hund hund = new a0205_Hund(delt[1]);
                hunder.add(hund);
            } else if (delt[0].equals("P")) {
                a0205_Person person = new a0205_Person(delt[1]);
                personer.add(person);
            } else {
                System.out.println("Feil format!");
            }
        }

        System.out.println("\nHunder: ");
        for (a0205_Hund hund : hunder) {
            System.out.println(hund.hentNavn());
        }
        System.out.println("\nPersoner: ");
        for (a0205_Person person : personer) {
            System.out.println(person.hentNavn());
        }
    }
}
