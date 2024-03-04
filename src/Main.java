import clients.*;
import clients.impl.*;
import clients.personal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 250, LocalDate.now(), new Owner());
        Dog sharik = new Dog("Sharik", 50, LocalDate.now(), new Owner());
        Butterfly betty = new Butterfly("Betty",0.12f, LocalDate.now(), new Owner());
        Crocodile croc = new Crocodile("Croc", 600, LocalDate.of(2018, 10, 21), new Owner());
        Dug donald = new Dug("Donald", 3, LocalDate.of(2023, 2,15), new Owner());
        Falcon miguel = new Falcon("Miguel", 3.5f, LocalDate.of(2024,1,10), new Owner());
        Ostrich ivan = new Ostrich("Ivan", 80, LocalDate.of(2015,10,27), new Owner());
        Shark kakashi = new Shark("Kakashi", 750, LocalDate.of(1945,8,6 ), new Owner());

        List<Animal> animals = new ArrayList<>();
        animals.add(simba);
        animals.add(sharik);
        animals.add(betty);
        animals.add(croc);
        animals.add(donald);
        animals.add(miguel);
        animals.add(ivan);
        animals.add(kakashi);

        System.out.println("The running speed is: " + simba.run());
        System.out.println("The flight speed is: " + miguel.fly());
        croc.swim();
        kakashi.eat();
        System.out.println();

        Nurse lory = new Nurse("Lory", LocalDate.of(2021,11,23));
        lory.assisting();
        lory.schedule();
        lory.vaccination(simba);
        System.out.println();

        Doctor hope = new Doctor("Hope", LocalDate.of(2015,10,13));
        hope.schedule();
        hope.heal(kakashi);
        hope.examination();
        System.out.println();

        List<Worker> employees = new ArrayList<>();
        employees.add(lory);
        employees.add(hope);

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.goables(animals);
        clinic.flyables(animals);
        System.out.println();
        clinic.addEmploy(lory);
        clinic.addEmploy(hope);
        clinic.printStaff();
        clinic.removeEmploy(lory);
        clinic.printStaff();
        System.out.println();
        clinic.addAnimal(sharik);
        clinic.addAnimal(ivan);
        clinic.printAnimal();
        clinic.removeAnimal(ivan);
        clinic.printAnimal();

    }
}