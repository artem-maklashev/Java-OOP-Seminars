package HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class Zoo {
    public List<Animal> animals = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in, "Cp866");

    public Zoo() {
    }

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void delete() {
        int index = Integer.parseInt(input("Введите порядковый номер животного для удаления ")) - 1;
        if (index < animals.size() && index > -1 && !animals.isEmpty())
            animals.remove(index);
        System.out.printf("Животное под номером %d удалено\n", index + 1);
    }

    public void printInfo() {
        int index = Integer.parseInt(input("Введите порядковый номер животного для просмотра ")) - 1;
        if (index < animals.size() && index > -1)
            System.out.println(animals.get(index).printInfo());
    }

    public void voice() {
        int index = Integer.parseInt(input("Введите порядковый номер животного для просмотра ")) - 1;
        if (index < animals.size() && index > -1)
            animals.get(index).voice();
    }

    public void printZoo() {
        System.out.println("Информация по всем животным");
        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println((i + 1) + ") " + animals.get(i).printInfo());
            System.out.println();
        }
    }

    public void chorus() {
        System.out.println("Хор зоопарка");
        for (Animal animal : this.animals) {
            System.out.print(animal.getClass().getSimpleName() + " ");
            animal.voice();
        }

    }

    public void affection() {        
        for (Animal animal : this.animals) {
            if (animal instanceof Pet) {
                System.out.print(animal.getClass().getSimpleName() + " ");
                ((Pet) animal).affection();
            }
        }

    }

    public void train() {
        for (Animal animal : this.animals) {
            if (animal instanceof Train) {
                System.out.print(animal.getClass().getSimpleName() + " ");
                ((Train) animal).train();
            }
        }

    }

    public void fly() {
        for (Animal animal : this.animals) {
            if (animal instanceof Fly) {
                System.out.print(animal.getClass().getSimpleName() + " ");
                ((Fly) animal).fly();
            }
        }
    }

    public void add() {
        Menu animalMenu = new Menu();
        Map<String, Animal> allTypes = Map.ofEntries(entry("Cat", new Cat()),
                entry("Tiger", new Tiger()),
                entry("Dog", new Dog()),
                entry("Wolf", new Wolf()),
                entry("Chicken", new Chicken()),
                entry("Stork", new Stork()));

        animalMenu.createMenu(new ArrayList<>(Arrays.asList("Cat", "Tiger", "Dog", "Wolf", "Chicken", "Stork")));
        animalMenu.show();
        int selection = Program.iScanner.nextInt();
        String cName = animalMenu.getValue(selection);
        var animalNew = allTypes.get(cName);

        System.out.printf("Добавляем %s", cName);
        System.out.println();

        animalNew.height = Integer.parseInt(input("высоту"));
        animalNew.weight = Integer.parseInt(input("вес"));
        animalNew.eyeColor = input("цвет глаз");
        if (animalNew instanceof Pet) {
            ((Pet) animalNew).name = input("кличку");
            ((Pet) animalNew).breed = input("породу");
            ((Pet) animalNew).vaccinations = Boolean.parseBoolean(input("наличие вакцин  - true/false"));
            ((Pet) animalNew).color = input("цвет шерсти");
            ((Pet) animalNew).birthday = input("дату рождения");

        }
        if (animalNew instanceof WildAnimal) {
            ((WildAnimal) animalNew).habitat = input("место нахождения");
            ((WildAnimal) animalNew).dateOfLocation = input("дата обнаружения");
        }
        if (animalNew instanceof Bird && animalNew instanceof Fly) {

            ((Bird) animalNew).flyHight = Integer.parseInt(input("высоту полета"));
        }
        if (animalNew instanceof Cat) {
            ((Cat) animalNew).setHaveFur(Boolean.parseBoolean(input("наличие шерсти  - true/false")));
        }
        if (animalNew instanceof Dog) {
            ((Dog) animalNew).setTrained(Boolean.parseBoolean(input("статус дрессировки  - true/false")));
        }
        if (animalNew instanceof Wolf) {
            ((Wolf) animalNew).setLeader(Boolean.parseBoolean(input("вожак/нет  - true/false")));
        }
        this.animals.add(animalNew);

        // Object[] fields = animalNew.getClass().getDeclaredFields();
        // System.out.println(Arrays.toString(fields));
        // if (animalNew instanceof Cat) {
        // ((Cat) animalNew).birthday = Program.iScanner.next();
        // }
        // try {
        // Class<?> clazz = Class.forName(cName);
        // Object animal = clazz.getDeclaredConstructor().newInstance();
        // System.out.println(animal.getClass().getName());

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

    }

    private String input(String message) {
        System.out.printf("Введите %s: ", message);
        String str;
        do {
            str = scanner.nextLine();

        } while (str.equals(""));

        return str;

    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }
}
