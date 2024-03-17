package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge4 {
    public static void main(String[] args) {
        HomeRunChallenge4 home = new HomeRunChallenge4();
        home.challengeRun4();
    }

    public void challengeRun4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String words = input.next();
        char[] wordsArray = words.toCharArray();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            System.out.print(wordsArray[i]);
        }
    }
}
