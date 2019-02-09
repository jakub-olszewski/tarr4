package pl.sdacademy.tarr4.obiekty;

/**
 * Osoba
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 08.02.2019 20:16
 **/
public class Osoba {
    private final String imie;
    private final String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
