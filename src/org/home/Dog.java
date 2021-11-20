package org.home;

public class Dog extends Animal {

    public Dog(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    protected void say() {
        System.out.println("Гав");
    }
}
