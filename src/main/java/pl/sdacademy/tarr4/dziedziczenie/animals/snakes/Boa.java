package pl.sdacademy.tarr4.dziedziczenie.animals.snakes;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;

/**
 * Boa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:53
 **/
public class Boa extends Snake {

    public Boa(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Deer
    }

    // metoda duszenia strangle(Animal animal)
    // nie może udusić słonia!
}
