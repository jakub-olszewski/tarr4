package pl.sdacademy.tarr4.kolekcje;

import javafx.stage.Popup;
import pl.sdacademy.tarr4.obiekty.PozycjaZamowienia;

import java.util.ArrayList;
import java.util.List;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 09:16
 **/
public class Zadanie {
    public static void main(String[] args) {
        /**
         * Zadanie: Refaktoring tablicy PozycjeZamowienia
         * z wykorzystaniem odpowiedniej kolekcji
         * oraz wyświetlenie wybrane()o elementu z kolekcji.
         */
        List<PozycjaZamowienia> listaZamowien = new ArrayList<PozycjaZamowienia>();
        //List listPrzebojow;
        //List<Object> listPrzebojow2;
        listaZamowien.add(new PozycjaZamowienia("Papier A4",11.15f));
        listaZamowien.add(new PozycjaZamowienia("kanapka",16.99f));
        listaZamowien.add(new PozycjaZamowienia("frytki",6.99f));
        listaZamowien.add(new PozycjaZamowienia("pepsi",4.99f));
        listaZamowien.add(new PozycjaZamowienia("fanta",6.99f));
        listaZamowien.add(new PozycjaZamowienia("woda",8.50f));

        PozycjaZamowienia pozycja4 = listaZamowien .get(3);
        System.out.println(pozycja4);

    }
}
