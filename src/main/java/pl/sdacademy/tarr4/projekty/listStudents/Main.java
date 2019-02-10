package pl.sdacademy.tarr4.projekty.listStudents;

import pl.sdacademy.tarr4.projekty.listStudents.data.Data;
import pl.sdacademy.tarr4.projekty.listStudents.elements.Option;
import pl.sdacademy.tarr4.projekty.listStudents.views.AddView;
import pl.sdacademy.tarr4.projekty.listStudents.views.MenuView;

/**
 * Main
 * Steruje całym programem
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 14:11
 **/
public class Main {
    public static void main(String[] args) {

        /**
         * Program
         * Lista obecności/Kursantów/Studentow
         * dodanie kursanta
         * usuniecie kursanta
         * wyswietlenie listy kursantow
         *
         * sprawdzanie obecnosci
         *
         * Widoki:
         * - widok menu
         *      * dodanie
         *      * usuniecie
         *      * wyswietlenie
         *      * powrot
         *      * zakonczenie
         * - widok listy
         */

        boolean endProgram = false;
        Data data = new Data();

        // while wykonuj się dopuki
        // to co jest w nawiasie(warunek) jest spelniony
        while (!endProgram){
            MenuView menuView = new MenuView(data);
            Option choosedOption = menuView.getChoose();
            switch (choosedOption){
                case ADD:
                    //new AddView(data);
                    break;
                case REMOVE:
                    break;
                case CLOSE:
                    endProgram = true;
                    break;
                default:
                    System.out.println("Brak wybranej opcji!");
            }
        }
        System.out.println("Program został zakończony!");
    }
}
