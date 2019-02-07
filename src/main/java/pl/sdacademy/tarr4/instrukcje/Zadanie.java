package pl.sdacademy.tarr4.instrukcje;// informacja o pakiecie a w którym się znajdujemy

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 18:39
 **/
public class Zadanie {// widoczność klasy i nazwa
    public static void main(String[] args) { // metoda main którą wykonuje program

        /**
         * Utwórz metodę sprawdzającą pełnoletniość // komentarz
         */

        boolean jestPelnolenia = czyPelnoletnia(20);// instrukcja
        // deklaruje zmienna o nazwie jestPelnolenia następnie przypisuje wartość zwróconą przez metodę
        // czyPelnoletnia z argumentem 20 czyli wiekiem
        System.out.println("Powinno być true :"+jestPelnolenia);
        // instrukcja wypisująca na konsoli napis "Powinno być true :" i dopisująca wartość zmiennej jestPelnolenia

        /**
         * Utwórz metodę sprawdzającą pełnoletniość i czy jest z Bydgoszczy
         */
        boolean jestPelnoletniaZBydgoszczy = czyPelnoletniaZBydgoszczy(20,"Toruń");
        System.out.println("Powinno być false :"+jestPelnoletniaZBydgoszczy);
    }

    /**
     * Rozwiązanie zadania
     * @param wiek
     * @param miasto
     * @return
     */
    private static boolean czyPelnoletniaZBydgoszczy(int wiek, String miasto) {
        if(wiek >= 18 && miasto =="Bydgoszcz") {// instrukcja warunkowa sprawdzajaca czy wiek jest większy lub równy
            // 18 &&="i" miasto jest równe słowu Bydgoszcz
            return true;// jeśli to prawda co powyżej to
            // return zwraca true czyli prawdę
        }else {
            return false;
            // return zwraca false czyli fałsz
        }
    }

    /**
     * Przykład z bez użycia instrukcji warunkowej if
     * @param wiek
     * @param miasto
     * @return
     */
    private static boolean czyPelnoletniaZBydgoszczy2(int wiek, String miasto) {
        return wiek >= 18 && miasto == "Bydgoszcz";
    }

    /**
     * Przykład z użyciem metody equalsIgnoreCase() dostępnej w obiekcie String
     * @param wiek
     * @param miasto
     * @return
     */
    private static boolean czyPelnoletniaZBydgoszczy3(int wiek, String miasto) {
        return wiek >= 18 && miasto.equalsIgnoreCase("bydgoszcz");
    }

    /**
     * Przykład zastąpienia wykorzystania operatora >= metodą o nazwie czyPelnoletnia()
     * oraz zastąpienia metody equalsIgnoreCase() czytelnieszą metodą
     * o nazwie jestZBydgoszczy()
     * @param wiek
     * @param miasto
     * @return
     */
    private static boolean czyPelnoletniaZBydgoszczy4(int wiek, String miasto) {
        return czyPelnoletnia(wiek) && jestZBydgoszczy(miasto);
    }

    /**
     * Metoda pomocnicza do metod powyżej
     * @param miasto
     * @return
     */
    private static boolean jestZBydgoszczy(String miasto) {
        return miasto.equalsIgnoreCase("bydgoszcz");
    }

    /**
     * Rozwiazanie zadania
     * @param wiek
     * @return
     */
    private static boolean czyPelnoletnia(int wiek) {
        if(wiek >= 18){
            return true;
        }else {
            return false;
        }
    }
}
