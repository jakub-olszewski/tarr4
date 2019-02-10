package pl.sdacademy.tarr4.dziedziczenie.figury;

/**
 * Trojkat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 15:45
 **/
public class Trojkat {

    private final float bokA;
    private final float bokB;
    private final float bokC;

    public Trojkat(float bokA, float bokB, float bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", bokC=" + bokC + " obwod="+obliczObwod()+
                '}';
    }

    public float obliczObwod() {
        return bokA+bokB+bokC;
    }
}
