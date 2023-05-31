import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
abstract class Uczestnik {
    protected String imie;

    public Uczestnik(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public abstract void przedstawSie();
}
