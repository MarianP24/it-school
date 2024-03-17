package com.itschool.homework;

public class HomeRunChallenge8 {
    public static void main(String[] args) {
        HomeRunChallenge8 home = new HomeRunChallenge8();
        home.challengeRun8();
    }

    public void challengeRun8() {
        int n = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;
        for (int i = 0; i <= n; i++) {
            System.out.print(" " + firstNumber);
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
