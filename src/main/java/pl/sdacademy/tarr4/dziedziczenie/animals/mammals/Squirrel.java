package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr4.dziedziczenie.animals.plants.Plant;

/**
 * Squirrel
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
 **/
public class Squirrel extends Mammal implements Vegenarian, Prey {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void runAwayFrom(Animal animal) {

    }

    @Override
    public void eat(Plant plant) {

    }
}
