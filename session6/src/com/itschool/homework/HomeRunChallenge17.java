package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge17 {
    public static void main(String[] args) {
        HomeRunChallenge17 home = new HomeRunChallenge17();
        home.challengeRun17();
    }

    public void challengeRun17() {
        Scanner input = new Scanner(System.in);
        System.out.println("hasUsername is true or false?");
        boolean hasUsername = input.nextBoolean();
        System.out.println("hasPassword is true or false?");
        boolean hasPassword = input.nextBoolean();
        if (hasUsername && hasPassword) {
            System.out.println("Authentification succesful");
        } else {
            System.out.println("Authentification failed");
        }
        if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}
