import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uniwersytet uniwersytet = new Uniwersytet();


        Student student1 = new Student("Adam Nowak");
        student1.dodajOcene(4);
        student1.dodajOcene(5);
        student1.dodajOcene(3);
        student1.dodajOcene(4);
        uniwersytet.dodajStudenta(student1);

        Student student2 = new Student("Barbara Kowalska");
        student2.dodajOcene(5);
        student2.dodajOcene(4);
        student2.dodajOcene(4);
        student2.dodajOcene(3);
        uniwersytet.dodajStudenta(student2);

        Student student3 = new Student("Czesław Wiśniewski");
        student3.dodajOcene(3);
        student3.dodajOcene(4);
        student3.dodajOcene(5);
        student3.dodajOcene(3);
        uniwersytet.dodajStudenta(student3);

        Student student4 = new Student("Dorota Lewandowska");
        student4.dodajOcene(4);
        student4.dodajOcene(5);
        student4.dodajOcene(4);
        student4.dodajOcene(4);
        uniwersytet.dodajStudenta(student4);

        Student student5 = new Student("Edward Nowicki");
        student5.dodajOcene(5);
        student5.dodajOcene(3);
        student5.dodajOcene(4);
        student5.dodajOcene(5);
        uniwersytet.dodajStudenta(student5);

        Student student6 = new Student("Elżbieta Dąbrowska");
        student6.dodajOcene(4);
        student6.dodajOcene(4);
        student6.dodajOcene(3);
        student6.dodajOcene(4);
        uniwersytet.dodajStudenta(student6);

        Student student7 = new Student("Franciszek Woźniak");
        student7.dodajOcene(3);
        student7.dodajOcene(4);
        student7.dodajOcene(5);
        student7.dodajOcene(4);
        uniwersytet.dodajStudenta(student7);

        Student student8 = new Student("Grażyna Jankowska");
        student8.dodajOcene(4);
        student8.dodajOcene(4);
        student8.dodajOcene(3);
        student8.dodajOcene(5);
        uniwersytet.dodajStudenta(student8);

        Student student9 = new Student("Henryk Kaczmarek");
        student9.dodajOcene(5);
        student9.dodajOcene(4);
        student9.dodajOcene(4);
        student9.dodajOcene(3);
        uniwersytet.dodajStudenta(student9);

        Student student10 = new Student("Irena Mazur");
        student10.dodajOcene(4);
        student10.dodajOcene(5);
        student10.dodajOcene(3);
        student10.dodajOcene(4);
        uniwersytet.dodajStudenta(student10);

        Student student11 = new Student("Janusz Grabowski");
        student11.dodajOcene(5);
        student11.dodajOcene(3);
        student11.dodajOcene(4);
        student11.dodajOcene(5);
        uniwersytet.dodajStudenta(student11);

        Student student12 = new Student("Jadwiga Piotrowska");
        student12.dodajOcene(4);
        student12.dodajOcene(4);
        student12.dodajOcene(4);
        student12.dodajOcene(3);
        uniwersytet.dodajStudenta(student12);

        Student student13 = new Student("Krzysztof Nowakowski");
        student13.dodajOcene(3);
        student13.dodajOcene(4);
        student13.dodajOcene(5);
        student13.dodajOcene(4);
        uniwersytet.dodajStudenta(student13);

        Student student14 = new Student("Lidia Wołkowicz");
        student14.dodajOcene(4);
        student14.dodajOcene(5);
        student14.dodajOcene(4);
        student14.dodajOcene(4);
        uniwersytet.dodajStudenta(student14);

        Student student15 = new Student("Marek Szymański");
        student15.dodajOcene(5);
        student15.dodajOcene(4);
        student15.dodajOcene(4);
        student15.dodajOcene(3);
        uniwersytet.dodajStudenta(student15);


        Nauczyciel nauczyciel1 = new Nauczyciel("Zofia Kowalczyk", "zofia.kowalczyk@example.com");
        uniwersytet.dodajNauczyciela(nauczyciel1);

        Nauczyciel nauczyciel2 = new Nauczyciel("Janusz Nowicki", "janusz.nowicki@example.com");
        uniwersytet.dodajNauczyciela(nauczyciel2);

        Nauczyciel nauczyciel3 = new Nauczyciel("Krystyna Wiśniewska", "krystyna.wisniewska@example.com");
        uniwersytet.dodajNauczyciela(nauczyciel3);

        Nauczyciel nauczyciel4 = new Nauczyciel("Tomasz Lewandowski", "tomasz.lewandowski@example.com");
        uniwersytet.dodajNauczyciela(nauczyciel4);

        Nauczyciel nauczyciel5 = new Nauczyciel("Grażyna Jankowska", "grazyna.jankowska@example.com");
        uniwersytet.dodajNauczyciela(nauczyciel5);



        while (true) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Wyświetl listę studentów");
            System.out.println("2. Wyświetl listę nauczycieli");
            System.out.println("3. Wyświetl oceny studenta");
            System.out.println("4. Wyślij wiadomość do nauczyciela");
            System.out.println("0. Zakończ program");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // Pobranie znaku nowej linii po wprowadzeniu liczby

            if (wybor == 1) {
                uniwersytet.wyswietlWszystkichStudentow();
            } else if (wybor == 2) {
                uniwersytet.wyswietlWszystkichNauczycieli();
            } else if (wybor == 3) {
                System.out.println("Podaj imię studenta:");
                String imieStudenta = scanner.nextLine();
                Student poszukiwanyStudent = uniwersytet.znajdzStudentaPoImieniu(imieStudenta);
                if (poszukiwanyStudent != null) {
                    System.out.println("Oceny studenta " + imieStudenta + ": " + poszukiwanyStudent.pobierzOceny());
                    System.out.println("Średnia ocen: " + poszukiwanyStudent.sredniaOcen());
                } else {
                    System.out.println("Nie znaleziono studenta o podanym imieniu.");
                }
            } else if (wybor == 4) {
                System.out.println("Podaj imię nauczyciela:");
                String imieNauczyciela = scanner.nextLine();
                Nauczyciel poszukiwanyNauczyciel = uniwersytet.znajdzNauczycielaPoImieniu(imieNauczyciela);
                if (poszukiwanyNauczyciel != null) {
                    System.out.println("Napisz wiadomość:");
                    String wiadomosc = scanner.nextLine();
                    poszukiwanyNauczyciel.wyslijWiadomosc(wiadomosc);
                } else {
                    System.out.println("Nie znaleziono nauczyciela o podanym imieniu.");
                }
            } else if (wybor == 0) {
                System.out.println("Program zakończony.");
                break;
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}