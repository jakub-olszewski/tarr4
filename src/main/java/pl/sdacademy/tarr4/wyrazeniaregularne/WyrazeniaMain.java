package pl.sdacademy.tarr4.wyrazeniaregularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * WyrazeniaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 15:39
 **/
public class WyrazeniaMain {

    public static void main(String[] args) {
        /**
         * regex - regular expressions (wyrażenia regularne)
        */
        {
            Pattern compiledPattern = Pattern.compile("Marcin");
            Matcher matcher = compiledPattern.matcher("A tata Marcina powiedział");

            System.out.println("Czy zawiera?");
            System.out.println(matcher.find());// wyszukanie częściowe
            System.out.println("Czy pasuje w całości?");
            System.out.println(matcher.matches());// wyszukanie całości
        }
         /**
         * Na przykład wyrażenie regularne
         *   \d{3}-\d{3}-\d{3} 
         * opisuje zbiór numerów telefonów w Polsce.
         */
        {
            Pattern compiledPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
            String numerWprowadzony = "123-123-123 ";
            Matcher matcher = compiledPattern.matcher(numerWprowadzony);

            System.out.println("Czy numer jest poprawny częściowo?");
            System.out.println(matcher.find());// wyszukanie częściowe
            System.out.println("Czy numer jest poprawny całości?");
            System.out.println(matcher.matches());// wyszukanie całości
        }

    }
}
