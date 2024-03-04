package clients;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    List<Worker> staff = new ArrayList<>();
    List<Animal> animals = new ArrayList<>();

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

    // Добавить питомца.
    public void addAnimal(Animal animal){
        if (!animals.contains(animal)) {
            animals.add(animal);
            System.out.println("Питомец на лечение добавлен.");
        }else System.out.println("Питомец уже есть в списке на лечение.");
    }

    // Удалить питомца.
    public void removeAnimal(Animal animal){
        if (animals.contains(animal)) {
            animals.remove(animal);
            System.out.println("Питомец выписан.");
        } else System.out.println("Питомец не найден.");
    }

    // Вывод списка животных.
    public void printAnimal(){
        System.out.println("Список животных, назначенных на лечение: " + animals);
    }
}
