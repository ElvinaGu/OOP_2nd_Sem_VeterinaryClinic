package clients;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    List<Worker> staff = new ArrayList<>();
    public List<Worker> employees;
    public List<Animal> animals;

    public VeterinaryClinic(List<Worker> employees, List<Animal> animals) {
        this.employees = employees;
        this.animals = animals;
    }

    // Добавить сотрудника в штат.
    public void addEmploy(Worker worker){
            if (!staff.contains(worker)) {
                staff.add(worker);
                System.out.println("Сотрудник добавлен в штат.");
            }else System.out.println("Сотрудник уже в штате.");
    }

    // Удалить сотрудника.
    public void removeEmploy(Worker worker){
        if (staff.contains(worker)) {
            staff.remove(worker);
            System.out.println("Сотрудник удален успешно.");
        } else System.out.println("Сотрудник не найден.");
    }

    // Вывод списка штата сотрудников.
    public void printStaff(){
        System.out.println("Штат сотрудников: " + staff);
    }

    // Список всех бегающих животных.
    public void goables(List<Animal> animals){
        List<Animal> goables = new ArrayList<>();
        for (Animal anim : animals){
            if (anim instanceof Goable){
                goables.add(anim);
            }
        }
        System.out.println("Бегающие животные: " + goables);
    }

    // Список всех плавающих животных.
    public void swimables(List<Animal> animals){
        List<Animal> swimables = new ArrayList<>();
        for (Animal anim : animals){
            if (anim instanceof Swimable){
                swimables.add(anim);
            }
        }
        System.out.println("Плавающие животные: " + swimables);
    }

    // Список всех летающих животных.
    public void flyables(List<Animal> animals){
        List<Animal> flyables = new ArrayList<>();
        for (Animal anim : animals){
            if (anim instanceof Flyable){
                flyables.add(anim);
            }
        }
        System.out.println("Летающие животные: " + flyables);
    }
}
