package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge19 {
    public static void main(String[] args) {
        HomeRunChallenge19 home = new HomeRunChallenge19();
        home.challengeRun19();
    }

    public void challengeRun19() {
        Scanner input = new Scanner(System.in);
        System.out.println("Set an age:");
        int age = input.nextInt();
        if (age < 12) {
            System.out.println("Child");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        }
    }
}
