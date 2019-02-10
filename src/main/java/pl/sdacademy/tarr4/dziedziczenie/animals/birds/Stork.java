package pl.sdacademy.tarr4.dziedziczenie.animals.birds;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Predator;

/**
 * Stork
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:29
 **/
public class Stork extends Bird implements Predator {

    public Stork(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Stork
    }
}
