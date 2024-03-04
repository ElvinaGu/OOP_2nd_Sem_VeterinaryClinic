package clients.impl;

import clients.*;

import java.time.LocalDate;

public class Dug extends Animal implements Flyable, Swimable, Goable {
    public Dug(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats small fish, insect larvae, shellfish.");
    }

    @Override
    public double fly() {
        return 90;
    }

    @Override
    public void swim() {
        System.out.println(getType() + " stays on the surface of the water because it's plumage is greasy.");
    }

    @Override
    public double run() {
        return 10;
    }
}
