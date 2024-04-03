package com.itschool.course;

import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Boolean bool = boolMethod(); //= scanner.nextBoolean();
        System.out.println(bool);

        // folosesc wrapper cand am nevoie de metode
        int age = 20;
        Integer integer = 20; //= Integer.valueOf(20);

    }

    private static Boolean boolMethod() {
        return null;
    }
}
