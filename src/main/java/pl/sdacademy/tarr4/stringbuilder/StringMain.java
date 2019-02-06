package pl.sdacademy.tarr4.stringbuilder;

/**
 * StringMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 20:27
 **/
public class StringMain {

    public static void main(String[] args) {

        String napisCudzyslow = "";
        String napisZKonstruktora = new String("Tekst");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";

        System.out.println(napis); // wyswietli: Liczba %d
        // \n - oznacza znak entera nowa linia
        System.out.printf(napis,12); // wyswietli:
        // %d decimal - liczba
        System.out.println("Napis");
        System.out.println(napisZKonstruktora);
        System.out.println(napisNull);
        //System.out.println(napisBezInicjalizacji); // brak zainicjalizowanej wartosci - błąd
    }
}
