package pl.sdacademy.tarr4.instrukcjaswitch;

import pl.sdacademy.tarr4.typwyliczeniowy.Status;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 08.02.2019 18:27
 **/
public class Zadanie {
    public static void main(String[] args) {
        /**
         * Wykorzystując typ wyliczeniowy – enum  Status ( uzytkownika)
         * i switch utwórz metodę wypisująca komunikat w zależności od statusu.
         * DOSTEPNY,NIEDOSTEPNY,NIEAKTYWNY
         */
        Status statusUzytkownika = Status.NIE_AKTYWNY;
        switch(statusUzytkownika){
            case AKTYWNY:
                System.out.println("Uzytkownik jest aktywny");
                break;
            case NIE_AKTYWNY:
                System.out.println("Uzytkownik jest nie aktywny");
                break;
            case NIEDOSTEPNY:
                System.out.println("Uzytkownik jest niedostepny");
                break;
            default:
                System.out.println("Uzytkownik jest nierozpoznany");
        }
    }
}
