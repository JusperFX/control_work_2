package Service.packAnimals;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Camel extends Animal{
    private ArrayList<Animal> camelList;
    private static String type = "Camel";

    public Camel(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.camelList = new ArrayList<>();
    }

    public void addCamel(Camel camel) {
        camelList.add(camel);
    }

    public ArrayList<Animal> getCamelList() {
        return camelList;
    }
}
