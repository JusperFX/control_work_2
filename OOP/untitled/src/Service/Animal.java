package Service;

import java.util.ArrayList;
import java.util.Date;

public class Animal {
    private String name;
    private String type;
    private Date birthDate;
    private ArrayList<String> commands;
    private ArrayList<Animal> unknownTypesOfAnimals;

    public Animal(ArrayList<String> commands, Date birthDate, String type, String name) {
        this.commands = commands != null ? commands : new ArrayList<>();
        this.birthDate = birthDate;
        this.type = type;
        this.name = name;
    }

    public void addUnknownAnimal(Animal animal) {
        unknownTypesOfAnimals.add(animal);
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        if (commands == null) {
            return  "name=" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", birthDate=" + birthDate +
                    ", commands=" + commands;
        } else {
            return  "name=" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", birthDate=" + birthDate;
        }
    }
}
