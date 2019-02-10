package pl.sdacademy.tarr4.dziedziczenie.figury;

/**
 * Kolo
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 15:44
 **/
public class Kolo {
    private final float promien;

    public Kolo(float promien) {
        this.promien = promien;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien +" obwod="+obliczObwod()+
                '}';
    }

    public float obliczObwod() {
        return (float)(2*Math.PI*promien);
    }
}
