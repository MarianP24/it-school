package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge12 {
    public static void main(String[] args) {
        HomeRunChallenge12 home = new HomeRunChallenge12();
        home.challengeRun12();
    }

    public void challengeRun12() {
        Scanner input = new Scanner(System.in);
        System.out.println("Te rog introdu 10 numere");
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] <= 5) {
                continue;
            }
            sum += array[i];
        }
        System.out.println(sum);
    }
}
