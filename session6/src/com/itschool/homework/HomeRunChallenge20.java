package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge20 {
    public static void main(String[] args) {
        HomeRunChallenge20 home = new HomeRunChallenge20();
        home.challengeRun20();
    }

    public void challengeRun20() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a value a: ");
        int a = input.nextInt();
        System.out.println("Give a value b: ");
        int b = input.nextInt();
        System.out.println("Give a value c: ");
        int c = input.nextInt();
        int largestNumber = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(largestNumber);
    }
}
