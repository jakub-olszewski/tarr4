package pl.sdacademy.tarr4.interfejs;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 17:27
 **/
public class Main {

    //psvm + tab
    public static void main(String[] args) {
        McDonald mcDonaldZDworca = new DworzecMcDonaldImpl();
        double kwota = 20.01;
        mcDonaldZDworca.poproszeFrytki(kwota);
        mcDonaldZDworca.poproszeMcFlury(kwota);
    }
}
