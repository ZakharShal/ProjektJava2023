import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student extends Uczestnik {
    private List<Integer> oceny;

    public Student(String imie, List<Integer> oceny) {
        super(imie);
        this.oceny = oceny;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public void przedstawSie() {
        System.out.println("Jestem studentem o imieniu " + imie);
    }
}
