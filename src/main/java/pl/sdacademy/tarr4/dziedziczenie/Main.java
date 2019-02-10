package pl.sdacademy.tarr4.dziedziczenie;

import pl.sdacademy.tarr4.dziedziczenie.figury.Kolo;
import pl.sdacademy.tarr4.dziedziczenie.figury.Kwadrat;
import pl.sdacademy.tarr4.dziedziczenie.figury.Prostokat;
import pl.sdacademy.tarr4.dziedziczenie.figury.Trojkat;

import java.util.ArrayList;
import java.util.List;

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


        List<Object> listaFigur = new ArrayList<>();
        listaFigur.add(kwadrat);
        listaFigur.add(kolo);
        listaFigur.add(prostokat);
        listaFigur.add(trojkat);

        float suma=0; // suma wszystkich obwodow
        for(Object figura : listaFigur){
            /**
             * Sumowanie obwodow w petli
             */
            System.out.println(figura);
        }

        System.out.printf("Suma wszystkich obwodów równa %.2f",suma);
    }
}
