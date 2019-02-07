package pl.sdacademy.tarr4.konwersjetypow;

/**
 * KonwersjeMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.02.2019 18:22
 **/
public class KonwersjeMain {
    public static void main(String[] args) {
        {
            int a = 5;
            double b = 13.5;
            double c = b / a;// nie jawna konwersja
            System.out.println(c);
        }
        {
            int a = 5;
            double b = 13.5;
            int c = (int)b/a;//  jawna konwersja
            //int c = (int)((int)b/a);//  jawna konwersja
            System.out.println(c);
        }
        {
            int a = 5;
            double b = 13.5;
            double c = b/(double)a;//  jawna konwersja
            System.out.println(c);
        }

    }
}
