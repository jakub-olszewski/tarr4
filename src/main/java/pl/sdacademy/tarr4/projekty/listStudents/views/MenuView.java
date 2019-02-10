package pl.sdacademy.tarr4.projekty.listStudents.views;

import pl.sdacademy.tarr4.projekty.listStudents.data.Data;
import pl.sdacademy.tarr4.projekty.listStudents.elements.Option;

import java.util.Scanner;

/**
 * MenuView
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 14:20
 **/
public class MenuView extends View{

    public MenuView(Data data) {
        super(data);
    }

    protected void build() {
        System.out.println("========================");
        System.out.println("Menu");
        System.out.println("========================");
        System.out.println("1. Dodawanie");
        System.out.println("2. Usuwanie");
        System.out.println("0. Koniec");
        System.out.println("------------------------");
        System.out.println("Twój wybór: ");
        Scanner skaner = new Scanner(System.in);
        int choosedNumber = skaner.nextInt();
        if(choosedNumber==0){
            getData().setChoosedOption(Option.CLOSE);
        }else if(choosedNumber==1){
            getData().setChoosedOption(Option.ADD);
        }
    }

    /**
     * Pobiera wybrana opcje z menu
     * @return opcje
     */
    public Option getChoose() {
        return getData().getChoosedOption();
    }
}
