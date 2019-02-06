package pl.sdacademy.tarr4.obiekty;

/**
 * Zamowienie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 19:35
 **/
public class Zamowienie {
    /**
     * Zadanie: Utwórz klasę Zamówienie
     * Dodaj pola numer oraz cena
     * Utwórz metodę pobierzCena() wypisującą cene
     */
    int numer;
    float cena;

    public float pobierzCene() {
        return cena;
    }
    public Zamowienie (int wprowadzonyNumer, float wprowadzonaCena){
        cena =  wprowadzonaCena;
        numer = wprowadzonyNumer;
    }


}
