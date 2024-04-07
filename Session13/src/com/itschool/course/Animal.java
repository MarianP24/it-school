package com.itschool.course;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
        System.out.println("zzzz");
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

    protected void eat() {
        System.out.println("The animal is eating");
    }

    protected Animal getAnimal() {
        return this;
    }

    protected static void staticMethod() {
        System.out.println("animals static method");
    }

    protected final String finalMethod() {
        return "finalMethod";
    }

}
