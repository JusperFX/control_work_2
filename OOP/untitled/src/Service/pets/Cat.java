package Service.pets;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Cat extends Animal {
    private ArrayList<Animal> catlList;
    private static String type = "Cat";

    public Cat(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.catlList = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        catlList.add(cat);
    }

    public ArrayList<Animal> getCatList() {
        return catlList;
    }


}
