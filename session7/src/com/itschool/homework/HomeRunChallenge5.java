package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge5 {
    public static void main(String[] args) {
        HomeRunChallenge5 home = new HomeRunChallenge5();
        home.challengeRun5();
    }

    public void challengeRun5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a value for n numbers");
        int n = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
