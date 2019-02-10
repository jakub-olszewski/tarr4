package pl.sdacademy.tarr4.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr4.dziedziczenie.animals.plants.Plant;

/**
 * Deer
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
 **/
public class Deer extends Mammal implements Vegenarian, Prey {

    public Deer(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getName(),plant.getName());
        // kod opisujacy wykonanie metody przez Deer
    }

}
