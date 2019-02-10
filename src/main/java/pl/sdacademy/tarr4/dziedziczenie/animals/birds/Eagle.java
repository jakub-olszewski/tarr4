package pl.sdacademy.tarr4.dziedziczenie.animals.birds;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Predator;

/**
 * Eagle
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:28
 **/
public class Eagle extends Bird implements Predator {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        System.out.printf("'%s' została zjedzona przez '%s'",animal.getName(),this.getName());
        // kod opisujacy wykonanie metody przez Eagle
    }
}
