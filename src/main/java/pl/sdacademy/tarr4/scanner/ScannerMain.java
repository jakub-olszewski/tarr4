package pl.sdacademy.tarr4.scanner;

import java.util.Scanner;

/**
 * ScannerMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 09.02.2019 13:47
 **/
public class ScannerMain {
    public static void main(String[] args) {

        // skaner wczytujący ciągi znaków
        // z systemowego wejścia (in)
        // klawiatura jak i również np skaner kodów kreskowych
        Scanner skaner = new Scanner(System.in);

        System.out.println("Cześć, Jak masz na imię?");
        String pobranyNapis = skaner.nextLine();
        System.out.println(pobranyNapis+" dawno Cię nie słyszałem!");
        System.out.println("Ile masz lat ?");
        int pobranaLiczba = skaner.nextInt();
        if(pobranaLiczba>18){
            System.out.println("No proszę jesteś pełnoletni.");
        }

    }
}
