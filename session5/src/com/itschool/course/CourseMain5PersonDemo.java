package com.itschool.course;

public class CourseMain5PersonDemo {
    public static void main(String[] args) {
        // person este tipul
        // ionutz obiectul / ionut este un obiect de tip person
        Person ionutz = new Person();
        Person laura = new Person();
        Person maria = new Person();

        System.out.println(ionutz.getLastName());
        // age este int, primitivele nu pot fi nule
        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        ionutz.setFirstName("Ionutz");
        ionutz.setAge(32);
        ionutz.setCnp(194545456546L);

        System.out.println("Results after setting properties");
        System.out.println(ionutz.getFirstName());
        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        String ionutzFirstName = ionutz.getFirstName();
        System.out.println("Person's first name is: " + ionutzFirstName);


    }
}
