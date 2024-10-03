package Service.pets;

import Service.Animal;
import Service.AnimalsInter;

import java.util.ArrayList;
import java.util.Iterator;

public class Pets implements AnimalsInter, Iterable<Animal> {
    private ArrayList<Animal> pets;

    public Pets() {
        this.pets = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        pets.add(animal);
    }

    @Override
    public void commandsList(String name) {
        for (Animal animal : pets) {
            if (animal.getName().equals(name)) {
                System.out.println("Команды для " + name + ": " + animal.getCommands());
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }

    @Override
    public void addNewCommand(String name, String newCommand) {
        for (Animal animal : pets) {
            if (animal.getName().equals(name)) {
                animal.addCommand(newCommand);
                System.out.println("Команда '" + newCommand + "' добавлена для " + name);
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }

    public void showPets() {
        System.out.println(this);
    }

    public int size() {
        return pets.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal pets : pets) {
            sb.append(pets).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Animal> iterator() {
        return pets.iterator();
    }
}
