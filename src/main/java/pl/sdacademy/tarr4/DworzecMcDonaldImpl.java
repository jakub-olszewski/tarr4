package pl.sdacademy.tarr4;

/**
 * DworzecMcDonaldImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 05.02.2019 20:56
 **/
public class DworzecMcDonaldImpl implements McDonald{

    // Zadanie: Dodaj implementację metody z interfejsu
    // metoda wypisuje tekst "Frytki"

    @Override//adnotacja nadpisz metode z interfejsu
    public void poproszeFrytki(double kwota) {
        System.out.println("Frytki");
    }

    @Override
    public void poproszeMcFlury(double kwota) {
        System.out.println("McFlury");
    }
}
