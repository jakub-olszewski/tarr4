package pl.sdacademy.tarr4;

/**
 * Kawa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 05.02.2019 20:12
 **/
public class Kawa {

    //pole nazwa
    String nazwa;

    /**
     * Konstruktor bez argumentowy
     */
    public Kawa(){
        nazwa = "Kawa";
    }

    /**
     * Konstruktor argumentowy
     */
    public Kawa(String nazwaWprowadzona){
        nazwa = nazwaWprowadzona;
    }

    public String pobierzNazwe(){
        return nazwa;
    }
}
