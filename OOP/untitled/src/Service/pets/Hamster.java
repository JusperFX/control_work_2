package Service.pets;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Hamster extends Animal {
    private ArrayList<Animal> hamsterList;
    private static String type = "Hamster";

    public Hamster(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.hamsterList = new ArrayList<>();
    }

    public void addHamster(Hamster hamster) {
        hamsterList.add(hamster);
    }

    public ArrayList<Animal> getCamelList() {
        return hamsterList;
    }
}
