package pl.sdacademy.tarr4.petlawhile;

import java.util.ArrayList;
import java.util.List;

/**
 * Zadanie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 11:46
 **/
public class Zadanie {
    public static void main(String[] args) {

        /**
         * Zadanie: Wypisz parzyste elementy utworzonej wcześniej
         * tablicy zawierającą liczby
         * Wypisz elementy utworzonej listyImion zawierającą imiona na literę ‚a’
         */

        Integer[] tablicaLiczb = { 2,6,4,3,8,3,1,9,7,5,3,2};

        boolean czyKoniecTablicy = false;
        int indeks = 0;
        while (!czyKoniecTablicy) {

            int liczba = tablicaLiczb[indeks];



            //czyKoniecTablicy =true;

            boolean czyLiczbajestParzysta = liczba%2==0;
            if (czyLiczbajestParzysta) {
                System.out.println(liczba);
            }

            indeks++;
            if(indeks==tablicaLiczb.length){
                czyKoniecTablicy =true;
            }
        }

        // alt + enter do importu
        List<String> listaImion = new ArrayList<>();
        listaImion.add("Janusz");
        listaImion.add("Oksana");
        listaImion.add("Ania");
        listaImion.add("Mikołaj");
        listaImion.add("Juliusz");

        CharSequence litera = new String("a");
        int pozycja=listaImion.size()-1;
        while (pozycja>0) {
            String imie = listaImion.get(pozycja);
            if (imie.contains(litera)) {
                System.out.println(imie);

            }
            pozycja--;
        }


    }
}
