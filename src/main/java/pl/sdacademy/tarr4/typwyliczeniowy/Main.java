package pl.sdacademy.tarr4.typwyliczeniowy;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 19:26
 **/
public class Main {

    public static void main(String[] args) {

        // jedna wartość typu wyliczeniowego
        Status zmiennaTypuWyliczeniowego = Status.AKTYWNY;

        // zamiast wielu wartości np napisu
        String status1 = "Aktywny";
        String status2 = "aktywny";
        String status3 = "atywnyy";

        Plec plecUzytkownika = Plec.MEZCZYZNA;
        System.out.println("Płeć użytkownika    " +plecUzytkownika);

    }
}
