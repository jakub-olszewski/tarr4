package pl.sdacademy.tarr4.tablice;

import pl.sdacademy.tarr4.obiekty.PozycjaZamowienia;
import pl.sdacademy.tarr4.obiekty.User;
import pl.sdacademy.tarr4.obiekty.Zamowienie;

/**
 * TabliceMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 08.02.2019 19:03
 **/
public class TabliceMain {
    public static void main(String[] args) {

        String[] tablicaKrolow = new String[3];
        tablicaKrolow[0] = "Baltazar";
        tablicaKrolow[1] = "Melchior";
        tablicaKrolow[2] = new String("Kacper");

        System.out.println(tablicaKrolow[2]);

        User[] tablicaUzytkownikow = new User[5];
        tablicaUzytkownikow[0] = new User();

        /**
         * Zadanie: Utworz tablice 5 pozycji zamowienia
         */
        PozycjaZamowienia[] zamowienia = new PozycjaZamowienia[5];
        zamowienia[0] = new PozycjaZamowienia("kanapka",16.99f);
        zamowienia[1] = new PozycjaZamowienia("frytki",6.99f);
        zamowienia[2] = new PozycjaZamowienia("pepsi",4.99f);
        zamowienia[3] = new PozycjaZamowienia("fanta",6.99f);
        zamowienia[4] = new PozycjaZamowienia("woda",8.50f);




    }
}
