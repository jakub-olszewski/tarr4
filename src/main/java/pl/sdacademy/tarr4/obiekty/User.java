package pl.sdacademy.tarr4.obiekty;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 18:46
 **/
public class User {
    /**
     * Zadanie
     * Utwórz klasę User
     * Dodaj pola imię nazwisko oraz wiek
     * Utwórz metodę toString() wypisującą informacje o User
     */
    String imie;
    String nazwisko;
    int wiek;

    @Override
    public String toString() {
        return imie+ " " +nazwisko+ " "+wiek;
    }

    public User(){
        imie = "Imie";
        nazwisko = "Nazwisko";
        wiek = 0;
    }
}
