package pl.sdacademy.tarr4;

import pl.sdacademy.tarr4.konstruktor.Kawa;

//generate test
//alt + enter
public class App {

    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Witaj Świecie !");

        int number = 2019;

        int number2;
        number2=2020;

        System.out.println(number);
        System.out.println(number2);

        int pojemnik;
        pojemnik = sumaLiczb(1,2,3);// wywołanie metody sumaLiczb
        System.out.println(pojemnik);
        System.out.println(suma2Liczb(1,2));

        Kawa mojaKawa = new Kawa();// użycie konstruktora domyślnego

        String napis;//deklaracja zmiennej napis
        // przypisanie wartości do zmiennej napis
        napis = mojaKawa.pobierzNazwe();

        System.out.println(napis);

        //Zadanie: Stworz zmienną twojaKawa z użyciem
        //konsturktora argumentowego z argumentem
        //"Kawa z mlekiem" i wypisz na konsolę
        //tak jak w przykladzie powyżej


        Kawa twojaKawa;


        twojaKawa = new Kawa("Kawa z mlekiem");
        String napis2 = twojaKawa.pobierzNazwe();
        System.out.println(napis2);

    }

    static int sumaLiczb(int a, int b, int c){
        return a+b+c;
    }

    static int suma2Liczb(int a, int b){
        return a+b;
    }


}
