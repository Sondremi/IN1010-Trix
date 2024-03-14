import java.util.ArrayList;

public class a0208_Fag {
    String navn;
    ArrayList<a0208_Student> studenter = new ArrayList<>();

    public a0208_Fag(String navn) {
        this.navn = navn;
    }
    public String toString() {
        return this.navn;
    }
    public int antStudenter() {
        return studenter.size();
    }
    public void skrivStudenter() {
        for (a0208_Student student : studenter) {
            System.out.println(student.toString());
        }
    }
    public ArrayList<a0208_Student> listeAvStudenter() {
        return studenter;
    }
    public void leggTilStudent(a0208_Student student) {
        if (studenter.contains(student)) {
            System.out.println("Studenten er allerede lagt til i faget.");
        } else {
            studenter.add(student);
            System.out.println("Student lagt til.");
        }
    }
    public void fjernStudent(a0208_Student valgtStudent) {
        if (studenter.contains(valgtStudent)) {
            studenter.remove(valgtStudent);
        } else {
            System.out.println("Kan ikke fjerne student, fordi studenten har ikke registrert seg til faget.");
        }
    }
}