package org.home;

public class Animal {

    private String name;

    private int age;

    private double weight;

    private String color;

    public Animal() {
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    protected void say() {
        System.out.println("Я говорю");
    }

    protected void go() {
        System.out.println("Я иду");
    }

    protected void drink() {
        System.out.println("Я пью");
    }

    protected void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name
                + ", мне " + age + " " + numToAge(age)
                + ", я вешу - " + weight + " кг"
                + ", мой цвет - " + color;
    }

    private String numToAge(int age) {
        age = age % 100;
        if (age > 19) {
            age = age % 10;
        }
        switch (age) {
            case 1: {
                return "год";
            }
            case 2:
            case 3:
            case 4:
                return "года";
            default:
                return "лет";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
