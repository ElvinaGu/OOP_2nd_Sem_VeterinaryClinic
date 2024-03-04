package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Swimable, Goable {
    public Dog(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats what the owner gives :D");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " can swim.");
    }

    @Override
    public double run() {
        return 13;
    }
}
