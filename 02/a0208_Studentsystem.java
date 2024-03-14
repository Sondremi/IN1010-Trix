import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class a0208_Studentsystem {
    private HashMap<String, a0208_Fag> fagListe = new HashMap<String, a0208_Fag>();
    private HashMap<String, a0208_Student> studentListe = new HashMap<String, a0208_Student>();
    private Scanner scanner = new Scanner(System.in);

    public void lesFil(String fil) {
        Scanner filleser = null;
        try {
            filleser = new Scanner(new File(fil));
        } catch (FileNotFoundException e) {
            System.out.println("Filen finnes ikke.");
        }

        String linje;
        a0208_Fag fag = null;
        while (filleser.hasNextLine()) {
            linje = filleser.nextLine();
        
            // Hvis neste linje er et fag
            if (linje.startsWith("*")) {
                //String[] delt = linje.split("*");
                fag = new a0208_Fag(linje.substring(1));
                fagListe.put(fag.toString(), fag);
            // Hvis neste linje er en student
            } else {
                a0208_Student student;
                if (studentListe.containsKey(linje)) {
                    student = studentListe.get(linje);
                } else {
                    student = new a0208_Student(linje);
                    studentListe.put(student.toString(), student);
                }
                student.leggTilFag(fag);
                fag.leggTilStudent(student);
            }
        }
    }

    public void meny() {
        System.out.println("\n*************STUDENTSYSTEM***********");
        System.out.println("1: Legg til ny student.");
        System.out.println("2: Legg til nytt fag.");
        System.out.println("3: Skriv ut alle studenter som tar et spesifikt fag.");
        System.out.println("4: Skriv ut alle fag en spesifikk student tar");
        System.out.println("5: Meld opp en student til et emne.");
        System.out.println("6: Meld av en student til et emne.");
        System.out.println("7: Fjern en student fra systemet.");
        System.out.println("8: Fjern et fag fra systemet.");
        System.out.println("9: Finne ut hvilket fag som blir tatt av flest studenter.");
        System.out.println("10: Finne ut hvilken student som tar flest fag.");
        System.out.println("11: Skriv ut alle fag og hvilke studenter som tar de.");
        System.out.println("0: Avslutt.");
    }

    public void ordrelokke() throws Exception {
        int inp = -1;

        while(inp != 0) {
            if(inp == 1){
                leggTilNyStudent();
            } else if(inp == 2){
                leggTilNyttFag();
            } else if(inp == 3){
                skrivUtAlleStudenterSomTarFag();
            } else if(inp == 4){
                skrivUtAlleFagSomStudentTar();
            } else if(inp == 5){
                meldOppStudentTilEmne();
            } else if(inp == 6){
                meldAvStudentTilEmne();
            } else if(inp == 7){
                slettStudent();
            } else if(inp == 8){
                slettFag();
            } else if(inp == 9){
                finnMestPopulaereFag();
            } else if(inp == 10){
                finnMestArbeidsommeStudent();
            } else if(inp == 11){
                skrivUtAlleFagMedTilhorendeStudenter();
            }

            meny();
            System.out.print("Valg: ");
            inp = Integer.parseInt(scanner.nextLine());
        }
        skrivTilFil();
    }

    public void leggTilNyStudent() {
        System.out.print("Oppgi navn på den nye studenten: ");
        String navn = scanner.nextLine();
        a0208_Student student = new a0208_Student(navn);
        studentListe.put(student.toString(), student);
    }

    public void leggTilNyttFag() {
        System.out.print("Oppgi navn på det nye faget: ");
        String navn = scanner.nextLine();
        a0208_Fag fag = new a0208_Fag(navn);
        fagListe.put(fag.toString(), fag);
    }

    public void skrivUtAlleStudenterSomTarFag() {
        System.out.print("Oppgi en navnet på faget du vil se studentlisten til: ");
        String navn = scanner.nextLine();
        a0208_Fag fag = fagListe.get(navn);
        fag.skrivStudenter();
    }

    public void skrivUtAlleFagSomStudentTar() {
        System.out.print("Oppgi navnet på eleven du vil se fagene til: ");
        String navn = scanner.nextLine();
        a0208_Student student = studentListe.get(navn);
        student.skrivFag();
    }

    public void meldOppStudentTilEmne() {
        System.out.print("Oppgi navn på student du vil melde opp til et emne: ");
        String sNavn = scanner.nextLine();

        System.out.print("Oppgi navn på emnet: ");
        String fNavn = scanner.nextLine();

        a0208_Student student = new a0208_Student(sNavn);
        a0208_Fag fag = new a0208_Fag(fNavn);

        fag.leggTilStudent(student);
    }

    public void meldAvStudentTilEmne() {
        System.out.print("Oppgi navn på student du vil melde av et emne: ");
        String sNavn = scanner.nextLine();

        System.out.print("Oppgi navn på emnet: ");
        String fNavn = scanner.nextLine();

        a0208_Student student = studentListe.get(sNavn);
        a0208_Fag fag = fagListe.get(fNavn);

        fag.fjernStudent(student);
    }

    public void slettStudent() {
        System.out.print("Oppgi navn på student du vil slette: ");
        String navn = scanner.nextLine();

        studentListe.remove(navn);
    }

    public void slettFag() {
        System.out.print("Oppgi navn på faget du vil slette: ");
        String navn = scanner.nextLine();

        fagListe.remove(navn);
    }

    public void finnMestPopulaereFag() {
        a0208_Fag mestPopFag = null;
        for (a0208_Fag fag : fagListe.values()) {
            if (mestPopFag == null) {
                mestPopFag = fag;
            } else {
                if (fag.antStudenter() > mestPopFag.antStudenter()) {
                    mestPopFag = fag;
                }
            }
        }
        System.out.println("Det mest populære faget er " + mestPopFag.toString());
    }

    public void finnMestArbeidsommeStudent() {
        a0208_Student mestArbeidsommeStudent = null;
        for (a0208_Student student : studentListe.values()) {
            if (mestArbeidsommeStudent == null) {
                mestArbeidsommeStudent = student;
            } else {
                if (student.antFag() > mestArbeidsommeStudent.antFag()) {
                    mestArbeidsommeStudent = student;
                }
            }
        }
        System.out.println("Studenten som tar flest fag er " + mestArbeidsommeStudent.toString());
    }

    public void skrivUtAlleFagMedTilhorendeStudenter() {
        for (a0208_Fag fag : fagListe.values()) {
            System.out.println(fag.toString());
            fag.skrivStudenter();
            System.out.println("");
        }
    }

    public void skrivTilFil() throws Exception{
        PrintWriter skriver = new PrintWriter("emnestudenter2.txt");
        for (a0208_Fag detteFaget : fagListe.values()) {
            skriver.println("*" + detteFaget.toString());
            ArrayList<a0208_Student> listeAvStudenterSomTarFaget = detteFaget.listeAvStudenter();
            for (a0208_Student denneStudenten : listeAvStudenterSomTarFaget) {
                skriver.println(denneStudenten);
            }
        }

        skriver.close();
    }

}