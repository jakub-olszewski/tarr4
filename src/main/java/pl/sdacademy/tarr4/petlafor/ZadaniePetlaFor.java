package pl.sdacademy.tarr4.petlafor;

import pl.sdacademy.tarr4.obiekty.PozycjaZamowienia;

import java.util.ArrayList;
import java.util.List;

/**
 * ZadaniePetlaFor
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 10:24
 **/
public class ZadaniePetlaFor {

    public static void main(String[] args) {
        /**
         * Zadanie: Wykorzystujac pętle for zsumuj ceny pozycji zamowień
         */
        List<PozycjaZamowienia> listaZamowien = new ArrayList<PozycjaZamowienia>();
        listaZamowien.add(new PozycjaZamowienia("Papier A4",11.15f));
        listaZamowien.add(new PozycjaZamowienia("kanapka",16.99f));
        listaZamowien.add(new PozycjaZamowienia("frytki",6.99f));
        listaZamowien.add(new PozycjaZamowienia("pepsi",4.99f));
        listaZamowien.add(new PozycjaZamowienia("fanta",6.99f));
        listaZamowien.add(new PozycjaZamowienia("woda",8.50f));

        float suma = 0;

        for (PozycjaZamowienia pozycja : listaZamowien){
            System.out.println(pozycja);
            suma +=pozycja.pobierzCena(); // += to zwiększanie
        }

        // uzyj petli for aby zsumowac cylicznie

        System.out.println("Suma wynosi:"+suma);

    }
}
