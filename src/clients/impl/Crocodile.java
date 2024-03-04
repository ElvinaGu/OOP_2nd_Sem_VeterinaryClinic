package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Crocodile extends Animal implements Swimable, Goable {
    public Crocodile(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats fish, birds, mammals and other reptiles.");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " swims in fresh and salt water.");
    }

    @Override
    public double run() {
        return 11;
    }
}
