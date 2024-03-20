package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge11 {
    public static void main(String[] args) {
        HomeRunChallenge11 home = new HomeRunChallenge11();
        home.challengeRun11();
    }

    public void challengeRun11() {
        Scanner input = new Scanner(System.in);
        int b;
        int average = 0;
        int counter = 0;
        do {
            System.out.println("Introdu un numar");
            b = input.nextInt();
            if (b != 0) {
                counter++;
                average = average + b;
            } else {
                break;
            }
        } while (b != 0);
        average = average / counter;
        System.out.println(average);
    }
}
