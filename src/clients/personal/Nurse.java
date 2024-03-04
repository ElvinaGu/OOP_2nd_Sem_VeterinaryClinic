package clients.personal;

import clients.Animal;
import clients.Worker;

import java.time.LocalDate;

public class Nurse extends Worker {

    public Nurse(String name, LocalDate experience) {
        super(name, experience);
    }

    @Override
    public void schedule() {
        System.out.println(getType() + " works schedule 2 through 2.");
    }

    public void assisting() {
        System.out.println(name + " assisting " + Doctor.class.getSimpleName());
    }

    public void vaccination(Animal name) {
        System.out.println(getType() + " administers vaccination " + name.getClass().getSimpleName());
    }
}
