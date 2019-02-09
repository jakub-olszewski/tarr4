package pl.sdacademy.tarr4.varargs;

/**
 * VarargsMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 12:55
 **/
public class VarargsMain {
    public static void main(String[] args) {
        System.out.println("Wykonanie1\n------------------------------------");
        wypiszElementy("Liczba ",1,2,3,4,5);
        System.out.println("Wykonanie2\n------------------------------------");
        wypiszElementy2("Liczba ",2019,2020);
        System.out.println("Wykonanie3\n------------------------------------");
        wypiszElementy("Liczba ");

    }

    private static void wypiszElementy2(String napis, int liczba1 ,int liczba2) {
        System.out.println(napis+" "+liczba1);
        System.out.println(napis+" "+liczba2);
    }

    private static void wypiszElementy(String napis, int... liczby) {
        if(liczby.length==0){
            System.out.println("Brak liczb");
            return;
        }
        int[] tablicaLiczb = liczby;
        for (int liczba : tablicaLiczb){
            System.out.println(napis+" "+liczba);
        }
    }
}
