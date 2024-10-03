package Service.pets;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Dog extends Animal {
    private ArrayList<Animal> doglList;
    private static String type = "Dog";

    public Dog(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.doglList = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        doglList.add(dog);
    }

    public ArrayList<Animal> getCamelList() {
        return doglList;
    }
}
