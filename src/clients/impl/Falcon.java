package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;

public class Falcon extends Animal implements Flyable, Goable {
    public Falcon(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats small land animals.");
    }

    @Override
    public double fly() {
        return 322;
    }

    @Override
    public double run() {
        return 5;
    }
}
