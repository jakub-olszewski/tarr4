package pl.sdacademy.tarr4.operatory;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 17:46
 **/
public class Zadanie {
    public static void main(String[] args) {
        /**
         * Zaimplementuj  metody
         * wykorzystując wcześniej poznane operatory.
         * Metody : liczba parzysta, liczba ujemna
         * Metody zwracają prawdę lub fałsz
         * Metody przyjmują argument liczba całkowita
         */
        boolean liczbaJestParzysta = liczbaParzysta(4);
        System.out.println("Powinno być true :"+liczbaJestParzysta);

        boolean liczbaNieJestParzysta = liczbaParzysta(5);
        System.out.println("Powinno być true :"+!liczbaNieJestParzysta);
        boolean toJestPrawda = !false;

        boolean pytanie = !((5<3 || 4>100) && 4<123);
        System.out.println("Odpowiedz na pytanie: "+pytanie);

        boolean liczbaJestUjemna = liczbaUjemna(-3);
        System.out.println("Powinno być true :"+liczbaJestUjemna);

        boolean liczbaNieJestUjemna = liczbaUjemna(3);
        System.out.println("Powinno być true :"+!liczbaNieJestUjemna);

    }

    private static boolean liczbaUjemna(int i) {
        return i<0;
    }

    private static boolean liczbaParzysta(int i) {
        return i%2==0;
    }


}
