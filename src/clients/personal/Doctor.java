package clients.personal;

import clients.Animal;
import clients.Worker;

import java.io.IOException;
import java.time.LocalDate;

public class Doctor extends Worker {
    public Doctor(String name, LocalDate experience) {
        super(name, experience);
    }

    @Override
    public void schedule() {
        System.out.println(getType() + " works schedule 4 through 2.");
    }

    public void heal(Animal name) {
        System.out.println(getType() + " treats " + name.getClass().getSimpleName());
    }

    public void examination(){
        System.out.println(name + " is examining the " + Animal.class.getSimpleName());
    }

}
