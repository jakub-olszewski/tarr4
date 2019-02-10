package pl.sdacademy.tarr4.projekty.listStudents.views;

import pl.sdacademy.tarr4.projekty.listStudents.data.Data;

import java.util.Scanner;

/**
 * AddView
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 14:59
 **/
public class AddView extends View{

    public AddView(Data data) {
        super(data);
    }

    @Override
    protected void build() {
        System.out.println("Nie zaimplementaowana opcja dodawania");
        Scanner addScanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String name = addScanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String surname = addScanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        String phoneNumber = addScanner.nextLine();

        System.out.println("Dodano: "+name+" "+surname);
        System.out.println("[Aby wrócić do menu wciśnij enter]");
        addScanner.nextLine();
    }

    // konstruktor

    // build

}
