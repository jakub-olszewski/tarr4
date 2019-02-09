package pl.sdacademy.tarr4.kolekcje;

import pl.sdacademy.tarr4.obiekty.Osoba;

import java.util.*;

/**
 * KolekcjeMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 08.02.2019 20:15
 **/
public class KolekcjeMain {
    public static void main(String[] args) {

        // listy
        // ==================================
        List<Osoba> listaOsob = new ArrayList<Osoba>();// lista osób
        List listaOsobInnaImplementacja = new LinkedList();// lista osób innej implementacji wykonania metod

        // lista elementów typu Osoba
        listaOsob.add(new Osoba("Cezary","Cezary"));
        Osoba pobranaOsoba = listaOsob.get(0);

        // sety - zbiory
        // ==================================

        Set<Osoba> zbiorOsob = new HashSet<Osoba>();
        zbiorOsob.add(new Osoba("Anna","Nowak"));
        Osoba pobranaOsobaZeZbioru = zbiorOsob.iterator().next();

        // Mapy
        // ==================================
        Map<String,String> slownik = new HashMap<String,String>();
        slownik.put("Krzesło","Chair");
        String tlumaczenie = slownik.get("Krzesło");

        Map<Long,Osoba> mapaOsobZPeselem = new HashMap<Long,Osoba>();
        mapaOsobZPeselem.put(394889098223L,new Osoba("Jan","Kowalski"));
        // pobranie osoby po numerze pesel
        Osoba osobaPoNumerzePesel = mapaOsobZPeselem.get(29382039482L);

        // kolejki
        // ==================================
        Queue<Osoba> kolejkaOsob = new LinkedList();
        kolejkaOsob.add(new Osoba("Mikołaj","Kopernik"));
        Osoba osobaZKolejki = kolejkaOsob.peek();

    }
}
