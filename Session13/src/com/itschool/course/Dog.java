package com.itschool.course;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Dog azor = new Dog(); // mosteneste tot de la superclasa
        //azor.age = 12; //does not work
        azor.setName("Azor");

        System.out.println(azor.getName());
        azor.eat();
        azor.sleep();
        azor.finalMethod();

        System.out.println("==========");
        Animal animal = new Animal();
        animal.setName("Bobby");
        System.out.println(animal.getName());
        animal.eat();

        System.out.println("============");
        //"cainele este un animal si nu animalul este un caine"
        // does not work Dog puffy = new Animal();
        Animal dog = new Dog(); // new animal(); // doar metodele din superclasa
        dog.eat();
        Animal.staticMethod();
        Dog.staticMethod();
        //dog.sleep(); // in clasa animal nu am metoda sleep

    }

    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The animal that is eating is a dog");
    }

    @Override
    protected Dog getAnimal() {
        return this;
    }

    //static nu depinde de instanta de aia nu pot face override la metode statice
    protected static void staticMethod() {
        System.out.println("Dog's static method");
    }

//    @Override
//    protected final String finalMethod() {
//        return "dogFinalMethod";
//    }
    
}
