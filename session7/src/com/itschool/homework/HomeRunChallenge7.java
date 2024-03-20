package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge7 {

    public static void main(String[] args) {
        HomeRunChallenge7 home = new HomeRunChallenge7();
        home.challengeRun7();
    }

    public void challengeRun7() {
        final int LUCKY_NUMBER = 20;
        Scanner input = new Scanner(System.in);
        int b;

        do {
            System.out.println("Ghiceste numarul");
            b = input.nextInt();
            if (b > LUCKY_NUMBER) {
                System.out.println("Mai ghiceste odata, numarul este prea mare");
            } else if (b < LUCKY_NUMBER) {
                System.out.println("Mai ghiceste odata, numarul este prea mic");
            } else {
                System.out.println("Ai ghicit numarul");
            }
        } while (b != LUCKY_NUMBER);
    }
}