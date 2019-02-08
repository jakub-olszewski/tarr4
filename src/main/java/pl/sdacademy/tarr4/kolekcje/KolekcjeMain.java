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
        List listaOsob = new ArrayList<Osoba>();// lista osób
        // lista elementów typu Osoba
        listaOsob.add(new Osoba());

        // sety - zbiory
        Set zbiorOsob = new HashSet<Osoba>();
        zbiorOsob.add(new Osoba());

        // Mapy
        Map<String,String> slownik = new HashMap<String,String>();
        slownik.put("Krzesło","Chair");

        // kolejki
        Queue<Osoba> kolejkaOsob = null;
        kolejkaOsob.add(new Osoba());
        
    }
}
