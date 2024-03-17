package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge1 {
    public static void main(String[] args) {
        HomeRunChallenge1 home = new HomeRunChallenge1();
        home.challengeRun1();
    }

    public void challengeRun1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert an integer value: ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Your value is even");
        } else {
            System.out.println("Your value is odd");
        }
    }
}
