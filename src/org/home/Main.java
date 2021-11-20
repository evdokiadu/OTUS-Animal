package org.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите одну из следующих команд: add/list/exit");
            String command = scanner.nextLine();
            switch (MenuCommand.valueOf(command.toUpperCase().trim())) {
                case ADD:
                    System.out.println("Какое животное? cat/dog/duck");
                    String chosenAnimal = scanner.nextLine();
                    System.out.println("Какие имя, возраст, вес, цвет?");
                    String[] animalValues = scanner.nextLine().split(", ");
                    if (chosenAnimal.equalsIgnoreCase("cat")) {
                        Cat cat = new Cat(
                                animalValues[0],
                                Integer.parseInt(animalValues[1]),
                                Double.parseDouble(animalValues[2]),
                                animalValues[3]
                        );
                        animals.add(cat);
                        cat.say();
                    } else if (chosenAnimal.equalsIgnoreCase("dog")) {
                        Dog dog = new Dog(
                                animalValues[0],
                                Integer.parseInt(animalValues[1]),
                                Double.parseDouble(animalValues[2]),
                                animalValues[3]
                        );
                        animals.add(dog);
                        dog.say();
                    } else if (chosenAnimal.equalsIgnoreCase("duck")) {
                        Duck duck = new Duck(
                                animalValues[0],
                                Integer.parseInt(animalValues[1]),
                                Double.parseDouble(animalValues[2]),
                                animalValues[3]
                        );
                        animals.add(duck);
                        duck.say();
                    } else {
                        Animal animal = new Animal(
                                animalValues[0],
                                Integer.parseInt(animalValues[1]),
                                Double.parseDouble(animalValues[2]),
                                animalValues[3]
                        );
                        animals.add(animal);
                        animal.say();
                    }
                    break;
                case LIST:
                    for (Animal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                case EXIT:
                    flag = false;
            }
        }
    }
}
