package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr4.dziedziczenie.animals.plants.Plant;

/**
 * Deer
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
 **/
public class Deer extends Mammal implements Vegenarian {

    public Deer(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        // kod opisujacy wykonanie metody przez Deer
    }
}
