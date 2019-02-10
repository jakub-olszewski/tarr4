package pl.sdacademy.tarr4.dziedziczenie.figury;

/**
 * Prostokat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 15:44
 **/
public class Prostokat extends Figura{
    private final float bokA;
    private final float bokB;

    public Prostokat(float bokA, float bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +", obwod="+obliczObwod()+
                '}';
    }

    public float obliczObwod() {
        return 2*bokA+2*bokB;
    }
}
