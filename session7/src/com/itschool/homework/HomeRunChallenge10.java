package com.itschool.homework;

import java.util.Scanner;

public class HomeRunChallenge10 {
    private int option;

    public static void main(String[] args) {
        HomeRunChallenge10 home = new HomeRunChallenge10();
        home.challengeRun10();
    }

    public void challengeRun10() {
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            chooseCase(input);
//            if (option == 3) {
//                break;
//            }
        } while (option!=3);
    }

    public void showMenu() {
        System.out.println("Please choose an option from:");
        System.out.println("1. Hello World");
        System.out.println("2. Give your Name");
        System.out.println("3. Exit");
    }

    public void chooseCase(Scanner input) {
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Hello World");
                break;
            case 2:
                System.out.println("What is your name:");
                String userName = input.next();
                System.out.println(userName);
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Choose again");
        }
    }
}
