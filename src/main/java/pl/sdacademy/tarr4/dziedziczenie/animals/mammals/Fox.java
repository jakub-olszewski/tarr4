package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Predator;

/**
 * Fox
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:26
 **/
public class Fox extends Mammal implements Predator {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Fox
    }
}
