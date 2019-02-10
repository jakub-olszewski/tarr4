package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Predator;

/**
 * Whale
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:27
 **/
public class Whale extends Mammal implements Predator {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Whale
    }
}
