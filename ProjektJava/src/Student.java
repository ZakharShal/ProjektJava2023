import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Osoba {
    String pobierzImie();
}


interface WysylaczWiadomosci {
    void wyslijWiadomosc(String wiadomosc);
}


class Student implements Osoba {
    private String imie;
    private List<Integer> oceny;

    public Student(String imie) {
        this.imie = imie;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(int ocena) {
        oceny.add(ocena);
    }

    public String pobierzImie() {
        return imie;
    }

    public List<Integer> pobierzOceny() {
        return oceny;
    }

    public double sredniaOcen() {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return (double) suma / oceny.size();
    }
}
