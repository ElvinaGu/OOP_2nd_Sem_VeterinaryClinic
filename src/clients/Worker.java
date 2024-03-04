package clients;

import java.time.LocalDate;

public abstract class Worker {
    protected String name;
    protected LocalDate experience;

    public Worker(String name, LocalDate experience) {
        this.name = name;
        this.experience = experience;
    }

    public abstract void schedule();

    public String getType(){
        return getClass().getSimpleName();
    }

    public String toString(){
        return String.format("name = %s, experience = %s", name, experience);
    }
}
