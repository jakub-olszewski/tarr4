package pl.sdacademy.tarr4.petlafor;

import java.util.ArrayList;
import java.util.List;

/**
 * PetlaForMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 10:23
 **/
public class PetlaForMain {

    public static void main(String[] args) {
        /**
         * Przyklad użycia pętli for
         */

        // przyklad z liczniem - iterowanym i
        // warunek rozpoczecia ; warunek zakończenia ; krok
        for (int i = 0 ; i < 10; i++){
            System.out.println(i);
        }
        // gdy mamy na czerwono
        // lewy alt+enter / wybieramy import class
        List<String> listNapisow = new ArrayList<String>();
        listNapisow.add("Drzewo");
        listNapisow.add("Ulica");
        listNapisow.add("Samochód");
        listNapisow.add("Chodnik");

        // typ elementListy : listaZKtorejSaElementy
        for (String elementListy : listNapisow){
            System.out.println(elementListy);
        }
        // List<OBJEKT> OBJEKT jakikolwiek
        // np.
        // List<Zwierzak> - lista zwierzakow
        List<String> listSmialkow = new ArrayList<String>();
        listSmialkow.add("Karol");
        listSmialkow.add("Kasia");
        listSmialkow.add("Marcin");
        listSmialkow.add("Sławek");
        listSmialkow.add("Krzysztof");

        // Typ elementu : lista
        // : mozna zastapic litera 'z'
        for (String teczka : listSmialkow){
            System.out.println(teczka);
        }
    }

}
