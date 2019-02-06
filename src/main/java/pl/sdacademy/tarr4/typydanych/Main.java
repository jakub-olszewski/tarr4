package pl.sdacademy.tarr4.typydanych;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 18:14
 **/
public class Main {

    public static void main(String[] args) {
        // Zadanie: Utwórz zmienna a typu Integer oraz zmienna b typu int
        Integer a;
        int b;
        a = 2;
        b = 2;
        // dodaj zmienne i wynik przypisz do zmiennej c typu int
        int c = a+b;
        // wywolaj metode equals() na zmiennej a
        // jako podaj argument metody podaj b
        // przypisz wynik metody equals() do zmiennej typu boolean
        // o nazwie wynikLogiczny
        boolean wynikLogiczny;
        wynikLogiczny = a.equals(b);
        //boolean wynikLogiczny2 = b.equals(a); // <-- to nie zadziala bo b jest prymitywem
        // wypisz zmienna wynik logiczny na konsole.
        System.out.println(wynikLogiczny);

        // Uwaga!
        // metoda equals() porównuje a.equals(b) porównuje a z b



    }
}
