package pl.sdacademy.tarr4.dziedziczenie;

import pl.sdacademy.tarr4.dziedziczenie.figury.Kolo;
import pl.sdacademy.tarr4.dziedziczenie.figury.Kwadrat;
import pl.sdacademy.tarr4.dziedziczenie.figury.Prostokat;
import pl.sdacademy.tarr4.dziedziczenie.figury.Trojkat;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 15:01
 **/
public class Main {
    public static void main(String[] args) {

        /**
         * Zadanie: Stwórz klasy Kwadrat, Koło, Prostokąt i Trójkąt
         * Każda klasa posiada metodę:
         * obliczObwod(); - oblicza i zwraca obwód
         * posiada konstruktor z danymi do obliczenia obwodu
         * pola - niezbędne do obliczenia obwodu
         */
        Kwadrat kwadrat = new Kwadrat(4f);
        Trojkat trojkat = new Trojkat(3f,4f,5f);
        Prostokat prostokat = new Prostokat(4f,3f);
        Kolo kolo = new Kolo(5f);

        // Zadanie 1
        // stwórz klase abstrakcyjną Figura
        // public abstract class Figura{}

        // Zadanie 2
        // stwórz listę elementów Figura
        // dodaj powyżej figury do listy

        // Zadanie 3
        // w pętli zsumuj obwody wszystkich figur
        // wypisz sumę


    }
}
