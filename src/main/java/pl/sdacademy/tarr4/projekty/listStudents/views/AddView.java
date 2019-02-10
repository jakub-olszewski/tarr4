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
        Scanner skaner = new Scanner(System.in);
        skaner.nextLine();
    }

    // konstruktor

    // build

}
