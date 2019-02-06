package pl.sdacademy.tarr4.operatory;

import pl.sdacademy.tarr4.obiekty.PozycjaZamowienia;

/**
 * OperatoryMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 20:03
 **/
public class OperatoryMain {

    public static void main(String[] args) {
        /**
         * Utwórz kilka (3) Pozycji zamówienia (dostępnych w McDonald)
         * Zsumuj ceny pozycji zamówienia
         * Wypisz informacje o produktach oraz sumę wszystkich pozycji
         *
         * Uwagi
         * Uzywamy konstruktorów PozycjaZamowienia
         * Metod pobierzCene()
         * Tworzymy zmienna suma
         * Uzywamy sout'a
         */

        PozycjaZamowienia kanapkaDrwalaPozycja = new PozycjaZamowienia("Kanapka Drwala", 16.95f);
        PozycjaZamowienia mcZestawDuzyPozycja = new PozycjaZamowienia("Zestaw Duzy", 28.70f);
        PozycjaZamowienia frytkiKarbowane = new PozycjaZamowienia("Frytki Karbowane", 12.65f);

        float suma = 0;
        suma = kanapkaDrwalaPozycja.pobierzCena()+ mcZestawDuzyPozycja.pobierzCena()+frytkiKarbowane.pobierzCena();
        System.out.println(suma);
        System.out.println(kanapkaDrwalaPozycja.toString());
        System.out.println(mcZestawDuzyPozycja.toString());
        System.out.println(frytkiKarbowane.toString());

        //Przypisania  =, +=, -=, *=, /=
        // +=   - zwiększenie o
        suma += kanapkaDrwalaPozycja.pobierzCena();// sume zwiekszam o cene kanapki drwala
        suma += mcZestawDuzyPozycja.pobierzCena();
        suma += frytkiKarbowane.pobierzCena();

        // -=   - zmniejszenie o
        int liczbaA = 10;
        liczbaA -= 2;
        // liczbaA wynosi 8

        //Arytmetyczne  +,-,*,/,%,++,--

        // Logiczne  &&, ||, !

        //Relacji  <,<=,>,>=,==, !=

    }
}
