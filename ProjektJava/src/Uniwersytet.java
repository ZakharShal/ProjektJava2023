
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Uniwersytet {
    private List<Student> studenci;
    private List<Nauczyciel> nauczyciele;

    public Uniwersytet() {
        studenci = new ArrayList<>();
        nauczyciele = new ArrayList<>();
    }

    public void dodajStudenta(Student student) {
        studenci.add(student);
    }

    public void dodajNauczyciela(Nauczyciel nauczyciel) {
        nauczyciele.add(nauczyciel);
    }

    public void wyswietlWszystkichStudentow() {
        System.out.println("Lista studentów:");
        for (Student student : studenci) {
            System.out.println(student.pobierzImie());
        }
        System.out.println();
    }

    public void wyswietlWszystkichNauczycieli() {
        System.out.println("Lista nauczycieli:");
        for (Nauczyciel nauczyciel : nauczyciele) {
            System.out.println(nauczyciel.pobierzImie());
        }
        System.out.println();
    }

    public Student znajdzStudentaPoImieniu(String imie) {
        for (Student student : studenci) {
            if (student.pobierzImie().equals(imie)) {
                return student;
            }
        }
        return null;
    }

    public Nauczyciel znajdzNauczycielaPoImieniu(String imie) {
        for (Nauczyciel nauczyciel : nauczyciele) {
            if (nauczyciel.pobierzImie().equals(imie)) {
                return nauczyciel;
            }
        }
        return null;
    }
}