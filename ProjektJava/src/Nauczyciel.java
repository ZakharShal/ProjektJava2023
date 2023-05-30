
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Nauczyciel implements Osoba, WysylaczWiadomosci {
    private String imie;
    private String email;

    public Nauczyciel(String imie, String email) {
        this.imie = imie;
        this.email = email;
    }

    public String pobierzImie() {
        return imie;
    }

    public String pobierzEmail() {
        return email;
    }

    public void wyslijWiadomosc(String wiadomosc) {
        System.out.println("Wiadomość dla nauczyciela " + imie + ":");
        System.out.println(wiadomosc);
        System.out.println("Wysłano na adres: " + email);
    }
}