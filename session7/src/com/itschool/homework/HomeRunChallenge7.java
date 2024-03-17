package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge7 {
    public static void main(String[] args) {
        HomeRunChallenge7 home = new HomeRunChallenge7();
        home.challengeRun7();
    }

    public void challengeRun7() {
        Scanner input = new Scanner(System.in);
        int a = 20;
        int b;
        do {
            System.out.println("Ghiceste numarul");
            b = input.nextInt();
            if (b > a) {
                System.out.println("Mai ghiceste odata, numarul este prea mare");
                b = input.nextInt();
            } else if (b < a) {
                System.out.println("Mai ghiceste odata, numarul este prea mic");
                b = input.nextInt();
            } else {
                System.out.println("Ai ghicit numarul");
            }
        } while (b != a);
    }
}