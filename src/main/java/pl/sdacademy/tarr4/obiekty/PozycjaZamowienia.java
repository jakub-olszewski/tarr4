package pl.sdacademy.tarr4.obiekty;

/**
 * PozycjaZamowienia
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 19:59
 **/
public class PozycjaZamowienia {

    String nazwa;
    float cena;

    /**
     * Utwórz klasę PozycjaZamowienia
     * Dodaj pola nazwa oraz cena
     * Utwórz metodę pobierzCena() wypisującą cene
     */

    public PozycjaZamowienia(String nazwaZamowienia, float cenaZamowienia)
    {
        nazwa = nazwaZamowienia;
        cena = cenaZamowienia;
    }
    public float pobierzCena()
    {
        return cena;
    }
}
