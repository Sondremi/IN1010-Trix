import java.util.ArrayList;

public class a0213_Student {
    String navn;
    int Qscore;
    int Qant;

    public a0213_Student(String navn, int Qscore, int Qant) {
        this.navn = navn;
        this.Qscore = Qscore;
        this.Qant = Qant;
    }

    public String hentNavn() {
        return this.navn;
    }

    public void leggTilQuizScore(int score) {
        this.Qscore += score;
        this.Qant++;
    }

    public int hentTotalScore() {
        return this.Qscore;
    }

    public double hentGjennomsnittligScore() {
        return (Qscore / Qant);
    }
}

class TestStudent {
    public static void main(String[] args) {
        a0213_Student s1 = new a0213_Student("Sondre", 200, 8);
        a0213_Student s2 = new a0213_Student("Mats", 100, 13);
        a0213_Student s3 = new a0213_Student("Mats", 50, 3);

        ArrayList<a0213_Student> studenter = new ArrayList<>();
        studenter.add(s1); studenter.add(s2); studenter.add(s3);
        
        int teller = 1;
        for (a0213_Student student : studenter) {
            System.out.println("\nTester student " + teller);
            student.leggTilQuizScore(20);
            student.leggTilQuizScore(30);
            System.out.println("Total score: " + student.hentTotalScore());
            System.out.println("Gjennomsnittlig score: " + student.hentGjennomsnittligScore());
            teller++;
        }
    }
}