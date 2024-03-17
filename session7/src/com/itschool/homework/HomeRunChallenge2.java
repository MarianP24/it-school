package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge2 {
    public static void main(String[] args) {
        HomeRunChallenge2 home = new HomeRunChallenge2();
        home.chalengeRun2();
    }

    public void chalengeRun2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number between 1 and 12: ");
        int a = input.nextInt();
        switch (a) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Octomber");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Month");
        }
    }
}
