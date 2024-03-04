package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Shark extends Animal implements Swimable {
    public Shark(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eats fish, small marine mammals, plankton and crustaceans.");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " swims at high speed.");
    }
}
