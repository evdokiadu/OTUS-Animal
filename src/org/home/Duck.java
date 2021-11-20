package org.home;

public class Duck extends Animal implements Flying {

    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    protected void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
