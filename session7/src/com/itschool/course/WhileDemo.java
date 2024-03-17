package com.itschool.course;

public class WhileDemo {
    public static void main(String[] args) {
        int number = 30;
//        while (number < 10){
//            System.out.println("the number is: " + number);
//            number ++;
//        }

        System.out.println("=========END=======");

        do {
            System.out.println("the number is from do-while: " + number);
            number ++;
        } while (number < 10);

        System.out.println("======END=======");
    }
}
