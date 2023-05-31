
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
            student.przedstawSie();
        }
    }

    public void wyswietlWszystkichNauczycieli() {
        System.out.println("Lista nauczycieli:");
        for (Nauczyciel nauczyciel : nauczyciele) {
            nauczyciel.przedstawSie();
        }
    }

    public Student znajdzStudentaPoImieniu(String imie) {
        for (Student student : studenci) {
            if (student.getImie().equals(imie)) {
                return student;
            }
        }
        return null;
    }

    public void wyswietlSredniaOceneStudenta(String imie) {
        Student student = znajdzStudentaPoImieniu(imie);
        if (student != null) {
            List<Integer> oceny = student.getOceny();
            if (!oceny.isEmpty()) {
                double srednia = oceny.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0);
                System.out.println("Średnia ocena studenta " + imie + ": " + srednia);
            } else {
                System.out.println("Student " + imie + " nie ma jeszcze żadnych ocen.");
            }
        } else {
            System.out.println("Nie znaleziono studenta o podanym imieniu.");
        }
    }
}