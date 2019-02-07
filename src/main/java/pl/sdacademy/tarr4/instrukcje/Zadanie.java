package pl.sdacademy.tarr4.instrukcje;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 18:39
 **/
public class Zadanie {
    public static void main(String[] args) {
        /**
         * Utwórz metodę sprawdzającą pełnoletniość
         */

        boolean jestPelnolenia = czyPelnoletnia(20);
        System.out.println("Powinno być true :"+jestPelnolenia);

        /**
         * Utwórz metodę sprawdzającą pełnoletniość i czy jest z Bydgoszczy
         */
        boolean jestPelnoletniaZBydgoszczy = czyPelnoletniaZBydgoszczy(20,"Toruń");
        System.out.println("Powinno być false :"+jestPelnoletniaZBydgoszczy);
    }

    private static boolean czyPelnoletniaZBydgoszczy(int wiek, String miasto) {
        if(wiek >= 18 && miasto =="Bydgoszcz") {
            return true;
        }else {
            return false;
        }
    }

    private static boolean czyPelnoletniaZBydgoszczy2(int wiek, String miasto) {
        return wiek >= 18 && miasto == "Bydgoszcz";
    }

    private static boolean czyPelnoletniaZBydgoszczy3(int wiek, String miasto) {
        return wiek >= 18 && miasto.equalsIgnoreCase("bydgoszcz");
    }

    private static boolean czyPelnoletniaZBydgoszczy4(int wiek, String miasto) {
        return czyPelnoletnia(wiek) && jestZBydgoszczy(miasto);
    }

    private static boolean jestZBydgoszczy(String miasto) {
        return miasto.equalsIgnoreCase("bydgoszcz");
    }

    private static boolean czyPelnoletnia(int wiek) {
        if(wiek >= 18){
            return true;
        }else {
            return false;
        }
    }
}
