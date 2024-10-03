package Service.packAnimals;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Horse extends Animal{
    private ArrayList<Animal> horseList;
    private static String type = "Horse";

    public Horse(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.horseList = new ArrayList<>();
    }

    public void addhorse(Horse horse) {
        horseList.add(horse);
    }

    public ArrayList<Animal> gethorseList() {
        return horseList;
    }
}
