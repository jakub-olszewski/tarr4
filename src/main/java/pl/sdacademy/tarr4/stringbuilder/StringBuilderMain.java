package pl.sdacademy.tarr4.stringbuilder;

/**
 * StringBuilderMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.02.2019 20:38
 **/
public class StringBuilderMain {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder().append("sda").append(":").append(1).append('r');
        System.out.println(sb);//sda:1r

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tarr");//  append - dodaje tekst do tekstu wczesniejszego
        stringBuilder.append(4);
        stringBuilder.append(" sroda");

        System.out.println(stringBuilder.toString());

    }
}
