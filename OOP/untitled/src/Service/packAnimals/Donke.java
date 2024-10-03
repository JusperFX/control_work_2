package Service.packAnimals;

import Service.Animal;

import java.util.ArrayList;
import java.util.Date;

public class Donke extends Animal{
    private ArrayList<Animal> donkeList;
    private static String type = "Donke";

    public Donke(ArrayList<String> commands, Date birthDate, String name) {
        super(commands, birthDate, type, name);
        this.donkeList = new ArrayList<>();
    }

    public void addDonke(Donke donke) {
        donkeList.add(donke);
    }

    public ArrayList<Animal> getCamelList() {
        return donkeList;
    }
}
