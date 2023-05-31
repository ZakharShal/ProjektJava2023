
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Nauczyciel extends Uczestnik {
    public Nauczyciel(String imie) {
        super(imie);
    }

    public void przedstawSie() {
        System.out.println("Jestem nauczycielem o imieniu " + imie);
    }
}