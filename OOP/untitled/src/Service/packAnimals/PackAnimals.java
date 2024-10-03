package Service.packAnimals;

import Service.Animal;
import Service.AnimalsInter;

import java.util.ArrayList;
import java.util.Iterator;

public class PackAnimals implements AnimalsInter, Iterable<Animal> {
    private ArrayList<Animal> packAnimals;

    public PackAnimals() {
        this.packAnimals = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        packAnimals.add(animal);
    }

    @Override
    public void commandsList(String name) {
        for (Animal animal : packAnimals) {
            if (animal.getName().equals(name)) {
                System.out.println("Команды для " + name + ": " + animal.getCommands());
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }

    @Override
    public void addNewCommand(String name, String newCommand) {
        for (Animal animal : packAnimals) {
            if (animal.getName().equals(name)) {
                animal.addCommand(newCommand);
                System.out.println("Команда '" + newCommand + "' добавлена для " + name);
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }

    public void showPackAnimals() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal packAnimal : packAnimals) {
            sb.append(packAnimal).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Animal> iterator() {
        return packAnimals.iterator();
    }
}
