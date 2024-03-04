package clients;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate dob;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate dob, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.dob = dob;
        this.owner = owner;
    }

    public abstract void eat();

    public String getType(){
        return getClass().getSimpleName();
    }


    public String toString(){
        return String.format("name = %s, weight = %s, dob = %s, owner = %s", name, weight, dob, owner);
    }
}
