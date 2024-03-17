package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge6 {
    public static void main(String[] args) {
        HomeRunChallenge6 home = new HomeRunChallenge6();
        home.challengeRun6();
    }

    public void challengeRun6() {
        Scanner input = new Scanner(System.in);
        int b = 0;
        int addition = 0;
        while (b != -1) {
            System.out.println("Please insert numbers: ");
            int a = input.nextInt();
            b = a;
            addition += a;
        }
        System.out.println("The addition of the numbers inserted is: " + addition);
    }
}