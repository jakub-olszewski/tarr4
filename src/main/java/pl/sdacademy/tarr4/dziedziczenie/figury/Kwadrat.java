package pl.sdacademy.tarr4.dziedziczenie.figury;

/**
 * Kwadrat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 15:43
 **/
public class Kwadrat extends Figura{

    float bok;

    public Kwadrat(float bok) {
        this.bok = bok;
    }

    // automatycznie alt+insert i wybieramy toString()
    public String toString(){
        return "Kwadrat "+" bok="+bok+" obwód="+obliczObwod();
    }

    public float obliczObwod() {
        return 4*bok;
    }

}
