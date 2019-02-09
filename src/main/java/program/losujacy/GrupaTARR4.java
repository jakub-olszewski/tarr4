package program.losujacy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * GrupaTARR4
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 09:47
 **/
public class GrupaTARR4 {
    public static void main(String[] args) {

        Map<String, Boolean> listaOsob = new HashMap();
        listaOsob.put("Radosław Studniarski", false);
        listaOsob.put("Piotr Tomaszewski", false);
        listaOsob.put("Milana Kalisz", false);
        listaOsob.put("Marcin Kiński", false);
        listaOsob.put("Marcin Napierała", false);
        listaOsob.put("Artur Sikora", false);
        listaOsob.put("Krzysztof Sawicki", false);
        listaOsob.put("Maciej Fifielski", false);
        listaOsob.put("Radosław Błaszczak", false);
        listaOsob.put("Rafał Lewandowski", false);
        listaOsob.put("Małgorzata Lewandowska", false);
        listaOsob.put("Mateusz Mielcarz", false);
        listaOsob.put("Sławomir Nowak", false);
        listaOsob.put("Karol Wróblewicz", false);
        listaOsob.put("Alan Narożny", false);
        listaOsob.put("Damian Rzepecki", false);
        listaOsob.put("Katarzyna Gawrońska", false);
        listaOsob.put("Mirosław Wróblewski", false);

        int licznikLosowan = 1;
        Object wylosowanyOsoba;
        while (true) {
            int czyLosowo = getRandomNumberInRange(0, 1);
            if(czyLosowo==1)
            {
                wylosowanyOsoba = wylosowanieOsobyKtorejNieBylo(listaOsob);
            }else {
                wylosowanyOsoba = losowanieOsoby(listaOsob);
            }

            System.out.print("Losowanie nr "+licznikLosowan+"\n");
            for (int i = 3; i > 0; i--) {
                System.out.print(" " + (i));
                waitSecond();
            }

            System.out.println("\nWylosowano: " + wylosowanyOsoba);
            Scanner skaner = new Scanner(System.in);
            System.out.println("[Enter następne losowanie]");
            System.out.println("[Aby zakończyć wciśnij 'q']");

            // kto nie byl

            String koniec = skaner.nextLine();
            if(koniec.equalsIgnoreCase("q")) {
                break;
            }

            licznikLosowan++;
        }
        System.out.println("Program zakończony!");

    }

    private static Object wylosowanieOsobyKtorejNieBylo(Map<String, Boolean> listaOsob) {
        boolean czyOsobaJuzByla = true;
        Object wylosowanyOsoba = null;

        while (czyOsobaJuzByla) {

            wylosowanyOsoba = losowanieOsoby(listaOsob);

            czyOsobaJuzByla = listaOsob.get(wylosowanyOsoba);

            if (listaOsob.get(wylosowanyOsoba)) {
                // byla wylosowana
                // losujemy dalej
            } else {
                // nie byla wylosowana
                // koniec
                listaOsob.put(wylosowanyOsoba.toString(), true);// zmiana na wybrana
                break;
            }

            // reset
            // gdy wszyscy byli
            resetowanieGdyWszyscyByli(listaOsob);
        }
        return wylosowanyOsoba;
    }

    private static void resetowanieGdyWszyscyByli(Map<String, Boolean> listaOsob) {
        boolean czyWszyscyByli = true;
        for(Map.Entry<String, Boolean> entry : listaOsob.entrySet()) {
            //String nazwaOsoby = entry.getKey();
            Boolean czyByl = entry.getValue();

            if(!czyByl) {
                czyWszyscyByli = false;
                break;
            }

        }
        if(czyWszyscyByli) {
            //reset
            for(Map.Entry<String, Boolean> entry : listaOsob.entrySet()) {
                String nazwaOsoby = entry.getKey();
                listaOsob.put(nazwaOsoby, false);
            }
        }
    }

    private static Object losowanieOsoby(Map<String, Boolean> listaOsob) {
        Object wylosowanyOsoba;
        int wylosowanaPozycja = getRandomNumberInRange(0, listaOsob.size() - 1);
        Object[] osoby = listaOsob.keySet().toArray();
        wylosowanyOsoba = osoby[wylosowanaPozycja];
        return wylosowanyOsoba;
    }

    private static void waitSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
