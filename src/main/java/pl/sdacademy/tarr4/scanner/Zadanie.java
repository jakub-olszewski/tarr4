package pl.sdacademy.tarr4.scanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 13:47
 **/
public class Zadanie {
    public static void main(String[] args) {

        /**
         * pobrać 5 liczb w postaci listy
         * z użyciem pętli
         * i wypisać ujemne z użyciem pętli
         * gdy nie ma ujemnych wypisuje
         * stosowną informację o braku.
         *
         * nextInt() - pobieranie liczby
         * nextLine() - pobranie tekstu
         */

        // skaner obiekt typu Scanner umożliwia pobieranie z klawiatury
        Scanner skaner = new Scanner(System.in);

        System.out.println("Cześć, Jak masz na imię?");
        String pobranyNapis = skaner.nextLine();// pobranie imienia
        System.out.println(pobranyNapis+" dawno Cię nie słyszałem!");
        System.out.println("Proszę podaj 5 liczb.");

        //podawanie 5 liczb w petli do listy
        List<Integer> listaLiczb = new ArrayList<Integer>();// tworzeni listy
        for(int i=1;i<=5;i++){
            System.out.println("podaj "+i+" liczbe:");
            int liczbaProwadzona = skaner.nextInt();// pobieranie liczby
            listaLiczb.add(liczbaProwadzona);// dodanie liczby do listy
        }
        System.out.println("Wprowadził/eś/aś:");
        System.out.println(listaLiczb);// wypisanie liczb
        //szukanie na liście liczb mniejszych od zera
        boolean brakUjemnych = true;
        for (int pozycja: listaLiczb){
            if (pozycja <0){
                System.out.println(pozycja+" liczba jest ujemna");
                brakUjemnych = false;
            }
        }
        if (brakUjemnych){
            System.out.println("Brak ujemnych");
        }
        //wyswietlenie wynikow
    }
}
