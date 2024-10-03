import Service.Animal;
import Service.packAnimals.Camel;
import Service.packAnimals.Donke;
import Service.packAnimals.Horse;
import Service.packAnimals.PackAnimals;
import Service.pets.Cat;
import Service.pets.Dog;
import Service.pets.Hamster;
import Service.pets.Pets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private static String hello = "Здравствуйте, чем могу быть полезен?";
    private static String bye = "До скорых встреч!";
    private PackAnimals packAnimals;
    private Pets pets;
    private Scanner scanner;

    public Menu() {
        this.packAnimals = new PackAnimals();
        this.pets = new Pets();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println(hello);
        System.out.println("1. Добавить домашнее животное");
        System.out.println("2. Добавить вьючное животное");
        System.out.println("3. Список команд животного");
        System.out.println("4. Список домашних животных");
        System.out.println("5. Список вьючных животных");
        System.out.println("6. Добавить новую команду животному");
        System.out.println("7. Завершить работу");
    }

    public void choose() {
        boolean running = true;

        while (running) {
            menu(); // Показываем меню
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPet();
                    break;
                case 2:
                    addingPackAnimals();
                    break;
                case 3:
                    showListCommands();
                    break;
                case 4:
                    subMenuPets();
                    System.out.print("Ваш выбор: ");
                    String subChoice1 = scanner.nextLine();
                    if (subChoice1.equals("1")) {
                        showPetsList();
                    } else if (subChoice1.equals("2")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal pet : pets) {
                                if (pet.getType().equals("Cat")){
                                    sb.append(pet);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Кошек нет!");
                        }
                    } else if (subChoice1.equals("3")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal pet : pets) {
                                if (pet.getType().equals("Dog")){
                                    sb.append(pet);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Собак нет!");
                        }
                    } else if (subChoice1.equals("4")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal pet : pets) {
                                if (pet.getType().equals("Hamster")){
                                    sb.append(pet);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Хомяков нет!");
                        }
                    } else if (subChoice1.equals("5")) {
                        break;
                    }
                    break;
                case 5:
                    subMenuPackAnimals();
                    System.out.print("Ваш выбор: ");
                    String subChoice2 = scanner.nextLine();
                    if (subChoice2.equals("1")) {
                        packAnimals.showPackAnimals();
                    } else if (subChoice2.equals("2")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal packAnimal : packAnimals) {
                                if (packAnimal.getType().equals("Horse")){
                                    sb.append(packAnimal);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Лошадей нет!");
                        }
                    } else if (subChoice2.equals("3")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal packAnimal : packAnimals) {
                                if (packAnimal.getType().equals("Camel")){
                                    sb.append(packAnimal);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Верблюдов нет!");
                        }
                    } else if (subChoice2.equals("4")) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            for (Animal packAnimal : packAnimals) {
                                if (packAnimal.getType().equals("Donke")){
                                    sb.append(packAnimal);
                                }
                            }
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Ослов нет!");
                        }
                    } else if (subChoice2.equals("5")) {
                        break;
                    }
                case 6:
                    addingNewCommand();
                    break;
                case 7:
                    System.out.println(bye);
                    running = false; // Завершаем цикл
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private Date readDate() {
        System.out.print("Введите дату (в формате ГГГГ-ММ-ДД): ");
        String dateString = scanner.nextLine(); // Читаем строку от пользователя
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // Указываем формат даты
        Date date = null;

        try {
            date = format.parse(dateString); // Преобразуем строку в Date
        } catch (ParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат ГГГГ-ММ-ДД.");
        }

        return date;
    }

    public void addPet() {
        System.out.println("Какой тип домашнего животного Вы хотите добавить: кот - 1, собака - 2 или хомяк - 3: ");
        String type = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения");
        Date date = readDate();
        if (type.equals("кот") || type.equals("1")) {
            Cat cat = new Cat(null, date, name);
            cat.addCat(cat);
            pets.addAnimal(cat);
            System.out.println("Кот " + name + " был добавлен");
        } else if (type.equals("собака") || type.equals("2")) {
            Dog dog = new Dog(null, date, name);
            dog.addDog(dog);
            pets.addAnimal(dog);
            System.out.println("Собака " + name + " была добавлена");
        } else if (type.equals("хомяк")|| type.equals("3")) {
            Hamster hamster = new Hamster(null, date, name);
            hamster.addHamster(hamster);
            pets.addAnimal(hamster);
            System.out.println("Хомяк " + name + " был добавлен");
        } else {
            System.out.println("Неизвестный тип вьючного животного");
            Animal animal = new Animal(null, date, type, name);
            animal.addUnknownAnimal(animal);
            pets.addAnimal(animal);
            System.out.println("Животное " + name + " было добавлено");
        }
    }

    public void addingPackAnimals() {
        System.out.println("Какой тип вьючного животного Вы хотите добавить: лошадь - 1, верблюд - 2 или осел - 3: ");
        String type = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения");
        Date date = readDate();
        if (type.equals("лошадь") || type.equals("1")) {
            Horse horse = new Horse(null, date, name);
            horse.addhorse(horse);
            packAnimals.addAnimal(horse);
            System.out.println("Лошадь " + name + " была добавлена");
        } else if (type.equals("верблюд") || type.equals("2")) {
            Camel camel = new Camel(null, date, name);
            camel.addCamel(camel);
            packAnimals.addAnimal(camel);
            System.out.println("Верблюд " + name + " был добавлен");
        } else if (type.equals("осел") || type.equals("3")) {
            Donke donke = new Donke(null, date, name);
            donke.addDonke(donke);
            packAnimals.addAnimal(donke);
            System.out.println("Осел " + name + " был добавлен");
        } else {
            System.out.println("Неизвестный тип вьючного животного");
            Animal animal = new Animal(null, date, type, name);
            animal.addUnknownAnimal(animal);
            packAnimals.addAnimal(animal);
            System.out.println("Животное " + name + " было добавлено");
        }
    }

    public void showListCommands() {
        try {
            System.out.println("Выберите 1, если домашнее или 2, если вьючное животное: ");
            String choose = scanner.nextLine();
            if (choose.equals("1")) {
                try {
                    String name = scanner.nextLine();
                    // TODO
                } catch (Exception e) {
                    System.out.println("Нет такого домашнего животного или допущена ошибка");
                }

            } else if (choose.equals("2")) {
                try {
                    System.out.println("Полный список вьючных животных: ");
                    packAnimals.showPackAnimals();
                    System.out.println("Введите имя животного из списка: ");
                    String name = scanner.nextLine();
                    packAnimals.commandsList(name);
                } catch (Exception e) {
                    System.out.println("Нет такого вьючного животного или допущена ошибка");
                }

            }
        } catch (Exception e) {
            System.out.println("Неверный выбор(((");
        }

    }

    public void addingNewCommand() {
        try {
            System.out.println("Выберите 1, если домашнее или 2, если вьючное животное: ");
            String choose = scanner.nextLine();
            if (choose.equals("1")) {
                try {
                    System.out.println("Полный список домашних животных: ");
                    showPetsList();
                    System.out.println("Введите имя животного из списка: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите новую команду:");
                    String command = scanner.nextLine();
                    packAnimals.addNewCommand(name, command);
                } catch (Exception e) {
                    System.out.println("Нет такого домашнего животного или допущена ошибка");
                }

            } else if (choose.equals("2")) {
                try {
                    System.out.println("Полный список вьючных животных: ");
                    packAnimals.showPackAnimals();
                    System.out.println("Введите имя животного из списка: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите новую команду:");
                    String command = scanner.nextLine();
                    packAnimals.addNewCommand(name, command);
                } catch (Exception e) {
                    System.out.println("Нет такого вьючного животного или допущена ошибка");
                }

            }
        } catch (Exception e) {
            System.out.println("Неверный выбор(((");
        }
    }

    public void showPetsList() {
        pets.showPets();
    }

    public void subMenuPets() {
        System.out.println("1. Полный список домашних жмвотных.");
        System.out.println("2. Список котов");
        System.out.println("3. Список собак");
        System.out.println("4. Список хомяков");
        System.out.println("5. Назад");
    }

    public void subMenuPackAnimals() {
        System.out.println("1. Полный список вьючных животных.");
        System.out.println("2. Список лошадей");
        System.out.println("3. Список верблюдов");
        System.out.println("4. Список ослов");
        System.out.println("5. Назад");
    }
}
