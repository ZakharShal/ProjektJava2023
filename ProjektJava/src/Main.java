import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Uniwersytet uniwersytet = new Uniwersytet();
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Adam", List.of(4, 5, 3, 5));
        Student student2 = new Student("Ewa", List.of(5, 4, 4, 3));
        Student student3 = new Student("Piotr", List.of(3, 4, 5, 5));
        Student student4 = new Student("Kasia", List.of(4, 3, 4, 5));
        Student student5 = new Student("Michał", List.of(5, 5, 4, 3));
        Student student6 = new Student("Zakhar", List.of(5, 5, 4, 5));
        Student student7 = new Student("Aleksy", List.of(5, 5, 4, 2));

        Nauczyciel nauczyciel1 = new Nauczyciel("Marta");
        Nauczyciel nauczyciel2 = new Nauczyciel("Piotr");
        Nauczyciel nauczyciel3 = new Nauczyciel("Anna");
        Nauczyciel nauczyciel4 = new Nauczyciel("Tomasz");
        Nauczyciel nauczyciel5 = new Nauczyciel("Karolina");


        uniwersytet.dodajStudenta(student1);
        uniwersytet.dodajStudenta(student2);
        uniwersytet.dodajStudenta(student3);
        uniwersytet.dodajStudenta(student4);
        uniwersytet.dodajStudenta(student5);
        uniwersytet.dodajStudenta(student6);
        uniwersytet.dodajStudenta(student7);


        uniwersytet.dodajNauczyciela(nauczyciel1);
        uniwersytet.dodajNauczyciela(nauczyciel2);
        uniwersytet.dodajNauczyciela(nauczyciel3);
        uniwersytet.dodajNauczyciela(nauczyciel4);
        uniwersytet.dodajNauczyciela(nauczyciel5);


        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl listę studentów");
            System.out.println("2. Wyświetl listę nauczycieli");
            System.out.println("3. Wyświetl oceny studenta");
            System.out.println("4. Wyświetl średnią ocenę studenta");
            System.out.println("0. Wyjście z programu");

            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1:
                    uniwersytet.wyswietlWszystkichStudentow();
                    break;
                case 2:
                    uniwersytet.wyswietlWszystkichNauczycieli();
                    break;
                case 3:
                    System.out.print("Podaj imię studenta: ");
                    String imie = scanner.nextLine();
                    Student student = uniwersytet.znajdzStudentaPoImieniu(imie);
                    if (student != null) {
                        System.out.println("Oceny studenta " + imie + ": " + student.getOceny());
                    } else {
                        System.out.println("Nie znaleziono studenta o podanym imieniu.");
                    }
                    break;
                case 4:
                    System.out.print("Podaj imię studenta: ");
                    String imieSrednia = scanner.nextLine();
                    uniwersytet.wyswietlSredniaOceneStudenta(imieSrednia);
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }
    }
}
