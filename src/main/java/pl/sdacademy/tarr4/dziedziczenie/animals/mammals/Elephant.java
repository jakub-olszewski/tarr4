package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr4.dziedziczenie.animals.plants.Plant;

/**
 * Elephant
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:26
 **/
public class Elephant extends Mammal implements Vegenarian, Prey {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        // kod opisujacy wykonanie metody przez Deer
    }




}
